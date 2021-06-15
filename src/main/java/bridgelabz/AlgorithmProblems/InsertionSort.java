/**
 * Purpose:To sort words in string array
 * @author Ananya K
 * @version 1.0
 * @since 15/06/2021
 * 
 */
package bridgelabz.AlgorithmProblems;

public class InsertionSort {
	/**
	 * This method sorts the array containing string
	 * 
	 * @param arr which contains list of string
	 */
	public void sort(String[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			String key = arr[i];
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
	static void printArray(String arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[]) {
		String arr[] = { "zello", "bi", "how", "are" };
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);
		printArray(arr);
	}
}
