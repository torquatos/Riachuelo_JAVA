/*
 * Escreva um código que receba o nome e
 * a idade de 2 pessoas e imprima a diferença de idade entre elas
 * 
 * 
 * Write a code that will receive the name and the age of 2 different people.
 * Print on the screen the difference between their ages
 * */

package riachuelo_java_exercises;

import java.util.*;
import java.math.*;

public class exerciseOneD {
	
	public static void main (String[] args) {
		
		var scanner = new Scanner(System.in);
		
		String breakLine = System.lineSeparator();
		
		String textOne = "Insert the name and the age of two different people: " + breakLine;
		String textTwo = "Insert the name of the first person: " + breakLine;
		String textThree = "Insert the age of the first person: " + breakLine;
		String textFour = "Insert the name of the second person: " + breakLine;
		String textFive = "Insert the age of the second person: " + breakLine;
		
		System.out.println(textOne + breakLine + textTwo);		
		String personOneName = scanner.next();
		
		System.out.println(breakLine + textThree);
		int personOneAge = scanner.nextInt();
		
		System.out.println(breakLine + textFour);
		String personTwoName = scanner.next();
		
		System.out.println(breakLine + textFive);
		int personTwoAge = scanner.nextInt();
		
		double differenceAgeOne = (personOneAge - personTwoAge);
		double differenceAgeTwo = (personTwoAge - personOneAge);
		
		String textSix = "The difference, based on numbers that the age represents, resulted between " + personOneName + " minus " + personTwoName + " is " + differenceAgeOne + breakLine;
		String textSeven = "The difference , based on numbers that the age represents, resulted between " + personTwoName + " minus " + personOneName + " is " + differenceAgeTwo + breakLine;
		
		System.out.println(textSix + breakLine + textSeven + breakLine);
		
		if (personOneAge >= personTwoAge) {
			System.out.println("The difference between the ages, in itself, is " + differenceAgeOne + " years.");
		} else {
			System.out.println("The difference between the ages, in itself, is " + differenceAgeTwo + " years.");
			
		}
		
		
	}
	

}
