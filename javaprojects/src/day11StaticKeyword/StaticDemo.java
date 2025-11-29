package day11StaticKeyword;

public class StaticDemo {
	
	static int a=10;      //Static variable//
	private static StaticDemo sd;
	static int b=20;      //Non-Static variable//
	
	
	static void m1()      //static method//
	{
	System.out.println("This Is m1 Static method");
	}
	
	static void m2()             //Non-static method
	{
	System.out.println("This Is m2 Non-Static method");
	}
	
	void m()               //Non-Static Method//
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub//
		System.out.println(a);	
		m1();
		System.out.println(b);
		m2();

      //Static method can Access Non-Static stuff through object//
		
		StaticDemo.sd=new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		sd.m();
		
	
	}

}
