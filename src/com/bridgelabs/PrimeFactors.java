/****************************************************************
 * Purpose :To find the prime factors of entered number.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking user input.
		System.out.println("Enter the number to find the prime factors: ");
		int num = sc.nextInt();

		System.out.println("Prime factors of " + num + " are:");
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
				num = num / i;
			}
		}
		sc.close();

	}

}
