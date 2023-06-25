package _04_spot_the_error;

import java.util.Random;

public class FixTheRandom {

	// This program is supposed to get a random number between 5 and 10 and print a different message for each number.
	// BUT it's not working. If you don't believe me, try running it.
	// Change ONE line of code to fix this program.

	public static void main(String[] args) {
		
		Random random = new Random();
		int num = random.nextInt(10-5)+ 5;
				
		if (num == 5) {
			System.out.println("FIVE");
		} else if (num == 6) {
			System.out.println("SIX");
		} else if (num == 7) {
			System.out.println("SEVEN");
		} else if (num == 8) {
			System.out.println("EIGHT");
		} else if (num == 9) {
			System.out.println("NINE");
		} else if (num == 10) {
			System.out.println("TEN");
		}
	}
	
	
}
