/*
Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela

fórmula: área=base X altura

Write a code that will receive the base and the hight of a rectangle and make the calculation of its area

formula: area = base * high
*/

package riachuelo_java_exercises;

import java.util.*;
import java.math.*;

public class exerciseOneC {

  public static void main (String[] args) {
    
    var scanner = new Scanner(System.in);
    
    System.out.println("Insert the base of your rectangle in centimeters: ");
    
    double base = scanner.nextDouble();

    System.out.println("Insert the hight of your rectangle in centimeters: ");

    double hight = scanner.nextDouble();

    double areaResult = (base * hight);

    String breakLine = System.lineSeparator();

    System.out.println("For a rectangle which dimensions are " + base + " cm of base and " + hight + " cm of hight, " + breakLine + " its area is " + areaResult + " cm².");
     
  }
  
}
