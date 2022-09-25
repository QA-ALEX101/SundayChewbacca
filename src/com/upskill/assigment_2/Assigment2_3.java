package com.upskill.assigment_2;

public class Assigment2_3 {

	public static void main(String[] args) {
		if ( value1() == value2()){
			System.out.println("Value 1 is equal to Value 2");
		}
		if ( value1() > value2()){
			System.out.println("Value 1 is greater than Value 2");
		}
		else{
			System.out.println("Value 2 is greater than value 1");
		}
	}
	public static int value1(){
		return 5;
	}
	public static int value2(){
		return 10;
	}
   
}
