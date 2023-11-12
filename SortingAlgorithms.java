package com.algorithms.pack1;

class BubbleSort {
	public static void BubbleSortAlgo(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}

class SelectionSort {
	public static void SelectionSortAlgo(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[smallestIndex]) {
					smallestIndex = j;
				}
				int temp = a[i];
				a[i] = a[smallestIndex];
				a[smallestIndex] = temp;
			}
		}
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}

class InsertionSort {
	public static void InsertionSortAlgo(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j > -1 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}

class MergeSort {
	private static void MergeSortAlgo(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				k++;
				i++;
			} else {
				c[k] = b[j];
				k++;
				j++;
			}
		}
		while (i < a.length) {
			c[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			c[k++] = b[j++];
		}
	}

	public static void sort(int[] a) {
		if (a.length == 1)
			return;
		int[] left = new int[a.length / 2];
		int right[] = new int[a.length - left.length];
		for (int i = 0; i < left.length; i++) {
			left[i] = a[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = a[left.length + j];
		}
		sort(left);
		sort(right);
		MergeSortAlgo(left, right, a);
	}
}

class QuickSort {
	public static void QuickSortAlgo(int[] a, int start, int end) {
		if (start >= end)
			return;
		int i = start;
		int j = end;
		int pivot = a[(start + end) / 2];
		while (i <= j) {
			while (a[i] < pivot) {
				i++;
			}
			while (a[j] > pivot) {
				j--;
			}
			while (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		QuickSortAlgo(a, start, j);
		QuickSortAlgo(a, i, end);
	}
}

public class SortingAlgorithms {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 5, 1, 3 };
		BubbleSort.BubbleSortAlgo(a);
		SelectionSort.SelectionSortAlgo(a);
		InsertionSort.InsertionSortAlgo(a);
		MergeSort.sort(a);
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		QuickSort.QuickSortAlgo(a, 0, a.length - 1);
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

}
