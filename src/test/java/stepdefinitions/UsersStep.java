package stepdefinitions;

import org.openqa.selenium.WebDriver;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPage;
import pageobject.UsersPage;

public class UsersStep {
	
private TestContext context;
	
	public UsersStep(TestContext context) {
		this.context = context;
	}
	WebDriver driver;
	LoginPage login;
	UsersPage up;
	
	@Given("User navigate to Users Module")
	public void user_navigate_to_Users_Module() throws Exception {
		try {
			login = context.getPageObjectManager().getLogingPage();
			login.doValidLogin(context.getConfigFileReader().getValidEmail(), 
					context.getConfigFileReader().getValidPassword());
			Thread.sleep(3000);
			up = context.getPageObjectManager().getUsersPage();
			System.out.println("Navigate to Developer Portal page.......");
			Thread.sleep(3000);
			up.Account_SideMenu_Method();
		}catch (Exception e) {
			System.out.println("Unable to click on API Key Side Menu Link............");
			throw e;
		}
	}

	@When("User is on Users page")
	public void user_is_on_Users_page() throws Exception {
	    try {
			up.verify_Manage_Users_Page_Method();
		}catch (Exception e) {
			System.out.println("Unable to click on API Key Side Menu Link............");
			throw e;
		}
	}
	
	@Then("User will click on Add User button")
	public void user_will_click_on_Add_User_button() throws Exception {
		try {
			up.click_Add_User_Button_Method();
		}catch (Exception e) {
			System.out.println("Unable to click on API Key Side Menu Link............");
			throw e;
		}
	}	
	
	@Then("User will fill user details")
	public void user_will_fill_user_details() throws Exception {
		try {
			up.enter_FirstName_Method();
			up.enter_LastName_Method();
			up.enter_Email_Method();
			up.reEnterEmail_Method();
			up.enter_Contact_Method();			
		}catch (Exception e) {
			System.out.println("Unable to click on API Key Side Menu Link............");
			throw e;
		}
	}
	
	@And("Click on Save button")
	public void Click_on_Save_button() throws Exception {
		try {
			up.click_Save_Button_Method();
		}catch (Exception e) {
			System.out.println("Unable to click on API Key Side Menu Link............");
			throw e;
		}
	}
	

	@Then("Edit the user")
	public void edit_the_user() {
	    
	}

	@And("Delete that user")
	public void delete_that_user() {
	    
	}

}
