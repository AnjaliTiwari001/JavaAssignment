package inputFromUserArrays;

import java.util.Scanner;

public class inputFromUserArrays {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int myarray [] = new int[n];
	int sum=0;
	System.out.println("Enter the marks of students in 1 subject");
	for (int i=0;i<n;i++)
	{
		myarray[i] = sc.nextInt();
	}

	
	System.out.println("Array values are");
	for (int i=0;i<n;i++)
	{
		System.out.print(myarray[i]);
		sum+= myarray[i];
	}
	
	System.out.println("\nsum of array is "+sum);
	
	
	
}
}