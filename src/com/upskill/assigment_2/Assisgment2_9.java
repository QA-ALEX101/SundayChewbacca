package com.upskill.assigment_2;

public class Assisgment2_9 {
	/* Write a program to swap two string 
	 * variables (Talen, Tech) and display
	 * result on the screen. */
	public static void main(String[] args) {
		myMethod();

	}
	public static void myMethod(){
		String a = "Talen";
	    String b = "Tech";
	    
	    String swap = a;
	    a=b;
	    b= swap;
	    
	    System.out.println("swap value a: "+ a);
	    System.out.println("Swap value b: "+ b);
	}

}
