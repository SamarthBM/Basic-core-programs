/****************************************************************
 * Purpose : To swap two numbers.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for two numbers to be swapped.
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		// Swapping two numbers.
		int c = a; 
		a=b;
		b=c;
		
		System.out.println("First number is swapped to second number " + a);
		System.out.println("Second number is swapped to first number " + b);
		sc.close();
	}

}

