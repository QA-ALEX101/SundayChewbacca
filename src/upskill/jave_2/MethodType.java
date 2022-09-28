package upskill.jave_2;

public class MethodType {
	
	/* Types of Method 001
	 
	 1. Void Method
	 2. Static Method
	 3. Return type Method  */
	
    public static int hourlyIncome= 65;
    
    
    
	  public static void main(String[] args) {
	  MethodType obj = new MethodType();
	  obj.annualIncomeVoid();
	  weeklyIncomeStatic();
	  System.out.println ("My Monthly Income =" + obj.monthlyIncomeReturn ());
	  //second attempt22222
	}
	  //void method
	  public void annualIncomeVoid(){
	    int annualIncome = hourlyIncome * 4000;
	    System.out.println ("my Annual Income =" + annualIncome);
	  }
	 
     //void method
	    public static void weeklyIncomeStatic(){
	    	int  weeklyIncome = hourlyIncome * 40;
	    	System.out.println ("My weely Income =" +weeklyIncome); 
	    }
		 
     //Return type method
	    public int monthlyIncomeReturn(){
	    	int monthlyIncome= hourlyIncome * 180;
	    	return monthlyIncome;
	    	
	    
	    }
	    
	}


