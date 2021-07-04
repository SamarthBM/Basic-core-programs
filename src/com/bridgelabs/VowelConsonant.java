/****************************************************************
 * Purpose : To check whether alphabet is vowel or consonant.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input.
		System.out.println("Enter a alphabet to check whether it is vowel or consonant: ");
		char ch = sc.next().charAt(0);
		
		// Checking if alphabet is vowel or consonant.
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Alphabet " + ch + " is a Vowel");
		} else {
			System.out.println("Alphabet " + ch + " is a Consonant");
		}
		sc.close();

	}

}
