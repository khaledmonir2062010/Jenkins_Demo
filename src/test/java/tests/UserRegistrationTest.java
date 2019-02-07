package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegisterationPage;

public class UserRegistrationTest extends TestBase
{
	HomePage homeobject;
	UserRegisterationPage Registerobject;
	
	@Test
	public void useCanRegisterSuccessfully()
	{
		//This will going to Click on the Link of the register on the home page
		
		homeobject = new HomePage(driver);
		homeobject.openregisterationPage();
		
		//this will going to fill the data of the user
		Registerobject= new UserRegisterationPage(driver);
		Registerobject.userregisteration_data("Ahmed", "Mohamed", "k@test33433313.com", "12345678", "12345678");
		
		
	}
	
	
	
	

}
