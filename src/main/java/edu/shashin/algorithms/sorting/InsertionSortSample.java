package edu.shashin.algorithms.sorting;

public class InsertionSortSample {

	public static void insertion_sort(int A[], int n) {
		int numberOfMoves = 0;
		for (int i = 0; i < n; i++) {
			/*
			 * storing current element whose left side is checked for its correct position .
			 */

			int temp = A[i];
			int j = i;

			/*
			 * check whether the adjacent element in left side is greater or less than the
			 * current element.
			 */

			while (j > 0 && temp < A[j - 1]) {
				numberOfMoves++;
				// moving the left side element to one position forward.
				A[j] = A[j - 1];
				j = j - 1;

			}
			// moving current element to its correct position.
			A[j] = temp;
			printArray(A);
		}
		System.out.println(numberOfMoves);
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 5, 3, 7, 8, 6, 9, 10, 4, 11, 12 };
		// int[] arr = new int[] { 1, 2, 5, 3, 7, 8, 6, 4 };
		printArray(arr);
		insertion_sort(arr, arr.length);
		printArray(arr);
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
