package switchcase;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		System.out.println("Enter the operation");
		Scanner scn = new Scanner(System.in);
		char operation= scn.next().charAt(0);
		System.out.println("Enter the numbers");
		int num1 = scn.nextInt();
		int num2 =scn.nextInt();
		
//		switch(operation)
//		{
//		
//		case '+':
//			System.out.println(num1+num2);
//			break;
//		
//		case '-':
//			System.out.println(num1-num2);
//			break;
//			
//		case '*':
//			System.out.println(num1*num2);
//			break;
//			
//		case '/':
//			System.out.println(num1/num2);
//			break;
//		
//		default:
//			System.out.println("I am not implemented");
//		}
		
		
		int small= (num1>num2)?num2:num1;  //if num2 is small assign num2 or assign num1
		System.out.println(small);
		

	}

}
