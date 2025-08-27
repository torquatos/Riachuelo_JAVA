/*this code is part of the exercise list from the Java Bootcamp 
 * offered By Riachuelo S/A and Dio.me
 * 
 * Escreva um código que receba o nome e o ano de nascimento de alguém e 
 * imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 * 
 * Write a code that will receive the name and the year of birth of the user and
 * print in the screen the following message: "Hello 'name', you're 'age' years old"
*/

package riachuelo_java_exercises;

import java.util.*;

public class exerciseOneA {
	
	public static void main (String[] args) {
		var nameScanner = new Scanner (System.in);
		System.out.println("Insert your name: ");
		var name = nameScanner.next();
		
		var ageScanner = new Scanner (System.in);
		System.out.println("Insert your age: ");
		var age = ageScanner.nextInt();
		
		System.out.println("Hello " + name + ", you're " + age + " years old");
	}

}
