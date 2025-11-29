package day6ArrayTopics;

public class SingleDimensionalArray {

	private static int length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
	 
		
		System.out.println(a.length);	
		System.out.println(a[4]);	

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);	

		}
		
	}

}
