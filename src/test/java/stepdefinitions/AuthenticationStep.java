package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.AuthenticationPage;
import pageobject.LoginPage;

public class AuthenticationStep {
	
private TestContext context;
	
	public AuthenticationStep(TestContext context) {
		this.context = context;
	}
	WebDriver driver;
	LoginPage login;
	AuthenticationPage authentication;
	

	@Given("User landed on Developer Portal")
	public void user_landed_on_Developer_Portal() throws Exception {
		try {
			login = context.getPageObjectManager().getLogingPage();
			login.doValidLogin(context.getConfigFileReader().getValidEmail(), 
					context.getConfigFileReader().getValidPassword());
			//Thread.sleep(3000);
			authentication = context.getPageObjectManager().getAuthenticationPage();
			System.out.println("Navigate to Developer Portal page.......");
		}catch (Exception e) {
			System.out.println("Could not navigate to Developer Portal link.....");
			throw e;
		}
	}

	@When("User click on Agent Pop side menu")
	public void User_click_on_Agent_Pop_side_menu() {
	   try {		   
		   authentication.agentPop_SideMenu_Method();
		   System.out.println("Inside agentPop_SideMenu_Method..........");
	   }catch (Exception e) {
		   System.out.println("Agent_Pop Side_Menu Not Found............");
	   }		
	}

	@Then("click on Authentication")
	public void click_on_Authentication() {
	    try {	    	
	    	authentication.authentication_Sub_Menu_Method();
	    	System.out.println("Inside click_on_Authentication Stepdefinition Method.........");
	    }catch (Exception e) {
	    	System.out.println("Click_on_Authentication Stepdefinition Method Not Found.........");
	    }
	}

	@Then("click on Add Address")
	public void click_on_Add_Address() throws Exception{
		try {			
	    	authentication.authentication_Add_Address_Method();
	    	System.out.println("Add_Address Stepdefinition Method.........");
	    }catch (Exception e) {
	    	System.out.println("Add_Address Stepdefinition Method Not Found.........");
	    }
	}
	
	@Then("add IP Address and Label")
	public void add_IP_Address_and_Label() throws Exception {
		try {	    	
	    	authentication.authentication_Enter_IP_Address();	 	    	
	    	authentication.authentication_Enter_Label();	    	
	    }catch (Exception e) {
	    	System.out.println("add IP_Address and Label Stepdefinition Method Not Found.........");
	    }	    
	}	

	@And("click on Save")
	public void click_on_Save() {
	    try {	    	
	    	authentication.authentication_Click_SaveButton();	    	
	    	authentication.authentication_Close_Success_PopUp();
	    }catch(Exception e) {
	    	System.out.println("Click On Save Stepdefinition Not found...........");
	    }
	}
	
	
	@Then("Edit IP Address")
	public void edit_IP_Address() {
		 try {		    	
		    	authentication.authentication_Edit_IP_Address();		    	
		    	authentication.authentication_Update_Label();		    	
		    	authentication.authentication_Click_SaveButton();		    	
		    	authentication.authentication_Close_Success_PopUp();
		    }catch(Exception e) {
		    	System.out.println("Click On Save Stepdefinition Not found...........");
		    }
	}

	@Then("Delete the IP Address")
	public void delete_the_IP_Address() {
		try {	    	
	    	authentication.authentication_Delete_IP_Address();	    	
	    	authentication.authentication_Delete_Confirmation_PopUP();	    	
	    	authentication.authentication_Close_Success_PopUp();
	    }catch(Exception e) {
	    	System.out.println("Click On Save Stepdefinition Not found...........");
	    }
	}	
	
}
