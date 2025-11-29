package day43AnnotationBeforeAfterClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Login--->@BeforeClass
//Search--->@Test
//Adv Search--->@Test
//Logout---->AfterClass

public class AnnotationDemo2 {
	
	@BeforeClass
	void Login()
	{
		System.out.println("This is Login...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search....");
	}
	
	@Test(priority=2)
	void AdvSearch()
	{
		System.out.println("This is Advsearch...");
	}
	
	@AfterClass
	void Logout()
	{
		System.out.println("This is Logout....");
	}
    
	
}
