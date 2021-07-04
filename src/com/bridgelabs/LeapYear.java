/****************************************************************
 * Purpose : To check whether the entered year is leap year or not.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;
public class LeapYear {
	
	public static boolean leapCheck(int y) {
		
		if(y%4==0) {
			System.out.println("Leap year");
			return true;
		}
		else if (y%100==0) {
			System.out.println("Not a leap Year");	
			return false;
		}
		else if (y%400==0) {
			System.out.println("Leap year");
			return true;
		}
		else {
			System.out.println("Not a leap Year");
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the year to check for leap year: ");
		int year = sc.nextInt();
		
		if(year > 999 && year < 10000) {
			System.out.println(leapCheck(year));
		}
		else {
			System.out.println("Enter a valid year");
		}
		
		sc.close();
	}

}

