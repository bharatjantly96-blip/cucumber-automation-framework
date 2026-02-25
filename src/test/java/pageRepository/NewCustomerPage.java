package pageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class NewCustomerPage extends BaseClass {
	
WebDriver driver;
	
	public NewCustomerPage(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement NewCustLink;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement Cust_Name;

	@FindBy(xpath="(//input[@name='rad1'])[1]")
	WebElement Radio;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement DOB;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement Address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement PIN;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement Mobile;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement Submit;
	
	public void clickOnNewCustLink()
	{
		NewCustLink.click();
	}
	
    public void enterCustomerName(String name)
    {
    	Cust_Name.sendKeys(name);
    }
    
    public void selectGender()
    {
    	Radio.click();
    }
    
    public void enterDOB(String dob)
    {
    	DOB.sendKeys(dob);
    }
	
    public void enterAddress(String addr)
    {
    	Address.sendKeys(addr);
    }
    
    public void enterCity(String city)
    {
    	City.sendKeys(city);
    }
    
    public void enterState(String state)
    {
    	State.sendKeys(state);
    }
    
    public void enterPIN(String pin)
    {
    	PIN.sendKeys(pin);
    }
    
    public void enterMobile(String mobile)
    {
    	Mobile.sendKeys(mobile);
    }
    
    public void enterEmail(String email)
    {
    	Email.sendKeys(email);
    }
    
    public void clickSubmit()
    {
    	Submit.click();
    }
    
    
}
