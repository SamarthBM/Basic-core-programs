/****************************************************************
 * Purpose : To find the largest among three numbers.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class LargestNumber {
	
	// Method body to find the largest number.
	public static void CheckLargest(int x, int y, int z) {
		
		if(x>y && x>z) {
			System.out.println(x + " is greatest among " + y + " and " + z);
		}
		else if (y>x && y>z) {
			System.out.println(y + " is greatest among " + x + " and " + z);			
		}
		else {
			System.out.println(z + " is greatest among " + x + " and " + y);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for three numbers.
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		
		CheckLargest(num1, num2, num3);
		
		sc.close();

	}

}

