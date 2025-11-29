package day6ArrayTopics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		System.out.println("length of rows"+a.length);
		System.out.println("length of coloumn"+a[0].length);
		
		for(int r=0;r<2;r++)
		{
		for(int c=0;c<=1;c++)
		{
		System.out.println(a[r][c]);
		}
		
	}
		}
}
