package bridgelabz.AlgorithmProblems;

import java.util.Arrays;

public class MergeSortMain {
	public static void main(String[] args) {
		MergeSort<String> ms = new MergeSort<String>();
		String[] values = { "foo", "bar", "alice", "bob", "celine", "david" };
		ms.mergeSort(values, 0, values.length - 1);
		System.out.println("Result " + Arrays.toString(values));
	}
}
