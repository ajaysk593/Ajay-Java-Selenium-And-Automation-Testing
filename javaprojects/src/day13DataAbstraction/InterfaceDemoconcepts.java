package day13DataAbstraction;

import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface;

interface shape{
	int length=10;//Final and Static
	int width=20;//Final static
	void circle();
	default void square() {
	
System.out.println("This is Square-default method");
}
static void rectangle()
{
System.out.println("This is rectangle-static method");
}
}


public  class InterfaceDemoconcepts implements shape {

	public void circle()
	{
		System.out.println("This is circle-abstract method");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceDemoconcepts idobj=new InterfaceDemoconcepts();
		idobj.circle();
		idobj.square();
		shape.rectangle();

	}

}
