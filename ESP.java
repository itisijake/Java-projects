/* program description: this program will pick a random 
 * number that will correspond with a color and ask the user to guess a color, the program will count 
 * the amount of times that the user guessed correctly, it will run 10 times before ending the program. 
 */

package jCourtneyMod4;

import java.util.Scanner;

public class ESP {

	//main method 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int correct = 0;
		
		//for loop to run 10 times 
		for (int i = 0; i < 10; i++) {
			
			// pick a random number 
			int picker = (int) (Math.random() * 5);
			
			// call the convert color method to apply the random number to the corresponding color 
			String color = convertColor(picker);
			
			//ask the user to pick a color 
			System.out.println("Pick a color! (Red, Green, Blue, Orange, or Yellow)");
			String guess = scan.nextLine();
			
			//call the check correct method to check if the user's guess was correct or not 
			boolean isCorrect = checkCorrect(guess, color);
			//accumulate the amount of times the user was correct. 
			if (isCorrect) {
				correct = correct + 1;
			}
			
			//call the print result method to output whether or not the guess was correct and output 
			//what the correct color was
			printResult(isCorrect, color);
		}
		
		//after the loop is done running 10x, let the user know how many times they were correct 
		System.out.println("");
		System.out.println("You guessed the color right " + correct + " times!");
		System.out.println("Exit Program");
		scan.close();
	}

	//convert color method to check the random number against the colors 
	public static String convertColor(int picker) {
	    if (picker == 0) {
	        return "Red";
	    } else if (picker == 1) {
	        return "Green";
	    } else if (picker == 2) {
	        return "Blue";
	    } else if (picker == 3) {
	        return "Orange";
	    } else{
	        return "Yellow";
	    }
	}
	
	//check correct method to check the user's guesses
	public static boolean checkCorrect(String guess, String color) {
		return guess.equalsIgnoreCase(color);
	}

	//print result method to output the results of each guess 
	public static void printResult(boolean isCorrect, String color) {
		if (isCorrect) {
			System.out.println("You guessed correct!");
		} else {
			System.out.println("You guessed incorrect.");
		}
		System.out.println("The color was " + color);
	}
}
