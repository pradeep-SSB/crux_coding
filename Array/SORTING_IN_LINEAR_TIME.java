package Array;

import java.util.*;

// Problem statement: Given an array containing only 0s, 1s and 2s. Sort the array in linear time O(N) where N is the size of the array.
public class SORTING_IN_LINEAR_TIME {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}

		SORTING_IN_LINEAR_TIME_my(arr);
		SORTING_IN_LINEAR_TIME(arr);

		for (int x : arr) {
			System.out.println(x);
		}
	}

	public static int[] SORTING_IN_LINEAR_TIME_my(int[] arr) { // My way
		int count_0 = 0;
		int count_1 = 0;
		int count_2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count_0++;
			} else if (arr[i] == 1) {
				count_1++;
			} else {
				count_2++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (count_0 > 0) {
				arr[i] = 0;
				count_0--;
			} else if (count_1 > 0) {
				arr[i] = 1;
				count_1--;
			} else if (count_2 > 0) {
				arr[i] = 2;
				count_2--;
			}
		}

		return arr;

	}

//	Editorial
//	X
//	The solution to this algorithm will require 3 pointers to iterate throughout the array, swapping the necessary elements.
//
//	(1) Create a low pointer at the beginning of the array and a high pointer at the end of the array.
//	(2) Create a mid pointer that starts at the beginning of the array and iterates through each element.
//	(3) If the element at arr[mid] is a 2, then swap arr[mid] and arr[high] and decrease the high pointer by 1.
//	(4) If the element at arr[mid] is a 0, then swap arr[mid] and arr[low] and increase the low and mid pointers by 1.
//	(5) If the element at arr[mid] is a 1, don't swap anything and just increase the mid pointer by 1.

	public static int[] SORTING_IN_LINEAR_TIME(int[] arr) {

		int low = 0;
		int mid = 0;
		int high = arr.length - 1;

		while (mid < high) {
			if (arr[mid] == 0) {
				swap(arr, low, mid);
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else { // arr[mid]==2
				swap(arr, mid, high);
				high--;
			}

		}
		return arr;
	}

	public static void swap(int[] arr, int low, int high) {
		arr[low] = arr[low] - arr[high];
		arr[high] = arr[low] + arr[high];
		arr[low] = arr[high] - arr[low];

	}

}
