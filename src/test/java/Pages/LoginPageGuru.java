package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageGuru extends BasePageGuru{
	WebDriver driver;
	
	
	public LoginPageGuru(WebDriver driver) {    //Calling methods in LoginPage to TestGuru so in both same "driver" same with same driver insalization Use Constructor method
		super(driver); //Super constructor
		this.driver=driver; //Both BasePage and Loginpage same multiple constructor use so inthis case we have to use Super constructor
		
	}
	
	//Locators Elements
	
	By UserID=By.name("uid");
	By Uword=By.name("password");
	By Submit=By.name("btnLogin");
	
	
	public void LoginPageGuru_details() {
		Sendkeys(UserID,"mngr532503");
		Sendkeys(Uword, "EjAtAqU");
		Click(Submit);
		
		
	}
	
	
}
