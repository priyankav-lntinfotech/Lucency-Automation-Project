package stepdefinitions;

import org.openqa.selenium.WebDriver;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobject.APIKeysPage;
import pageobject.LoginPage;

public class APIKeysStep {
	
private TestContext context;
	
	public APIKeysStep(TestContext context) {
		this.context = context;
	}
	WebDriver driver;
	LoginPage login;
	APIKeysPage apikey;
	
	@Given("User navigate to API Keys Module")
	public void user_navigate_to_API_Keys_Module() throws Exception {
		try {
			login = context.getPageObjectManager().getLogingPage();
			login.doValidLogin(context.getConfigFileReader().getValidEmail(), 
					context.getConfigFileReader().getValidPassword());
			Thread.sleep(3000);
			apikey = context.getPageObjectManager().getAPIKeysPage();
			System.out.println("Navigate to Developer Portal page.......");
			Thread.sleep(3000);
			apikey.apiKey_SideMenu_Method();
		}catch (Exception e) {
			System.out.println("Unable to click on API Key Side Menu Link............");
			throw e;
		}
	}

		
	@Then("Click on Create API Keys")
	public void click_on_Create_API_Keys() throws Exception {
		 try {
		    	Thread.sleep(1000);
		    	apikey.create_API_btn_Method();
		    	
		    }catch (Exception e) {
				System.out.println("click_on_Create_API_Keys Stepdefinition Not Found............");
				throw e;
			}
	}

	@Then("Enter API details")
	public void enter_API_details() throws Exception {
		try {
	    	Thread.sleep(500);
	    	apikey.enter_ApiKeyName_Method();	
	    	Thread.sleep(500);
	    	//apikey.select_API_Type_Method();
	    	//Thread.sleep(1000);
	    	apikey.select_API_Type_Method();
	    }catch (Exception e) {
			System.out.println("enter_API_details Stepdefinition Not Found............");
			throw e;
		}
	}

	@Then("Save the details")
	public void save_the_details() throws Exception {
		try {			
	    	Thread.sleep(1000);
			apikey.scroll_Down_Method();
	    	Thread.sleep(500);
	    	apikey.click_Save_Btn_Method();
	    	Thread.sleep(500);
	    	apikey.successPopUp_Method();
	    }catch (Exception e) {
			System.out.println("............");
			throw e;
		}
	}
	
	
	@Then("Click on Integration Link")
	public void click_on_Integration_Link() throws Exception {
		try {			
	    	Thread.sleep(500);
			apikey.click_Integration_Link();
	    }catch (Exception e) {
			System.out.println("............");
			throw e;
		}
	}

	@Then("Select Integration")
	public void select_Integration() throws Exception {
		try {			
	    	Thread.sleep(500);
			apikey.open_Integration_DropDown_Method();
			Thread.sleep(500);
			apikey.select_Integration_Value_Method();
	    }catch (Exception e) {
			System.out.println("............");
			throw e;
		}
	}

	@Then("Click on Next Button")
	public void click_on_Next_Button() throws Exception {
		try {			
	    	Thread.sleep(500);
			apikey.click_Next_Button_Method();
	    }catch (Exception e) {
			System.out.println("............");
			throw e;
		}
	}

	@Then("Select Time Zone")
	public void select_Time_Zone() throws Exception {
		try {			
	    	Thread.sleep(500);
			apikey.click_TimeZone_Dropdown_Method();
			Thread.sleep(500);
			apikey.Select_Time_Zone_Method();
	    }catch (Exception e) {
			System.out.println("............");
			throw e;
		}
	}

	@Then("Enter offline conversion name")
	public void enter_offline_conversion_name() throws Exception {
		try {			
	    	Thread.sleep(500);
			apikey.enter_Offline_Conversion_Name__Method();
	    }catch (Exception e) {
			System.out.println("............");
			throw e;
		}
	}

	@Then("Enter click to call conversion name")
	public void enter_click_to_call_conversion_name() throws Exception {
		try {			
	    	Thread.sleep(500);
			apikey.enter_Call_Conversion_Name_Method();
	    }catch (Exception e) {
			System.out.println("............");
			throw e;
		}
	}

	@Then("Click on Save button")
	public void click_on_Save_button() throws Exception {
		try {			
	    	Thread.sleep(500);
			apikey.click_Save_Integration_Method();
			Thread.sleep(500);
			apikey.close_Integration_Success_PopUp_Method();
	    }catch (Exception e) {
			System.out.println("............");
			throw e;
		}
	}

	@Then("Check the Integrations column")
	public void check_the_Integrations_column() throws Exception {
		try {			
	    	Thread.sleep(500);
			apikey.Open_Integrations_Column_Method();
	    }catch (Exception e) {
			System.out.println("............");
			throw e;
		}
	}

	@Then("Deactivate the API")
	public void deactivate_the_API() throws Exception {
		try {			
	    	Thread.sleep(500);
			apikey.deactivate_The_API_Method();
		}catch (Exception e) {
			System.out.println("............");
			throw e;
		}
	}


}
