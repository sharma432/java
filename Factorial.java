package ifelse;

import java.util.Scanner;

public class Factorial {
	

	public static void main(String[] args) { 
		int number = 0;
    do { System.out.println("enter a number :");
		
    	Scanner scanner = new Scanner(System.in);
		
		 number = scanner.nextInt();
		 if (number >= 0) {
			 int fact=1 ; 
			 for ( int i=1 ; i<= number ; i++)
			 {fact = fact * i;} 
			 System.out.println("Factorial of"+ number + "is:"  + fact);
		 } else { 
			 System.out.println(" Number is invalid");
		 }
    }
    while ( number >= 0);
	
	
		
		// TODO Auto-generated method stub

		 
		 

	
	
		// TODO Auto-generated method stub
		
	}
	}
