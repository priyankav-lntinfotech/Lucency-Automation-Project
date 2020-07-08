package stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobject.LoginPage;
import pageobject.TestSessionPage;

public class TestSession {
	
private TestContext context;
	
	public TestSession(TestContext context) {
		this.context = context;
	}
	WebDriver driver;
	//LucencyLogicPage lucency;
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

	/*@Then("click on Developer")
	public void click_on_DevTools() {
	    try {
	    	session.linkDevTools();
	    	System.out.println("DevTools link clicked.....");
	    }catch (Exception e) {
	    	System.out.println("DevTools link not clicked.....");
	    }
	}*/

	@Then("click on Test Session")
	public void click_on_Test_Session() {
		try {
			System.out.println("In side Test session method");
			Thread.sleep(1000);
			session.linkTestSession();	    	
	    	System.out.println("TestSessions link clicked.....");
	    }catch (Exception e) {
	    	System.out.println("TestSessions stepdefinition link not clicked.....");
	    }
	}

	@Then("click on Add Test Session button")
	public void click_on_Add_Test_Session_button() throws Exception {
		Thread.sleep(2000);
	    session.btn_AddTestSession();
	    Thread.sleep(3000);
	}

	@Then("select Campaign and Expiration date")
	public void select_Campaign_and_Expiration_date() throws Exception {
	    Thread.sleep(2000);
	    session.dropDown_SelectCampaign();
	    System.out.println("Campaign selected from the drop-down list.........................");
	    Thread.sleep(2000);
	    session.select_ExpirationDate();
	    System.out.println("Exp Date selected from the calender..........");
	}

	@Then("select number")
	public void select_number() throws Exception {
	    Thread.sleep(2000);
	    session.select_Numbers();
	    System.out.println("Number selected from the list.................");
	}

	@Then("add session data")
	public void add_session_data() throws Throwable {
	    Thread.sleep(2000);
	    session.enter_SessionData();
	    System.out.println("Session data entered.......................");
	}

	@Then("click on Create button")
	public void click_on_Create_button() throws Exception {
	    Thread.sleep(2000);
	    session.btn_Create_Method();
	    System.out.println("Create button clicked.................");
	    Thread.sleep(2000);
	    session.successPopUp_Method();
	    System.out.println("Success pop up closed...............");
	    Thread.sleep(2000);
	}
	
	@Then("Delete the created Test Session")
	public void Delete_the_created_Test_Session() throws Exception {
	    Thread.sleep(3000);
	    session.delete_Test_Session_Method();
	    System.out.println("Inside Deleting Test Session.................");
	    Thread.sleep(2000);
	    session.successPopUp_Method();
	    System.out.println("Deleting Test Session Method Not Found..............");
	}


}
