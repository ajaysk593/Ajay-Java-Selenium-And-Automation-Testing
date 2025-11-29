package day44GroupingMethods;

import org.testng.annotations.Test;

public class  SignupTest2 {

	@Test(priority=1,groups= {"Regression"})
	void SignupByEmail()
	{
		System.out.println("This is  SignupByEmail..");
	}
	
	@Test(priority=2,groups= {"Regression"})
	void  SignupByFacebook()
	{
		System.out.println("This is  SignupByFacebook..");
	}

	@Test(priority=3,groups= {"Regression"})
	void  SignupByTwitter()
	{
		System.out.println("This is  SignupByTwitter..");
	}

}

