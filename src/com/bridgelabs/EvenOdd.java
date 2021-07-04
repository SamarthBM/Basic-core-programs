/****************************************************************
 * Purpose : To check whether entered numbers is even or odd.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class EvenOdd {

	// Method to check for even and odd
	public static void EvenOddCheck(int num) {
		if (num % 2 == 0) {
			System.out.println("It is even");
		} else {
			System.out.println("It is odd");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking user input of number to check for even and odd.
		System.out.println("Enter the number to check whether it is even or odd: ");
		int num = sc.nextInt();
		EvenOddCheck(num);
		sc.close();
	}

}
