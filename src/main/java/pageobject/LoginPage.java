package pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.server.handler.ClickElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseActions;


public class LoginPage extends BaseActions
{

	WebDriver  driver;
	
	By home_login = By.xpath("//button[@class='a-button f-b pure-input-1 f-b-4A90E2-a f-b-4A90E2-h f-border-4A90E2 f-c-FFFFFF-a f-c-FFFFFF-h f-c-4A90E2 f-l-38 f-m-a f-r-20 f-s-16 f-w-90 f-600']");
	By email = By.id("tooltip_auth_login_email");
	By password = By.id("tooltip_auth_login_password");
	By submit = By.xpath("//button[@class='a-button f-b f-b-293B50-a f-b-293B50-h f-b-4A90E2 f-c-FFFFFF f-h-40 f-l-40 f-m-a f-p-10-h f-r-20 f-s-14 f-w-175 f-600 pure-input-1'][text()='Log In']");
	By errorMsg=By.xpath("//div[@class='f-m-a f-w-280-m p-validate-error']");
		

    public LoginPage(WebDriver driver)
   {
	   super(driver);
		
    }

	public void clickHomeLogin()
	{
		try {
	
			clickElement(home_login);
		System.out.println("Login button clicked");
		}
		catch (Exception e)
		{
			System.out.println("Login button not clicked");
		}
	}
	

	public void clickSubmit()
	{
		try {
				clickElement(submit);
				System.out.println("Login popup button clicked");
		}
		catch (Exception e)
		{
			System.out.println("Login popup button not clicked");
		}
	}
	
	public void enterEmailandPassword(String emailid, String pasword) throws Exception
	{
		
		Thread.sleep(1000);
		ajaxSendKeys(email, emailid);
		
		Thread.sleep(1000);
		ajaxSendKeys(password, pasword);
		
		System.out.println("Entered Email and Password on Login Popup");
	}
	
	public String getErrorMessageText() throws Exception 
	{
		String text=null;
		try {
			Thread.sleep(1000);
			//text = driver.findElement(errorMsg).getAttribute("name");
			text= driver.findElement(errorMsg).getText().toString();
			System.out.println(text);
		} catch (Exception e) {
			System.out.println("Could not get error message text");
			throw (e);
		}
		return text;
	}
	
	public void doValidLogin(String emailid, String pasword) throws InterruptedException 
	{
		clickHomeLogin();
        
		Thread.sleep(1000);
		ajaxSendKeys(email, emailid);
		Thread.sleep(1000);
		ajaxSendKeys(password, pasword);
		
		clickSubmit();
	}

}
