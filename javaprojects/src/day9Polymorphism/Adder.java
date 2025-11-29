package day9Polymorphism;


public class Adder {

	public static void main(String[] args) {
	}
	int a=10, b=30;
	void sum1()
	{
		System.out.println(a+b);
	}
	void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	void sum(int x, double y)
	{
		System.out.println(x+y);
	}
	void sum(double x, int y)
	{
		System.out.println(x+y);	
	}
	void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	

			
	}


