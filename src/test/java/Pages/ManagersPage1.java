package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagersPage1 {
	WebDriver driver;

	public ManagersPage1(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By NC= By.linkText("New Customer");
	By Edit= By.linkText("Edit Customer");
	By Delete= By.linkText("Delete Customer");
	
	
		public void NewCustomer()  {
		driver.findElement(NC).click();
		driver.navigate().refresh();
		driver.findElement(NC).click();
				
	}
	
		public void EditCustomer() {
		driver.findElement(Edit).click();
		driver.navigate().refresh();
		driver.findElement(Edit).click();
	}
	
		public void DeleteCustomer() {
		driver.findElement(Delete).click();
		driver.navigate().refresh();
		driver.findElement(Delete).click();
										
			}
}
