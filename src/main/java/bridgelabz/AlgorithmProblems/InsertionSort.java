/**
 * Purpose:To sort words in string array
 * @author Ananya K
 * @version 1.0
 * @since 15/06/2021
 * 
 */
package bridgelabz.AlgorithmProblems;

public class InsertionSort<T extends Comparable<T>> {
	/**
	 * This method sorts the array containing string
	 * 
	 * @param arr which contains list of string
	 */
	public void sort(T[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			T key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/**
	 * A utility function to print array of size n
	 * 
	 * @param arr which contains list of string
	 */
	public void printArray(T arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
