package bridgelabz.AlgorithmProblems;

public class BubbleSortMain {
	public static void main(String args[]) {
		String arr[] = { "hi", "hello", "how", "are", "you" };
		BubbleSort<String> ob = new BubbleSort<String>();
		ob.bubbleSort(arr);
		System.out.println("Sorted array:");
		ob.printArray(arr);
	}
}
