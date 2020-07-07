package pageobject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Base.BaseActions;
import context.TestContext;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class UserProfilePage extends BaseActions
{
	
	public UserProfilePage(WebDriver driver)
	{
		super(driver);
	}
	
 //  WebDriver driver;
   
   public By Accounttext = By.xpath("//div[@id='page-1-1-inner']/h1[text()='My Account Settings']");
   
   /*Elements on Edit popup*/
	
	By edit = By.xpath("//span[@class='f-title f-underline'][text()='Edit']");
	By edit_firstname = By.xpath("//input[@id=\"user_profile_edit_first_name\"]");
	By edit_lastname = By.xpath("//input[@id=\"user_profile_edit_last_name\"]");
	By edit_phone = By.xpath("//input[@id='user_profile_edit_phone']");
	By email = By.xpath("//input[@id=\"user_profile_edit_email\"]");
	By emailpreference = By.xpath("//div[@class='p-choice-inner']");
	By emailpreferencetext=By.xpath("//div[@class='f-bold f-ellip f-lh-32 f-size-14 f-title'][contains(text(),'Email Preferences')]");
	By old_pswd = By.xpath("//input[@id='user_profile_edit_current_password']");
	By new_pswd = By.xpath("//input[@id='user_profile_edit_new_password']");
	By confirm_pswd = By.xpath("//input[@id='user_profile_edit_new_password_confirmation']");
	
	By cancel = By.xpath("//button[text()='Cancel']");
	By save = By.xpath("//button[text()='Save']");
	
	/* Elements on Profile page */
	public By emailid = By.xpath("//input[@id='user_email']");
	public By firstname = By.xpath("//input[@id='first_name']");
	public By lastname = By.xpath("//input[@id='last_name']");
	public By phone = By.xpath("//input[@id='phone']");
	
	public void verifyAccountTitle()
	{
		if (findAnyElement(Accounttext).isDisplayed())
		{
			System.out.println("User is on My Account Settings page");
			
		}
		else
		{
			System.out.println("Failed to find Settings page");
		}
	}
 
	
	public void updateprofiledetails() 
	{
		//wait.until(ExpectedConditions.elementToBeClickable(edit)).click();
		
		//driver.findElement(edit).click();
		
		ajaxClick(edit);
		
		try	
		{
	        
			if (findAnyElement(save).isDisplayed())
			{
				System.out.println("Editing User Details");
				
				driver.findElement(edit_firstname).clear();
				driver.findElement(edit_firstname).sendKeys(generateNewWord(7));
				
				driver.findElement(edit_lastname).clear();
				driver.findElement(edit_lastname).sendKeys(generateNewWord(7));
				
				driver.findElement(edit_phone).clear();
				driver.findElement(edit_phone).sendKeys(generateNewNumber(10));
				
				String Emailid = driver.findElement(email).getAttribute("value");
				System.out.println("Logged in email id is:"+" "+Emailid);
				
				ajaxClick(save);
			}
			
			else
			{
				System.out.println("Profile is not in edit mode");
			}
					
		}
		catch(Exception e)
		{
			System.out.println("Profile not updated: " + e.toString());
			e.printStackTrace();
		}
	}
	
	public void Uploadpic()
	{
		ajaxClick(edit);
		
		driver.findElement(By.xpath("//span[@class='f-bold f-lh-18 f-size-14 f-title f-underline'][text()='Upload New Image']")).click();
		
	}

}
