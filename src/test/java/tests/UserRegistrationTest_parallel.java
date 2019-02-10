package tests;



import org.testng.annotations.Test;

import pages.HomePage;

import pages.UserRegisterationPage;


public class UserRegistrationTest_parallel extends TestBase_parallel
{
	HomePage homeObject ; 
	UserRegisterationPage registerObject ; 
	

	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() 
	{
		homeObject = new HomePage(getDriver()); 
		homeObject.openregisterationPage();
		
		
		
		registerObject = new UserRegisterationPage(getDriver()); 
		registerObject.userregisteration_data("h", "ahmed", "hell@yahoo.com", "12345678", "12345678");
		
	}

	
}
