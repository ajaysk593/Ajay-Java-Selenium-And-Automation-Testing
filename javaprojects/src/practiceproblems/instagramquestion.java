package practiceproblems;

import java.util.Scanner;

public class instagramquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
        	for(int j=1;j<n;j++)
        	{
        		System.out.println(i+j-1+"");       		
        	}
        	System.out.println();
        }
	
	}

}
