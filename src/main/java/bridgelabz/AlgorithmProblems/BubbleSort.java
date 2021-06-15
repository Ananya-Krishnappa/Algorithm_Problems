/**
 * Purpose:To sort a number array
 * @author Ananya K
 * @version 1.0
 * @since 15/06/2021
 * 
 */
package bridgelabz.AlgorithmProblems;

public class BubbleSort<T extends Comparable<T>> {
	/**
	 * sort the array
	 * 
	 * @param arr of String
	 */
	public void bubbleSort(T arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	/**
	 * Prints the array
	 * 
	 * @param arr of number
	 */
	public void printArray(T[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
