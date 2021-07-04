/****************************************************************
 * Purpose : To find the largest among three numbers.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for three numbers.
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		
		// Finding the largest number.
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " is greatest among " + num2 + " and " + num3);
		}
		else if (num2>num1 && num2>num3) {
			System.out.println(num2 + " is greatest among " + num1 + " and " + num3);			
		}
		else {
			System.out.println(num3 + " is greatest among " + num1 + " and " + num2);
		}
		sc.close();

	}

}

