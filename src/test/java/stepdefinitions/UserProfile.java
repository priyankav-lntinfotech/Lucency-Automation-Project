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
			
			Thread.sleep(1000);
			
			homePage.clickonAccountSettings();
			
			Thread.sleep(1000);
		    profile.verifyAccountTitle();
		}
		catch(Exception e)
		{
			System.out.println("My Account Settings text not found" + e.toString());
			e.printStackTrace();
		}
	}
	
	@When("Click on Edit icon to update user details, password, profile pic")
	public void click_on_Edit_icon_to_update_user_details_password_profile_pic() throws Exception
	{
		System.out.println("Click on Edit icon to update profile");
		Thread.sleep(1000);
		
		profile.Editclick();
		System.out.println("Open in edit mode..");
	}

	@Then("update user details")
	public void update_user_details() throws Exception 
	{
		System.out.println("Click on Edit icon to update profile");
		Thread.sleep(1000);
		
		profile.updateprofiledetails();
		System.out.println("Profile Info updated successfully..");
	}

	@And("update password")
	public void update_password() throws Exception 
	{
		System.out.println("Click on Edit icon to update profile");
		Thread.sleep(1000);
		
		String pswd = context.getConfigFileReader().getValidPassword();
		profile.updatepassword(pswd);
		System.out.println("Password updated successfully..");
	}

	@And("upload Profile picture")
	public void upload_Profile_picture() throws Exception 
	{
		System.out.println("Click on Edit icon to update Profile image");
		Thread.sleep(1000);
				
		profile.Uploadpic();
		System.out.println("Profile Image uploaded successfully..");
	}



}
	    

