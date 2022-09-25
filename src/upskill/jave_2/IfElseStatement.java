package upskill.jave_2;

public class IfElseStatement {
	
	public static int age = 105;

	public static void main(String[] args) {
		conditionalStatement();
		}
   public static void conditionalStatement(){
   
   // If Else Statement
     if (age <13){
    	 System.out.println("You are a children");
     }else if (age>13 && age <18){
    	 System.out.println("You are a Teenager");
     }else if (age>65){
    	 // Nested If Else Statement
    	 if(age>100){
    		 System.out.println("You are hero");
    	 } else
  	     System.out.println("You are a Senior");
     }else 
         System.out.println("You are adult");
  
     }
    	 //test
     }
	
//	public static void
