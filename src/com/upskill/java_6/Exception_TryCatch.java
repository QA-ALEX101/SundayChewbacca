package com.upskill.java_6;

public class Exception_TryCatch {
	/*Java Exceptions - Use "try - catch - finally"

A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations


ArithmeticException - error has occurred in an arithmetic operation.
ArrayIndexOutOfBoundsException -  an array has been accessed with illegal index.
ClassNotFoundException - try to access a class whose definition is not found
FileNotFoundException - a file is not accessible or does not open.
IOException - input-output operation failed or interrupted
InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.
NoSuchFieldException - class does not contain the field or variable specified
NoSuchMethodException - accessing a method which is not found
NullPointerException - referring to the members of a null object
NumberFormatException  -  a method could not convert a string into a numeric format
RuntimeException - any exception which occurs during runtime.
StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string


B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java */

	public static void main(String[] args) {
		//Build - in Excecptions - Array
	try {
		int [] ageChewbacca = new int []{ 25, 26, 60 ,45,55, 35};
		System.out.println("Student Age :" + ageChewbacca[6]);
	} catch (Exception e){
		System.out.println( "Array Index not available");
		e.printStackTrace();
	}

	// Specific Built -in Expectation - NumberformatException
	try {
		int num = Integer.parseInt ("Test");
		System.out.println("Value of num int = " + num);
	} catch (NumberFormatException e){
		System.out.println( "Please enter a valid number");
		e.printStackTrace();
	}
	//User Define Exception
	try {
		throw new myException("Test");
	}catch (myException e){
		System.out.println("User Defined Exception");
		e.printStackTrace();
	}
	finally {
		System.out.println("Test Execution Completed");
	}
	
	}
}
