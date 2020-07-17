package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPage;
import pageobject.TestSessionPage;

public class TestSession {
	
private TestContext context;
	
	public TestSession(TestContext context) {
		this.context = context;
	}
	WebDriver driver;
	LoginPage login;
	TestSessionPage session;
	
	@Given("User navigate to Developer Portal")
	public void user_navigate_to_Developer_Portal() throws Exception {
		try {
			login = context.getPageObjectManager().getLogingPage();
			login.doValidLogin(context.getConfigFileReader().getValidEmail(), 
					context.getConfigFileReader().getValidPassword());
			Thread.sleep(3000);
			session = context.getPageObjectManager().getTestSessionPage();
			System.out.println("Navigate to Developer Portal page.......");
			
		}catch (Exception e) {
			System.out.println("Could not navigate to Developer Portal link.....");
			throw e;
		}
		
	}
	
	@When("click on Test Session")
	public void click_on_Test_Session() {
		try {
			System.out.println("In side Test session method");			
			session.linkTestSession();	    	
	    	System.out.println("TestSessions link clicked.....");
	    }catch (Exception e) {
	    	System.out.println("click_on_Test_Session stepdefinition not found.....");
	    }
	}

	@Then("click on Add Test Session button")
	public void click_on_Add_Test_Session_button() throws Exception {	    
	    try {
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			session.btn_AddTestSession(); 	
	    	System.out.println("Inside Add Test Session Stepdefination.....");
	    }catch (Exception e) {
	    	System.out.println("Add_Test_Session Stepdefination not found.....");
	    }
	}

	@Then("select Campaign and Expiration date")
	public void select_Campaign_and_Expiration_date() throws Exception {
		try {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	session.dropDown_SelectCampaign();
		    System.out.println("Campaign selected from the drop-down list.........................");	    
		    session.select_ExpirationDate();
		    System.out.println("Exp Date selected from the calender..........");
	    }catch (Exception e) {
	    	System.out.println("select_Campaign_and_Expiration_date Stepdefination not found.....");
	    }
	    
	}

	@Then("select number")
	public void select_number() throws Exception {
		try {
			session.select_Numbers();
		    System.out.println("Number selected from the list.................");
	    }catch (Exception e) {
	    	System.out.println("select_number stepdefinition not found.....");
	    }	    
	}

	@Then("add session data")
	public void add_session_data() throws Throwable {	
		try {
			session.enter_SessionData();
		    System.out.println("Session data entered.......................");
	    }catch (Exception e) {
	    	System.out.println("Add_session_data stepdefinition not found.....");
	    }	    
	}

	@And("click on Create button")
	public void click_on_Create_button() throws Exception {	    
		try {
			session.btn_Create_Method();
		    System.out.println("Create button clicked.................");	    
		    session.successPopUp_Method();
		    System.out.println("Success pop up closed...............");
	    }catch (Exception e) {
	    	System.out.println("click_on_Create_button stepdefinition not found.....");
	    }	    	    
	}
	
	@Then("Edit the Test Session")
	public void edit_the_Test_Session() {
		try {
			session.edit_TestSession_Method();
	    }catch (Exception e) {
	    	System.out.println("Edit_Test_Session stepdefination not found.............");
	    }
	    
	}
	
	@Then("Delete the created Test Session")
	public void Delete_the_created_Test_Session() throws Exception {
		try {
			session.delete_Test_Session_Method();
		}catch (Exception e) {
	    	System.out.println("Delete_the_created_Test_Session stepdefinition not found.....");
	    }	    	    
	}


}
