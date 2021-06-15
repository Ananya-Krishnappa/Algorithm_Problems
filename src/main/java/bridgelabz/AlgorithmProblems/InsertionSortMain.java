package bridgelabz.AlgorithmProblems;

public class InsertionSortMain {
	public static void main(String args[]) {
		String arr[] = { "zello", "bi", "how", "are" };
		InsertionSort<String> ob = new InsertionSort<String>();
		ob.sort(arr);
		ob.printArray(arr);
	}
}
