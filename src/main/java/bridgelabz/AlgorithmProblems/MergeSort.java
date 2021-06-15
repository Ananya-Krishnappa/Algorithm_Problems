/**
 * Purpose:To sort a number array
 * @author Ananya K
 * @version 1.0
 * @since 15/06/2021
 * 
 */
package bridgelabz.AlgorithmProblems;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		String[] values = { "foo", "bar", "alice", "bob", "celine", "david" };
		mergeSort(values, 0, values.length - 1);
		System.out.println("Result " + Arrays.toString(values));
	}

	/**
	 * sorting an array of string
	 * 
	 * @param a
	 * @param from
	 * @param to
	 */
	private static void mergeSort(String[] a, int from, int to) {
		if (from == to) {
			return;
		}
		int mid = (from + to) / 2;
		mergeSort(a, from, mid);
		mergeSort(a, mid + 1, to);
		merge(a, from, mid, to);
	}

	/**
	 * Merging array
	 * 
	 * @param a
	 * @param from
	 * @param mid
	 * @param to
	 */
	private static void merge(String[] a, int from, int mid, int to) {
		int n = to - from + 1;
		String[] b = new String[n];
		int i1 = from;
		int i2 = mid + 1;
		int j = 0; //
		while (i1 <= mid && i2 <= to) {
			if (a[i1].compareTo(a[i2]) < 0) {
				b[j] = a[i1];
				i1++;
			} else {
				b[j] = a[i2];
				i2++;
			}
			j++;
		}
		while (i1 <= mid) {
			b[j] = a[i1];
			i1++;
			j++;
		}
		while (i2 <= to) {
			b[j] = a[i2];
			i2++;
			j++;
		}
		for (j = 0; j < n; j++) {
			a[from + j] = b[j];
		}
	}
}
