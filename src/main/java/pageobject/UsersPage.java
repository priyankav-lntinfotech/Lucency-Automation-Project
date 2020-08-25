package pageobject;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.BaseActions;

public class UsersPage  extends BaseActions {
	
	public UsersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By Account_SideMenu_Link = By.xpath("//span[text()='Account']");
	By Users_SubMenu_Link = By.xpath("//span[text()='Users']");
	By Verify_UsersPage = By.xpath("//div[text()='Manage Users']");
	By AddUser_Button = By.xpath("//span[text()='Add User']");
	By enterFirst_Name = By.xpath("//input[@id='user_add_first_name']");
	By enterLast_Name = By.xpath("//input[@id='user_add_last_name']");
	By enterEmail = By.xpath("//input[@id='user_add_email']");
	By re_EnterEmail = By.xpath("//input[@id='user_add_email_confirmation']");
	By ContactNumber = By.xpath("//input[@id='user_add_phone']");
	By Save_Button = By.xpath("(//button[text()='Save'])[1]");
	By close_success_popup = By.xpath("//I[@class='icon icon-close-4 f-abs-all']");
	By Edit_Button = By.xpath("(//span[@class='f-title f-underline'][text()='Edit'])[1]");
	By Delete_Button = By.xpath("(//span[@class='f-title f-underline'][text()='Delete'])[1]");
	By Edit_FirstName = By.xpath("//input[@id='user_edit_first_name']");
	By Delete_Confirmation_popup = By.xpath("//button[text()='Yes']");
	
	
	
	
	public void Account_SideMenu_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(Account_SideMenu_Link);
			System.out.println("Account Side Menu Link Clicked............");
			scrollToBottomOfPage();
			System.out.println("Scroll Successfully.....................");
		}catch (Exception e) {
			System.out.println("Account SideMenu Link Not Clicked...........");
			throw (e);
		}
	}	
	
	public void verify_Manage_Users_Page_Method() throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Users_SubMenu_Link));
			clickElement(Users_SubMenu_Link);
			System.out.println("Users SubMenu Link Clicked.............");			
			System.out.println("User Successflly Navigate......"+ driver.findElement(Verify_UsersPage).getText());
		}catch (Exception e) {
			System.out.println("Users SubMenu Link Not Clicked.............");
			throw (e);
		}
	}
	
	public void click_Add_User_Button_Method() throws Exception {
		try {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(AddUser_Button));
			clickElement(AddUser_Button);
			System.out.println("AddUser_Button Clicked.................");			
		}catch (Exception e) {
			System.out.println("AddUser_Button Not Clicked.............");
			throw (e);
		}
	}
	
	public void enter_FirstName_Method() throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(enterFirst_Name));
			setElementText(enterFirst_Name, "Mandar");
			System.out.println("First Name Entered Successfully.............");			
		}catch (Exception e) {
			System.out.println("Unable to Enter First Name.............");
			throw (e);
		}
	}
	
	public void enter_LastName_Method() throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(enterLast_Name));
			setElementText(enterLast_Name, "Cue");
			System.out.println("Last Name Entered Successfully.............");			
		}catch (Exception e) {
			System.out.println("Unable to Enter Last Name.............");
			throw (e);
		}
	}
	
	public void enter_Email_Method() throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(enterEmail));			
			String email = "demo@" + new Random().nextInt(1000) + "gmail.com";
			driver.findElement(enterEmail).sendKeys(email);			
			System.out.println("Email Entered Successfully.............");			
		}catch (Exception e) {
			System.out.println("Unable to Enter Email..................");
			throw (e);
		}
	}
	
	public void reEnterEmail_Method() throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(re_EnterEmail));			
			Actions act = new Actions(driver);				
			driver.findElement(enterEmail).sendKeys(Keys.chord(Keys.CONTROL,"a"));
			driver.findElement(enterEmail).sendKeys(Keys.chord(Keys.CONTROL,"c"));			
			driver.findElement (re_EnterEmail).sendKeys(Keys.chord(Keys.CONTROL, "v"));			
			System.out.println("Email Re-Enter Successfully...............");			
		}catch (Exception e) {
			System.out.println("Unable to Re-Enter Email..................");
			throw (e);
		}
	}
	
	public void enter_Contact_Method() throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ContactNumber));
			setElementText(ContactNumber, "9856748589");
			System.out.println("Contact Number Enter Successfully...............");			
		}catch (Exception e) {
			System.out.println("Contact Number Not Enter........................");
			throw (e);
		}
	}
	
	public void click_Save_Button_Method() throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Save_Button));
			clickElement(Save_Button);
			System.out.println("Save Button Successfully Clicked................");					
		}catch (Exception e) {
			System.out.println("Save Button Not Clicked.........................");
			throw (e);
		}
	}
	
	public void click_Close_Success_Popup_Method() throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(close_success_popup));
			clickElement(close_success_popup);
			System.out.println("Success Popup closed Successfully................");					
		}catch (Exception e) {
			System.out.println("Success popup not found.........................");
			throw (e);
		}
	}	
	
	public void click_Edit_Button_Method() throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Edit_Button));
			clickElement(Edit_Button);
			System.out.println("Edit Button Successfully Clicked................");	
			wait.until(ExpectedConditions.elementToBeClickable(Edit_FirstName));
			clearText(Edit_FirstName);
			setElementText(Edit_FirstName, "ABC");
			wait.until(ExpectedConditions.elementToBeClickable(Save_Button));
			clickElement(Save_Button);
			clickElement(close_success_popup);
			Thread.sleep(500);
		}catch (Exception e) {
			System.out.println("Edit Button Not Clicked.........................");
			throw (e);
		}
	}
	
	public void delete_Users_Method() throws Exception {
		try {
			
			wait.until(ExpectedConditions.elementToBeClickable(Delete_Button));
			clickElement(Delete_Button);
			System.out.println("Delete_Button Successfully Clicked................");				
		}catch (Exception e) {
			System.out.println("Delete_Button not found.........................");
			throw (e);
		}
	}
	
	
	public void delete_confirmation_Method() throws Exception {
		try {			
			wait.until(ExpectedConditions.elementToBeClickable(Delete_Button));				
			clickElement(Delete_Confirmation_popup);
			System.out.println("Delete confirmation varified successfully...............");			
		}catch (Exception e) {
			System.out.println("Delete_Button not found.........................");
			throw (e);
		}
	}

}
