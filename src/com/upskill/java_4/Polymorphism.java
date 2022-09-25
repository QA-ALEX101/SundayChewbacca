package com.upskill.java_4;

public class Polymorphism {
	

	public static void main(String[] args) {
		car();
		car(4);
		car(2,4);
		car("Pink");
	
    }
    
	public static void car(){
		System.out.println("My car is Audi");
	}
	
	public static void car(int door){
		System.out.println("My car is Audi, it has door:" + door);
	
	}
	
	public static void car(int door, int wheel){
		System.out.println("My car is Audi, it has door :" + door + " it has wheel:" + wheel);
	}
	public static void car (String color){
		System.out.println("My car is Audi, it has color:" + color);
	}
}
