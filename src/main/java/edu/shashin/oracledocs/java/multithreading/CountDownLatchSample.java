package edu.shashin.oracledocs.java.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/*
 * source:
 * https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/CountDownLatch
 * .html
 */
public class CountDownLatchSample {
	public static void main(String[] args) {
		Driver2 driver2 = new Driver2();
		driver2.main();
	}
}

class Driver2 {
	private static final int N = 10;

	void main() {
		CountDownLatch doneSignal = new CountDownLatch(N);
		Executor e = Executors.newFixedThreadPool(N);

		for (int i = 0; i < N; ++i) {
			WorkerRunnable worker = new WorkerRunnable(doneSignal, i);
			e.execute(worker);
		}

		System.out.println("await() " + doneSignal.getCount());
		try {
			doneSignal.await();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		System.out.println("after await() " + doneSignal.getCount());
	}
}

class WorkerRunnable implements Runnable {
	private final CountDownLatch doneSignal;
	private final int i;

	WorkerRunnable(CountDownLatch doneSignal, int i) {
		this.doneSignal = doneSignal;
		this.i = i;
	}

	@Override
	public void run() {
		try {
			doWork(i);
			doneSignal.countDown();
		} catch (InterruptedException ex) {
		}
	}

	void doWork(int i) throws InterruptedException {
		System.out.println("doing work " + i);
		Thread.sleep(1000);
		System.out.println("finished doing work " + i);
	}
}
