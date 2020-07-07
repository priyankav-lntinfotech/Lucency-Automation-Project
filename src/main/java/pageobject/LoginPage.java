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

	By home_login = By.xpath("//button[text()='Login']");
	By email = By.id("tooltip_auth_login_email");
	By password = By.id("tooltip_auth_login_password");
	By submit = By.xpath("//button[text()='Log In']");
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
	
	public String getErrorMessageText() 
	{
		
		String text = null;
		try 
		{
			Thread.sleep(1000);

			text= driver.findElement(errorMsg).getText();
			System.out.println("Error message is:" + text);
		} 
		catch (Exception e)
		{
			System.out.println("Could not get error message text:" + e.toString());
			
		}
		return text;
		
	}
	
	public void doValidLogin(String emailid, String pasword) 
	{
		clickHomeLogin();
        
		ajaxSendKeys(email, emailid);
		ajaxSendKeys(password, pasword);
		
		clickSubmit();
	}

}
