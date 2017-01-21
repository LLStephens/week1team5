package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a series of Earth weights (space-separated):");
		String weights = input.nextLine();
		String[] weightStrings = weights.split(" ");
		
		
		for(int i = 0; i<weightStrings.length; i++) {
			Float weight = Float.parseFloat(weightStrings[i]);
			double marsValue = 0.378;
			System.out.println(weightStrings[i] + " lbs. on Earth, is " + (weight * marsValue)  + " lbs. on Mars");
			
			
		}
		
	}

}
