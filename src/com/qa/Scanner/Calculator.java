package com.qa.Scanner;

import java.util.Scanner;

public class Calculator {
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args ) {
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
		
		switch(input3) {
		case "+":
			System.out.println("The numeric value is " + resultAdd);
			break;
			
		case "-":
			System.out.println("The numeric value is" + resultSub);
			break;
			
		case "*":
			System.out.println("The numeric value is" + resultMul);
			
		case " /":
			System.out.print("The numeric value is"  + resultDiv);
			break;
		}
		
	}

	private static void start() {
		// TODO Auto-generated method stub
		
	}

	//private static void close() {
		// TODO Auto-generated method stub
		
	//}

	private static void closeScanner() {
		// TODO Auto-generated method stub
		
	}

	public static class Calculator2 {
		
		public static void main(String[] args) {
		
			getInput("Enter a Number value");
				getInput("Enter a number value");
				
				getInput("Enter a number value");
					getInput("Enter a number value");
					
					getInt
			
		}

		private static String getInput(String string) {
			// TODO Auto-generated method stub
			return null;
		}

		
		//}
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

