package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	By Edit_Button = By.xpath("(//span[@class='f-title f-underline'][text()='Edit'])[1]");
	By Delete_Button = By.xpath("(//span[@class='f-title f-underline'][text()='Delete'])[1]");
	By Edit_FirstName = By.xpath("//input[@id='user_edit_first_name']");
	
	
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
			clickElement(Users_SubMenu_Link);
			System.out.println("Users SubMenu Link Clicked.............");
			//Assert.assertFalse(driver.findElement(Verify_UsersPage).isSelected());
			System.out.println("User Successflly Navigate......"+ driver.findElement(Verify_UsersPage).getText());
		}catch (Exception e) {
			System.out.println("Users SubMenu Link Not Clicked.............");
			throw (e);
		}
	}
	
	public void click_Add_User_Button_Method() throws Exception {
		try {
			clickElement(AddUser_Button);
			System.out.println("AddUser_Button Clicked.................");			
		}catch (Exception e) {
			System.out.println("AddUser_Button Not Clicked.............");
			throw (e);
		}
	}
	
	public void enter_FirstName_Method() throws Exception {
		try {
			setElementText(enterFirst_Name, "Mandar");
			System.out.println("First Name Entered Successfully.............");			
		}catch (Exception e) {
			System.out.println("Unable to Enter First Name.............");
			throw (e);
		}
	}
	
	public void enter_LastName_Method() throws Exception {
		try {
			setElementText(enterLast_Name, "Cue");
			System.out.println("Last Name Entered Successfully.............");			
		}catch (Exception e) {
			System.out.println("Unable to Enter Last Name.............");
			throw (e);
		}
	}
	
	public void enter_Email_Method() throws Exception {
		try {
			setElementText(enterEmail, "fack@gmail.com");
			System.out.println("Email Entered Successfully.............");			
		}catch (Exception e) {
			System.out.println("Unable to Enter Email..................");
			throw (e);
		}
	}
	
	public void reEnterEmail_Method() throws Exception {
		try {
			setElementText(re_EnterEmail, "fack@gmail.com");
			System.out.println("Email Re-Enter Successfully...............");			
		}catch (Exception e) {
			System.out.println("Unable to Re-Enter Email..................");
			throw (e);
		}
	}
	
	public void enter_Contact_Method() throws Exception {
		try {
			setElementText(ContactNumber, "9856748589");
			System.out.println("Contact Number Enter Successfully...............");			
		}catch (Exception e) {
			System.out.println("Contact Number Not Enter........................");
			throw (e);
		}
	}
	
	public void click_Save_Button_Method() throws Exception {
		try {
			clickElement(Save_Button);
			System.out.println("Save Button Successfully Clicked................");			
		}catch (Exception e) {
			System.out.println("Save Button Not Clicked.........................");
			throw (e);
		}
	}
	
	public void click_Edit_Button_Method() throws Exception {
		try {
			clickElement(Edit_Button);
			System.out.println("Edit Button Successfully Clicked................");	
			
		}catch (Exception e) {
			System.out.println("Edit Button Not Clicked.........................");
			throw (e);
		}
	}

}
