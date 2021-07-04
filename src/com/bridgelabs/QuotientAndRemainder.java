/****************************************************************
 * Purpose : To compute quotient and remainder.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking user input for Dividend and Divisor.
		System.out.println("Enter the value of Dividend: ");
		int dividend = sc.nextInt();

		System.out.println("Enter the value of Divisor: ");
		int divisor = sc.nextInt();

		// Computing to get quotient and remainder.
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is: " + remainder);
		sc.close();

	}

}
