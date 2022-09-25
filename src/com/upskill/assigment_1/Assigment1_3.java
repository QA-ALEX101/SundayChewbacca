package com.upskill.assigment_1;

public class Assigment1_3 {

		/* A function which returns the multiply value of a and b where a = 9 and b = 11. 
		Write a program which will display addition of a +b + function returns value*/

	public static void main(String[] args) {
		
		int a = 9;
		int b = 11;
		int multiplicationValue = multiplyFuntion(a,b);
		
		System.out.println("The result is : " + (a+b+multiplicationValue));
	}
	public static int multiplyFuntion(int a, int b){
		return a*b;		
	}

}
