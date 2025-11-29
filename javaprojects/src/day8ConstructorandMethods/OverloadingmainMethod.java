package day8ConstructorandMethods;

public class OverloadingmainMethod {

	void main(int x)
	{
		System.out.println(x);
	}
	void main(String s) 
	{
		System.out.println(s);
	}
	void main(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		OverloadingmainMethod ov=new OverloadingmainMethod();
		ov.main(10000);
		ov.main("AJAY KAVYA");
		ov.main("KAVYA","AJAY");
	

	}

}
