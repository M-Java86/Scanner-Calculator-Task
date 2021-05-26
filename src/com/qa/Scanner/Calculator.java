package com.qa.Scanner;

import java.util.Scanner;

public class Calculator {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		start();

		closeScanner();

		System.out.println("Enter a Number value: ");
		String input1 = scanner.nextLine();
		System.out.println("Enter a Number value: ");
		String input2 = scanner.nextLine();

		Double.parseDouble(input1);
		Double.parseDouble(input2);

		System.out.print("Choose an Operation (+ - * /): ");
		String input3 = scanner.nextLine();

		int double1 = 0;
		int double2 = 0;
		double resultAdd = double1 + double2;
		double resultSub = double1 - double2;
		double resultMul = double1 * double2;
		double resultDiv = double1 / double2;

		switch (input3) {
		case "+":
			System.out.println("The numeric value is " + resultAdd);
			break;

		case "-":
			System.out.println("The numeric value is" + resultSub);
			break;

		case "*":
			System.out.println("The numeric value is" + resultMul);

		case " /":
			System.out.print("The numeric value is" + resultDiv);
			break;
		}

	}

	private static void start() {
		// TODO Auto-generated method stub

	}

	// private static void close() {
	// TODO Auto-generated method stub

	// }

	private static void closeScanner() {
		// TODO Auto-generated method stub

	}

	public class Calculator2 {
	
	//}
		public void main1(String[] args) {
			
			
			do // do while, is for many operations
				
				try 
			{
					
				System.out.println("Enter num1 and num2 : ");
				Scanner num1 = new Scanner(null);
				Scanner num2 = new Scanner(null);
				System.out.println("Enter sign : ");
				Scanner sign = new Scanner();
				
			}
			
			catch(IllegalAccessException ex) // will check for illegal inputs
			{
				System.out.println(ex.getMessage()); // this will print error message
		}	
		 char sign;
		int num1;
		int num2;
		if(sign == '+')
		 {	
			 System.out.println(num1+num2);
		 }
	
		if(sign == '*')
		{
			System.out.println(num1*num2);
		}
		
		if(sign == '/')
		{
			try
			{
				
				System.out.println(num1/num2); 
			}
			void Catch(ArithmeticException ex) 
			
			{
				System.out.println("Divde by Zero");
			}
		
		
		if(sign == 'x') // Exit
		{
			boolean flag = false;
		}
		
		else
		{
			System.out.println("Error : Unknown Operator\n");
		}
		
		}while(Flag == true); 
		
		}
		
	}
	

		
		
		
	
			
//Operations Goals
// -Addition
// - Subtraction
// - Division
// -Multiplication
// - Exit

//Scanner Task 
//Create a project that has four methods; addition, subtraction, multiplication, and division:

//All of these methods should take two numbers as parameters.
//Create a menu to ask the user which of the four methods they wish to use, then take the numbers as user input for the operation and output the result back to the user.

//Stretch Goal 
//Stretch goal: Using java -jar + maven, use the menu through the CLI.
