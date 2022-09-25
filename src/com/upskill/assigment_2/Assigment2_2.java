package com.upskill.assigment_2;

public class Assigment2_2 {
	
	public static void main (String [] args){
		
		int Grade = 99	;			
		DisplayGrades(Grade);
    
	}
	public static void DisplayGrades(int Grade){
		if (Grade >= 90) {
			System.out.println("A");
		}
		else if ( Grade >=80){
				System.out.println("B");
		}
		else if (Grade >=70) {
			System.out.println("C");
		}
		else if (Grade >=60){
			System.out.println("D");
		}
		else{
			System.out.println("Fail");
		}		
	}
}

	


