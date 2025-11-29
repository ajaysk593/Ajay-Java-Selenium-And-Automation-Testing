package day44DependencyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

//openapp
//login
//search
//adv search
//logout

//Allows you to specify that a test method Depends on 1 or more other methods
//Dependent method will only run if the methhods depends on are succesfull

public class DependencyMethod {

	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3,dependsOnMethods= {"login"})
	void search()
	{
	    Assert.assertTrue(true);
	}
	
	@Test(priority=4,dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
}
