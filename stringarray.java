package stringarray;

import java.util.Scanner;

public class stringarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of subjects");
		int n = sc.nextInt();
		
		String names [] = new String[n];
		
		
		for (int i=0;i<names.length;i++)
		{
		
			names[i] = sc.next();
			
		
		}
		
		for (int i=0;i<names.length;i++)
		{
		
			System.out.println(names[i]);
			
		
		}
		
		
}
	
}
