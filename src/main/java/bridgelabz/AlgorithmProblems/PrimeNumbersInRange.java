/**
 * Purpose:To print prime numbers in a given range
 * @author Ananya K
 * @version 1.0
 * @since 15/06/2021
 * 
 */
package bridgelabz.AlgorithmProblems;

import java.util.Scanner;

public class PrimeNumbersInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, i, j, flag;
		System.out.printf("Enter lower bound of the interval: ");
		a = sc.nextInt();
		System.out.printf("\nEnter upper bound of the interval: ");
		b = sc.nextInt();
		System.out.printf("\nPrime numbers between %d and %d are: ", a, b);
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
			if (flag == 1)
				System.out.println(i);
		}
	}
}
