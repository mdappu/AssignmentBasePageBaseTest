package TestsGuru;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Pages.LoginPageGuru;
import Pages.ManagersPage1;

public class BaseTestGuru {

	WebDriver driver;
	LoginPageGuru LP;
	ManagersPage1 MP;
	
	
	@BeforeSuite  //All packages is there Test classes 1st Run this OpenApp browser
	void OpeApp() {     //1st open browser and URL open
		driver= new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LP= new LoginPageGuru(driver);
		MP= new ManagersPage1(driver);
	
		}
	
	@BeforeTest  // All are Test Methods before open Login Page
	void LoginPageGuru() {
		LP.LoginPageGuru_details();
		
	}
	
	@AfterTest
	void Teardown() {
		driver.quit(); // Multiple browser close will use quit Or single browser close, we can use instead of quit use close method
	}
	
	
	
	
	
}
