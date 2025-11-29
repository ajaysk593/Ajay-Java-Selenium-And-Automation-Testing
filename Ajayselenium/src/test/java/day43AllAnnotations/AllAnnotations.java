package day43AllAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@org.testng.annotations.BeforeSuite
	void Bs()
	{
		System.out.println("This is BeforeSuite ..");
	}
	

    @org.testng.annotations.AfterSuite
	void As()
	{
		System.out.println("This is AfterSuite ..");
	}
    
    @BeforeTest
   	void Bt()
   	{
   		System.out.println("This is BeforeTestMethod ..");
   	}
    
    @AfterTest
  	void At()
  	{
  		System.out.println("This is AfterTestMethod ..");
  	}
    
    @BeforeClass
	void Bc()
	{
		System.out.println("This is Before class method...");
	}
    
    @AfterClass
	void Ac()
	{
		System.out.println("This is After class method....");
	}
    
    
    @BeforeMethod
	void Bm()
	{
		System.out.println("This is BeforeMethod....");
	}
    
    @AfterMethod
	void Am() 
	{
		System.out.println("This is AfterMethod....");
	}
    
    @Test(priority=1)
    void Tm1()
    {
    	System.out.println("This is TestMethod1...");
    }
    
    @Test(priority=2)
    void Tm2()
    {
    	System.out.println("This is TestMethod2...");
    }
}
