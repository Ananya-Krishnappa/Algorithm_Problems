/**
 * Purpose: to find the prime numbers that are Anagram and Palindrome 

 * @author Ananya K
 * @version 1.0
 * @since 15/06/2021
 * 
 */
package bridgelabz.AlgorithmProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrimeNumberAnagramPalindrome {
	static Scanner sc = new Scanner(System.in);
	private static List<Integer> primeNumList = new ArrayList<Integer>();
	private static List<Integer> primeAndPalindrome = new ArrayList<Integer>();

	public static void main(String[] args) {
		int a, b;
		System.out.printf("Enter lower bound of the interval: ");
		a = sc.nextInt();
		System.out.printf("\nEnter upper bound of the interval: ");
		b = sc.nextInt();
		System.out.printf("\nPrime numbers between %d and %d are: ", a, b);
		primeNumbersInRange(a, b);
		primeAndPalindrome = primeNumList.stream().filter(prime -> isPalindrome(prime)).collect(Collectors.toList());
		System.out.println("Prime numbers which are palindrome:");
		System.out.println(primeAndPalindrome.toString());
	}

	/**
	 * This method checks the prime numbers in a range
	 * 
	 * @param a lower limit
	 * @param b upper limit
	 */
	private static void primeNumbersInRange(int a, int b) {
		int i, j, flag;
		for (i = a; i <= b; i++) {
			if (i == 1 || i == 0)
				continue;
			flag = 1;
			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.println(i);
				primeNumList.add(i);
			}
		}
	}

	/**
	 * A function that returns true only if num contains one digit
	 * 
	 * @param num
	 * @return
	 */
	private static boolean oneDigit(int num) {
		return (num >= 0 && num < 10);
	}

	/**
	 * A recursive function to find out whether num is palindrome or not.
	 * 
	 * @param num
	 * @param dupNum contains address of a copy of num
	 * @return
	 */
	private static boolean isPalUtil(int num, int dupNum) {
		if (oneDigit(num))
			return (num == (dupNum) % 10);

		if (!isPalUtil(num / 10, dupNum))
			return false;

		dupNum /= 10;
		return (num % 10 == (dupNum) % 10);
	}

	/**
	 * The method that uses recursive function isPalUtil() to find out whether num
	 * is palindrome or not
	 * 
	 * @param num
	 * @return num and dupNum
	 */
	private static boolean isPalindrome(int num) {
		if (num < 0)
			num = -num;
		int dupNum = num;
		return isPalUtil(num, dupNum);
	}
}
