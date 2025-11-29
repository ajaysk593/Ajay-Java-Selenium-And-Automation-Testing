package day44GroupingMethods;

import org.testng.annotations.Test;

//LoginByEmail
//LoginByFacebook
//LoginByTwitter
public class LoginTest1 {
	
	@Test(priority=1,groups= {"sanity"})
	void LoginByEmail()
	{
		System.out.println("This is LoginByEmail..");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void LoginByFacebook()
	{
		System.out.println("This is LoginByFacebook..");
	}

	@Test(priority=3,groups= {"sanity"})
	void LoginByTwitter()
	{
		System.out.println("This is LoginByTwitter..");
	}

}
