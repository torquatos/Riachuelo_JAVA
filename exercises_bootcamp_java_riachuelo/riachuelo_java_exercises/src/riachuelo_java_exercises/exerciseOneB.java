/*this code is part of the exercise list from the Java Bootcamp 
 * offered By Riachuelo S/A and Dio.me
 *
 * Escreva um código que receba o tamanho do lado de um quadrado, 
 * calcule sua área e exiba na tela
 * fórmula: área=lado X lado
 * 
 * Write a code that will receive the dimension of the side of a square
 * make the operation to calculate the area of the square
 * formula : area = side x side
 **/

package riachuelo_java_exercises;

import java.util.*;
import java.math.*;

public class exerciseOneB {
	
	public static void main (String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("A square is a shape characterized by all its four sides having the same dimensions. \nWrite the size of one of the sides of a square, in cm: ");
		
		double side = scanner.nextDouble();
		double multiplyResult = (side*side);
		double resultPower = Math.pow(side, 2);
		
		String breakLine = System.lineSeparator();
		
		String textOne = "Due to a square be a special case of rectangle, it can have its area calculated by two different ways. \nOne way is multiplying side*side and the special case is the raising by power of 2";
		String textTwo = "So calculating it using the multiplication, it will be: " + side + "*" + side + " = " + multiplyResult + "cm²" + breakLine + "while the raising power of 2 is " + side + "² = " + resultPower + "cm²";
		String textThree = "The area of the square with its sides measuring " + side + " cm is " + resultPower + " cm²";
		
		System.out.println("A rectangle is caracterized by having four angles of 90º, with the paralel sides being, consequently, same sizes." + breakLine + "By knowing that, the area of a rectangle is calculated multiplying its high by its lengh, side*side" + breakLine + textOne + breakLine + textTwo);	
		System.out.println(textThree);
		
		//The disposal of the texts are not in a pattern exactly to explore all the possibilities to print them out
	}
}
