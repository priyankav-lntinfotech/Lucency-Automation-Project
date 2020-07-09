package pageobject;

import java.io.File;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;
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
	By save = By.xpath("//button[@class='f-bg-1 f-bold f-button f-c f-color-w f-h-40 f-lh-40 f-pad-1-h f-size-14 f-w-175 pure-input-1'][text()='Save']");
	
	/* Elements on Profile page */
	public By emailid = By.xpath("//input[@id='user_email']");
	public By firstname = By.xpath("//input[@id='first_name']");
	public By lastname = By.xpath("//input[@id='last_name']");
	public By phone = By.xpath("//input[@id='phone']");

	/* Elements on Upload Profile Image*/
	public By uploadimage = By.xpath("//span[@class='f-bold f-lh-18 f-size-14 f-title f-underline'][text()='Upload New Image']");
	public By uploadfile = By.xpath("//input[@id='user_profile_upload_file']");
	public By savefile = By.xpath("//button[text()='Save']");
	String imagepath = "src/test/resources/FilesToUpload/profile.jpg";
	
	private File file;
	
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
		ajaxClick(edit);
		
		try	
		{
	        
			if (findAnyElement(save).isDisplayed())
			{
				System.out.println("Editing User Details");
				
				clearElement(edit_firstname);
				String fname = generateNewWord(7);
				setElementText(edit_firstname,fname);
				
				clearElement(edit_lastname);
				String lname = generateNewWord(7);
				setElementText(edit_lastname,lname);
				
				clearElement(edit_phone);
				String phone = generateNewNumber(10);
				setElementText(edit_phone, phone);
				
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
	
	public void Uploadpic() throws Exception
	{
		ajaxClick(edit);
		
		driver.findElement(uploadimage).click();
		Thread.sleep(1000);
		
		String absolutepath = getAbsoultepathofFile(imagepath);
		System.out.println("File path is: "+ absolutepath);
		setElementText(uploadfile, absolutepath);
		
		Thread.sleep(1000);
        ajaxClick(savefile);
        System.out.println("Uploaded image");
        
        ajaxClick(save);
	
	}
	
	public void updatepassword(String pswd) throws Exception
	{
		ajaxClick(edit);
		
		setElementText(old_pswd, pswd);
		
		String newpassword = generateNewWord(3)+generateNewNumber(2)+"@"+(generateNewWord(2)).toUpperCase();
		System.out.println("New Password is: "+ newpassword);
		
		setElementText(new_pswd, newpassword);
		setElementText(confirm_pswd, newpassword);
		
		Thread.sleep(3000);
		ajaxClick(save);
		
	}

}
;
