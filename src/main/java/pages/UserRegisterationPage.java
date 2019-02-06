package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase {

	public UserRegisterationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="gender-male")
	WebElement Gendermale_Radiobtn;
	
	@FindBy(id="FirstName")
	WebElement Firstname_Field;
	
	@FindBy(id="LastName")
	WebElement Lastname_Field;
	
	@FindBy(id="Email")
	WebElement Email_field;
	
	@FindBy(id="Password")
	WebElement password_field;
	
	@FindBy(id="ConfirmPassword")
	WebElement Confirmpass_field;
	
	@FindBy(id="register-button")
	WebElement registerbtn;
	
	
	public void userregisteration_data(String Firstname,String Lastname,String Email, String password, String confirmpass)
	{
		//Gendermale_Radiobtn.click();
		
		click_button(Gendermale_Radiobtn);
		
		//Firstname_Field.sendKeys(Firstname);
		
		Enter_Text(Firstname_Field, Firstname);
		Lastname_Field.sendKeys(Lastname);
		Email_field.sendKeys(Email);
		password_field.sendKeys(password);
		Confirmpass_field.sendKeys(confirmpass);
		
		
		// Click on the register button to complete registration
		click_button(registerbtn);
		
		
	}
	
	
	
	
	

}
