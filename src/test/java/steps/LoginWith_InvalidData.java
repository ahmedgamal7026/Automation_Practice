package steps;

import java.time.Duration;

import Pages.OrangeHRM_Home_Page;
import Pages.OrangeHRM_LoginPage;
import Tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWith_InvalidData extends TestBase {
	
	OrangeHRM_LoginPage LP;
	OrangeHRM_Home_Page HP;
	
	@Given("the user is navigated to the website")
	public void Site_Navigation ()  {
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	@When("the user enters invalid {string},invalid {string}")
	public void InsertingData (String uname, String pass) throws InterruptedException {
		
		LP = new OrangeHRM_LoginPage(driver);
		LP.inValid_Login(driver,uname,pass);
		
	}
	
	
	
	
	@Then ("A validation message will be displayed")
	public void DisplayingTheErrorMessage() throws InterruptedException {
		
		HP = new OrangeHRM_Home_Page(driver);
		System.out.println("The User Still in the Login Page");
		
		
		
	}
	
	
}
