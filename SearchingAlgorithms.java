package com.algorithms.pack1;

class LinearSearch {
	public static int LinearSearchAlgo(int[] a, int search) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				return i;
			}
		}
		return -1;
	}
}

class BinarySearch {
	public static int binarySearch(int[] a, int search) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (search == a[mid]) {
				return mid;
			} else if (search < a[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}

public class SearchingAlgorithms {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(LinearSearch.LinearSearchAlgo(a, 1));
		System.out.println(LinearSearch.LinearSearchAlgo(a, 10));
		System.out.println(BinarySearch.binarySearch(a, 1));

	}

}
