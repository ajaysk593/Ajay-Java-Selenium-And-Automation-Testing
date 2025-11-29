package SpeshWayFinalTest;

import java.util.Scanner;

public class GradeCalcucator2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks=sc.nextInt();
		
		//int marks=75;
		
		if(marks>90)
		{
			System.out.println("A");
		}
		else if(marks>75)
		{
			System.out.println("B");
		}
		else if(marks>60)
		{
			System.out.println("c");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
