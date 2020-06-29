package stepdefinitions;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPage;
import pageobject.LucencyLogicPage;

public class LucencyLoginStep {
	
private TestContext context;
	
	public LucencyLoginStep(TestContext context) {
		this.context = context;
	}
	
	LucencyLogicPage lucency;
	LoginPage login;
	
	@Given("User navigate to login page and login to application")
	public void user_navigate_to_login_page() {
		login = context.getPageObjectManager().getLogingPage();
		login.doValidLogin(context.getConfigFileReader().getValidEmail(), 
				context.getConfigFileReader().getValidPassword());
		//lucency = context.getPageObjectManager().getLucencyLogicPage();
		//lucency.doValidLogin(context.getConfigFileReader().getValidEmail(), 
				//context.getConfigFileReader().getValidPassword());
	    
	}

	
}
