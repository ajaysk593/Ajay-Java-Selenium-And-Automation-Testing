package day43AnnotationBeforeAfterMethod;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Login--->@Before
//Search--->@Test
//Logout---->@After
//Login----->
//Adv Search--->
//Logout---->
public class AnnotationDemo1 {
	
	@BeforeMethod
	void Login()
	{
		System.out.println("This is Login....");
	}
	
	@Test(priority=1)
	void Search() 
	{
	    System.out.println("This is Search.....");	
	}
	@AfterMethod
	void Logout() 
	{
		System.out.println("This is Logout....");
	}
	
	
	void Login1()
	{
		System.out.println("This is Login....");
	}
	@Test(priority=2)
	void AdvSearch()
	{
		System.out.println("This is AdvSearch...");
	}
	

	void Logout1()
	{
		System.out.println("This is Logout....");
	}
	
	
	
}
