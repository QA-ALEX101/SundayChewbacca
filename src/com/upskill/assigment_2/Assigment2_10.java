package com.upskill.assigment_2;

import java.util.Scanner;

/*Write a Java program to convert temperature
 from Fahrenheit to Celsius degree.  */
public class Assigment2_10 {

	public static void main(String[] args) {
		Scanner user_input = new Scanner (System.in);
		float f;
		double cel;
		System.out.println("Enter the Degree Fahrenheit: ");
		f = user_input.nextFloat();
		cel = (f-32)/1.8;
    	
    	System.out.println("Fahrenheit is : "+ f );
    	System.out.println("celsius is :"+ cel);
    }
}
