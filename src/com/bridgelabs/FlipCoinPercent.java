/****************************************************************
 * Purpose : To flip the coin and compute the percentage of heads and tails.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class FlipCoinPercent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of times the coin to be tossed: ");

		int toss = sc.nextInt();
		
		// Initializing variables to count heads and tails.
		int head_toss = 0;
		int tail_toss = 0;
		
		// Tossing the coin till the user input.
		for (int i = 1; i <= toss; i++) {

			if (Math.random() < 0.5) {
				System.out.println("You got tails");
				tail_toss++;
			} 
			else {
				System.out.println("You got heads");
				head_toss++;
			}

		}
		
		// Computing the percentage of heads and tails.
		int tail_percent = (tail_toss * 100) / toss;
		int head_percent = (head_toss * 100) / toss;
		System.out.println("Percentage of tails is: " + tail_percent + "%");
		System.out.println("Percentage of heads: " + head_percent + "%");
		System.out.println("Total number of tails: " + tail_toss);
		System.out.println("Total number of heads: " + head_toss);
		sc.close();

	}

}
