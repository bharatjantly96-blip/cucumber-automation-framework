package pageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginPage extends BaseClass {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement uname;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public void enterUserName(String Username)
	{
		uname.sendKeys(Username);
	}
	
	public void enterPassword(String Password)
	{
		pwd.sendKeys(Password);
	}
	
	public void clickLogin()
	{
		submit.click();
	}
	
	
	

}
