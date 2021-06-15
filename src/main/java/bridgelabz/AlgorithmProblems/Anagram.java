/**
 * Purpose:To check if two strings are anagram
 * @author Ananya K
 * @version 1.0
 * @since 15/06/2021
 * 
 */
package bridgelabz.AlgorithmProblems;

import java.util.Arrays;

public class Anagram {
	/**
	 * This method checks if two string are anagram.
	 * 
	 * @param str1 input first string
	 * @param str2 input second string
	 * @return
	 */
	public static boolean areAnagram(char[] str1, char[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;
		if (n1 != n2) {
			return false;
		}
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;
		return true;
	}

	public static void main(String args[]) {
		String s1 = "abcd";
		String s2 = "dcba";
		if (areAnagram(s1.toCharArray(), s2.toCharArray()))
			System.out.println("The two strings are" + " anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");
	}
}
