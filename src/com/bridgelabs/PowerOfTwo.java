/****************************************************************
 * Purpose : To find the powers of two that are less than equal to N.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking user input for value of N.
		System.out.println("Enter the value of N");

		int N = sc.nextInt();

		System.out.println("Powers of two till " + N + " are: ");
		int power_of_two = 1;
		
		// Checking if user has entered correct number.
		if (N > 0 && N < 31) {
			for (int i = 1; i <= N; i++) {
				power_of_two = 2 * power_of_two;
				System.out.println(power_of_two);
			}
		} else {
			System.out.println("Enter number greater than 0 and less than 31");
		}
		sc.close();

	}

}
