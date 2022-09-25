package com.upskill.java_3;

public class Loops {
	
	/* 	
 	Type of Loops
  		1. For Loop
  		2. While Loop
  		3. Do While Loop
  		4. Infinite Loop
 */
	
	public static void main(String[] args) {
//		practiceForLoop();
	//	practiceWhileLoop();
    //practiceDoWhileLoop();
	//	practiceInfiniteLoop();
		practiceNestedLoop();
		
	}
	
	public static void practiceForLoop(){							//For Loop - Do again and again upto upper limit
		int i;														//Initialize the variable
		for (i = 1; i <= 10; i++){									//Setting lower limit, Upper limit, Increment or decrement
			System.out.println("For Loops Number = " + i);			//Statement		
		}
	}
	
	public static void practiceWhileLoop(){							//While Loop - Do again and again upto condition match
		int i = 1;													//Initializing variables
		while(i<=10){												//Setting condition
			System.out.println("While Loops Number = " + i);		//Statement
			i++;													//Increment or decrement
		}
	}

	
	public static void practiceDoWhileLoop(){
		int i = 1;
	    do{
	    		System.out.println("Do While Loop Number ="  +i);
		    	i++;
	}while (i<=10); 
	
	}


	public static void practiceInfiniteLoop(){

		int i;
		for (i= 1; ;i++){
			System.out.println("For Loops Number ="+ i);
		}
	}
	
	
	public static void practiceNestedLoop(){
		int i;
		int j;
		for (i=1; i<=10;i++){
			for(j=1; j <=10; j++){
				int multiplicationTable= i * j;
				System.out.print(multiplicationTable +" ");
			}
			System.out.println(" ");
				
			}
		}
		
	}
	