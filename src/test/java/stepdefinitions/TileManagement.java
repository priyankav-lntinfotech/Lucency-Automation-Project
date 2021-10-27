package stepdefinitions;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPage;
import pageobject.TileManagementPage;

public class TileManagement {
	
private TestContext context;
	
	public TileManagement(TestContext context) {
		this.context = context;
	}
	
	LoginPage login;
	TileManagementPage tile ;
	
	@Given("User navigate to Developer Portal")
	public void user_navigate_to_Developer_Portal() throws Exception {
		try {
			login = context.getPageObjectManager().getLogingPage();
			login.doValidLogin(context.getConfigFileReader().getValidEmail(), 
					context.getConfigFileReader().getValidPassword());
			Thread.sleep(3000);
			tile = context.getPageObjectManager().getTileManagementPage();
			System.out.println("Navigate to Developer Portal page.......");
			
		}catch (Exception e) {
			System.out.println("Could not navigate to Developer Portal link.....");
			throw e;
		}
		
	}
	
	
	@When("click on Coustomer Context Pop Header link")
	public void click_on_Coustomer_Context_Pop_Header_link() {
		try {
	    	tile.Customer_Context_pop();
	    	System.out.println("Customer_Context_pop stepdefinition executed successfully.....");
	    }catch (Exception e) {
	    	System.out.println("Customer_Context_pop stepdefinition not found.....");
	    }
	}

	@Then("select Tile Management option")
	public void select_Tile_Management_option() {
		try {
	    	tile.method_Tile_Management();
	    	System.out.println("Tile Management stepdefinition executed successfully....");
	    }catch (Exception e) {
	    	System.out.println("Tile Management stepdefinition not found....");
	    }
	}
	
	@Then("Create Single Variable Context Tile")
	public void create_Single_Variable_Context_Tile() {
		try {
			System.out.println("Create Single Variable Context Tile stepdefinition found.....");
	    	tile.method_CreateTile_button();
	    	tile.method_Select_Single_Variable();
	    	tile.method_Next_Button();
	    	tile.method_Enter_ContextTile_Name();
	    	tile.method_Enter_Variable();
	    	tile.method_Enter_Display_Name();
	    	tile.method_Create_Button();
	    	tile.method_Close_SuccessPop();	    	
	    }catch (Exception e) {
	    	System.out.println("Create Single Variable Context Tile stepdefinition not found....");
	    }
	}
	
	@Then("Edit the Tile")
	public void edit_the_Tile() {
		try {
			System.out.println("Edit tile stepdefinition found.....");
	    	tile.method_Action_Icon();
	    	tile.method_Edit_Action();
	    	tile.method_UpdateSingle_Tile();
	    	tile.method_SaveButton();
	    	tile.method_Confirmation_YES_Button();
	    	tile.method_Close_SuccessPop();
	    }catch (Exception e) {
	    	System.out.println("Edit tile stepdefinition not found.....");
	    }
	}

	@Then("Create Multi Variable Context Tile")
	public void create_Multi_Variable_Context_Tile() {
		try {
			Thread.sleep(500);
			System.out.println("Create Multi Variable Context Tile stepdefinition found.....");
	    	tile.method_CreateTile_button_2();
	    	tile.method_Select_Multi_Variable();
	    	tile.method_Next_Button();
	    	tile.method_Enter_Multi_ContextTIle_Name();
	    	tile.method_Enter_Multi_Variable_1();
	    	tile.method_Multi_DisplayName_1();
	    	tile.method_Add_Variable_link();
	    	tile.method_Enter_Multi_Variable_2();
	    	tile.method_Multi_DisplayName_2();
	    	tile.method_Create_Button();
	    	tile.method_Close_SuccessPop();	    		    	
	    }catch (Exception e) {
	    	System.out.println("Create Multi Variable Context Tile stepdefinition not found....");
	    }
	}		

	@Then("Delete the tile")
	public void delete_the_tile() {
	    try {
	    	System.out.println("Delete the tile stepdefinition found.....");
	    	tile.method_Action_Icon();
	    	tile.method_Delete_Action();
	    	tile.method_Confirmation_YES_Button();
	    	tile.method_Close_SuccessPop();
	    }catch (Exception e) {
	    	System.out.println("Delete the tile stepdefinition not found.....");
	    }
	}

}
