package day44GroupingMethods;

import org.testng.annotations.Test;

public class PaymentTest3 {

	@Test(priority=1,groups= {"sanity","Regression","Functional"})
	void PaymentInRuppees()
	{
		System.out.println("This is  PaymentInRupees..");
	}
	
	@Test(priority=2,groups= {"sanity","Regression","Functional"})
	void  PaymentInDollar()
	{
		System.out.println("This is  PaymentInDollar..");
	}
}
