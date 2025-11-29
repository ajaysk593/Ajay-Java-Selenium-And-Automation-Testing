package day43Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	void Test_HardAssertions()
	{
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		Assert.assertEquals(2000, 3000);
		//Assert.assertEquals(2000, 3000);
		
		System.out.println("Testing....");
		System.out.println("Testing....");
	}	
}
