package edu.shashin.udemy.java.multithreading.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * source: https://www.udemy.com/java-multithreading/
 */
public class App {

	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newCachedThreadPool();

		for (int i = 0; i < 20; i++) { // 200 hundred times will be called
			executor.submit(new Runnable() {
				@Override
				public void run() {
					Connectionn.getInstance().connect();
				}
			});
		}

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.DAYS);
	}
}
