package com.qa.Scanner;


import java.util.Scanner;

public class Calculator {

	public static Scanner scanner = new Scanner(System.in);
	
	//@SuppressWarnings("resource")
	public static void main(String[] args ) {
		
		
		
		
		double int1, int2;
			System.out.println("Enter first number:");
			
			//using data type double so that user can 
			//enter integer as well as floating point value. 
		
		
		double int1 = scanner.nextDouble();
		System.out.println("Enter second number:");
		 double int2 = scanner.nextDouble();
		
		
		System.out.println("Enter an operator (+, -, *, /): ");
		char operator1 = scanner.nextLine().charAt(0);
		
		scanner.close();
		double output;
		
		
		
			switch(operator1)
			{
			
			case '+':
		
				 output = operator1 +  operator1;
				break;
		
		
			case '-':
				 output = operator1 - operator1;
				break;
				
			 
			case  '*':
				 output = operator1 * operator1;
				 
			
			case '/':
				output = operator1 / operator1;
				break;
				
			dafault:
				System.out.println("You have entered the wrong operator");
			
		
		
	}
			
		System.out.println(num1+" "operator+" "+operator1+ +"+num2": "+output");
			
	}
	
}
			
	

	
		
		


		




//Operations Goals
		// -Addition 
		// - Subtraction 
		//- Division
		// -Multiplication
		// - Exit

//Scanner Task 
//Create a project that has four methods; addition, subtraction, multiplication, and division:

//All of these methods should take two numbers as parameters.
//Create a menu to ask the user which of the four methods they wish to use, then take the numbers as user input for the operation and output the result back to the user.


//Stretch Goal 
//Stretch goal: Using java -jar + maven, use the menu through the CLI.

