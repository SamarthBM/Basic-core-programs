/****************************************************************
 * Purpose : To find the harmonic value till N.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class HarmonicValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking user input for value of N.
		System.out.println("Enter the value of N to find the harmonic value: ");

		int N = sc.nextInt();

		double harmonic_value = 1;

		// Checking if user has entered value greater than 0.
		if (N > 0) {
			for (double i = 1; i <= N; i++) {
				harmonic_value += (1 / i);
			}
		} else {
			System.out.println("Enter the number greater than 0");
		}
		System.out.println("Harmonic value till " + N + " is " + harmonic_value);
		sc.close();

	}

}
