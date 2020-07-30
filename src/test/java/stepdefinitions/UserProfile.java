package stepdefinitions;

import java.util.concurrent.TimeUnit;
import Base.BaseActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.UserProfilePage;
import sun.java2d.cmm.Profile;
import managers.PageObjectManager;

public class UserProfile 

{
	private PageObjectManager objectmanager;
	private TestContext context;
	private LoginPage loginPage;
	private HomePage homePage;
	private UserProfilePage profile;
	private BaseActions base;
	
	public UserProfile(TestContext context) {
		this.context = context;
	}

	
	
	@Given("^Login with an user and navigate to My Account Settings page$")
	public void login_with_an_user_and_navigate_to_my_account_settings_page() throws InterruptedException 
	{
		
		loginPage = context.getPageObjectManager().getLogingPage();
		homePage=context.getPageObjectManager().getHomePage();
		profile=context.getPageObjectManager().getUserProfilePage();
			
		Assert.assertEquals("Login page not found", context.getPageTitle(), "Making Marketing and Contact Centers More Profitable - Lucency Technologies");
		loginPage.doValidLogin(context.getConfigFileReader().getValidEmail(), context.getConfigFileReader().getValidPassword());
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
		Assert.assertEquals("Dashboard menu doesn't exists", homePage.verifyDashboard(), "Dashboard");
			
		try
		{
			homePage.clickonProfileIcon();			
			//Thread.sleep(1000);			
			homePage.clickonAccountSettings();			
			//Thread.sleep(1000);
		    profile.verifyAccountTitle();
		}
		catch(Exception e)
		{
			System.out.println("My Account Settings text not found" + e.toString());
			e.printStackTrace();
		}
	}
	
	@When("User click on Edit icon to update User details Password and Profile Pic")
	public void user_click_on_Edit_icon_to_update_User_details_Password_and_Profile_Pic() {
		 try {
			    System.out.println("Click on Edit icon to update profile");
				Thread.sleep(1000);				
				profile.Editclick();
				System.out.println("Open in edit mode..");			   
		   }catch (Exception e) {
			   System.out.println("Update User Details, Password and Profile Pic Stepdefinition Not Found............");
		   }
	}
	
	

	@Then("User update the user details")
	public void User_update_the_user_details() throws Exception {
		try {
			System.out.println("Click on Edit icon to update profile");
			//Thread.sleep(1000);			
			profile.updateprofiledetails();
			System.out.println("Profile Info updated successfully..");			
		}catch(Exception e) {
			System.out.println("Update User Details Setpdefinition not found......");
		}
	
		
	}

	@And("User update the password")
	public void User_update_the_password() throws Exception {
		try {
			System.out.println("Click on Edit icon to update profile");				
			String pswd = context.getConfigFileReader().getValidPassword();
			profile.updatepassword(pswd);
			System.out.println("Password updated successfully..");
		}catch(Exception e) {
			System.out.println("User_Update_the_Password stepdefinition not found......");
		}
		
	}

	@And("Upload the Profile picture")
	public void upload_the_Profile_picture() throws Exception {
		try {
			System.out.println("Click on Edit icon to update Profile image");						
			profile.Uploadpic();
			System.out.println("Profile Image uploaded successfully..");
		}catch(Exception e) {
			System.out.println("Upload_the_Profile_picture Stepdefinition not found.....");
		}
		
	}



}
	    

