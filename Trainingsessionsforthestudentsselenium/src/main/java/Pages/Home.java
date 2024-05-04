package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	//add all the locators according to use for that page, create method for each locator according to action
	@FindBy (name = "email") WebElement emailfields;
	@FindBy(name="pass") WebElement psswrdfields;
	@FindBy(linkText = "Forgot password?") WebElement Forgots;
	@FindBy(linkText = "Create new account") WebElement CreateNewAccount;
	//This is for github checkin .
	
	
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void emailfieldsfill() {
		emailfields.sendKeys("hr@gmail.com");
	}
	public void psswrdfieldfill() {
		psswrdfields.sendKeys("kj");
	}
	public void ForgotPsswordClick() {
		Forgots.click();
	}
	public void CreateAnAccount() {
		CreateNewAccount.click();
	}
	

}
