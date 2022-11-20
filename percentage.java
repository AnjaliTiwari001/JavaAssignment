package percentage;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of subjects");
		int n = sc.nextInt();
		
		int subjects [] = new int[n];
		int sum=0;
		
		for (int i=0;i<n;i++)
		{
		
			 subjects[i] = sc.nextInt();
			 sum+= subjects[i];
		
		}
		
		System.out.println("The percentage of marks obtained by student is "+(sum/n)+"%");

}
	
}
