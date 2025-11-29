package TestNG42;

import org.testng.annotations.Test;

//open App
//Login
//Logout

public class FirstTestCaseTestNG { 
	
 @Test(priority=1)
 void openApp()
 {
	   System.out.println("opening Application....");
 }
 @Test(priority=2)
 void Login()
 {
	   System.out.println("Login Application...");
 }
 @Test(priority=3)
 void Logout()
 {
	   System.out.println("Logout Application....");
 }
}




