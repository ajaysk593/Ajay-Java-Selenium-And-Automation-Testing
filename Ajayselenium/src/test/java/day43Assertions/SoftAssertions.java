package day43Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertions {

	@Test
	void Test_SoftAssertions()
	{
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(20000,20000);
		
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		
	}	
	
	
	
	
	
}
