package com.upskill.assigment_2;

import java.util.ArrayList;
import java.util.List;

public class Assigment2_6 {
	
	public static void main (String [] args){
		
		List<Integer> primeNumbers = new ArrayList<>();
		
		for (int numberToCheck = 2; numberToCheck <= 100; numberToCheck++){
		     
			boolean isPrime = true;
			for (int factor = 2; factor <= numberToCheck/2; factor++){
				 if (numberToCheck % factor == 0){
				isPrime= false;
					 break;	   
				 }
			}
		
	
		if (isPrime) {
			primeNumbers.add(numberToCheck);
		}
	}
	
	System.out.println("Prime numbers from 1 to 100 are");
	for (int number: primeNumbers) {
		System.out.println(number);
      }
 }
}

	

