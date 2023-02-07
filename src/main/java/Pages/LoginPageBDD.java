package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageBDD extends PageBase{

	public LoginPageBDD(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement UsernameField;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement PasswordField;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public WebElement LoginButton;
	
	
	
	public void inValid_Login(WebDriver driver,String UserName,String Password) throws InterruptedException {
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		UsernameField.sendKeys(UserName);
		PasswordField.sendKeys(Password);
		LoginButton.click();
		Thread.sleep(2000);
	}
}

