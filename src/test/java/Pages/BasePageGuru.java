package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePageGuru {

	WebDriver driver;
	
	public BasePageGuru(WebDriver driver) {
		this.driver=driver;  //create Constructor of WebDriver driver 
	}
	
	void Click(By Locator) { //Create single method of Click element
		driver.findElement(Locator).click();
					
		}
		
		void Sendkeys(By Locator, String Text) {   //Create a single method of Sendkeys element
			driver.findElement(Locator).sendKeys(Text);
	}
	
		
	
}
