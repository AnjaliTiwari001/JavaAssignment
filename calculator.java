package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		System.out.println("Which operation you want to perform?");
		Scanner sc = new Scanner(System.in);
		String operation = sc.next();
		System.out.println("Enter first number");
		int num1= sc.nextInt();
		System.out.println("Enter second number");
		int num2= sc.nextInt();
		
		if (operation.equalsIgnoreCase("addition")) {
			System.out.println(num1+num2);
		}
		else if (operation.equalsIgnoreCase("subtraction")) {
			System.out.println(num1-num2);
		}
		else if (operation.equalsIgnoreCase("multiplication")) {
			System.out.println(num1*num2);
		}
		else if (operation.equalsIgnoreCase("division")) {
			double div = num1/num2;
			System.out.println(div);
		}
		

	}

}
