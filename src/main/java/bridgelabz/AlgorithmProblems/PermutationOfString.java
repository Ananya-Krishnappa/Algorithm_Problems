/**
 * Purpose:To find permutation of string
 * @author Ananya K
 * @version 1.0
 * @since 15/06/2021
 * 
 */
package bridgelabz.AlgorithmProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationOfString {
	public static void main(String[] args) {
		List<String> strArray = new ArrayList<String>();
		String str = "abb";
		System.out.println("String permutation using recursion");
		permutationRecursive("", str, strArray);
		Collections.sort(strArray);
		System.out.println(strArray);
		System.out.println();
		System.out.println("String permutation using iteration");
		List<String> strArrayIterative = permutationIterative(str);
		Collections.sort(strArrayIterative);
		System.out.println(strArrayIterative);
		boolean result = strArray.equals(strArrayIterative);
		System.out.println(result);
	}

	/**
	 * 
	 * @param strArray
	 * @param pass     the string to check permutation
	 * @param ans
	 */
	private static void permutationRecursive(String prefix, String remaining, List<String> strArray) {
		if (remaining.length() == 0) {
			strArray.add(prefix);
			return;
		}
		for (int i = 0; i < remaining.length(); i++) {
			permutationRecursive(prefix + remaining.charAt(i),
					remaining.substring(0, i) + remaining.substring(i + 1, remaining.length()), strArray);
		}
	}

	/**
	 * Iterative function to generate all permutations of a string
	 * 
	 * @param String s
	 * @return array list partial
	 */
	private static List<String> permutationIterative(String s) {
		List<String> partial = new ArrayList<>();
		partial.add(String.valueOf(s.charAt(0)));
		for (int i = 1; i < s.length(); i++) {
			for (int j = partial.size() - 1; j >= 0; j--) {
				String str = partial.remove(j);
				for (int k = 0; k <= str.length(); k++) {
					partial.add(str.substring(0, k) + s.charAt(i) + str.substring(k));
				}
			}
		}
		return partial;
	}

}
