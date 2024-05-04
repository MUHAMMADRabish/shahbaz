package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot {
	WebDriver driver;
	@FindBy(xpath = "//*[@aria-label='Email or mobile number']") WebElement Forgotfieldsenter;
    @FindBy(name = "did_submit") WebElement Searchbutton;
    @FindBy(xpath = "(//*[text()='Use your Google account'])[2]") WebElement Verifies;
    
    public Forgot(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}    
public void ForgotPsswordFields() {
	Forgotfieldsenter.sendKeys("hr@gmail.com");
	
}
public void SearchButtonClicks() {
	Searchbutton.click();
}
public String Google() {
	String Forgotelemttexts= Verifies.getText();
	return Forgotelemttexts;
}
}
