package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseActions;

public class TileManagementPage extends BaseActions{
	
	private static final String Test = null;




	public TileManagementPage(WebDriver driver) {
		super(driver);
		}
	
	
	By Customer_Context_Pop = By.xpath("//SPAN[@class='f-text'][text()='Customer Context Pop']");
	By Tile_Management = By.xpath("//A[@class='f-button f-bg-hover-10 f-color-w f-d-b f-l f-lh-38 f-pad-3-h f-rel f-size-14 f-w-100'][text()='Tile Management']");
	By CreateTile_Button = By.xpath("//SPAN[@class='f-title'][text()='Create Tile']");
	By Create_TileButton_2 = By.xpath("//SPAN[@class='f-title'][text()='Create Tile']");
	//("//span[@class='f-title'][text()='Create Tile']");
	By SingleVariable = By.xpath("//button[@value='single']");
	By MultiVariable = By.xpath("//button[@value='multi']");
	By Next_Button = By.xpath("//button[text()='Next']");
	By Context_Tile_Name = By.xpath("(//input[@id='context_tile_add_context_tile_name'])[1]");
	By Multi_ContextTIle_Name = By.xpath("//INPUT[@id='context_tile_add_context_tile_name']");
	By Variable = By.xpath("//input[@id='context_tile_add_name_variable']");
	By Display_Name = By.xpath("//input[@id='context_tile_add_name_display']");
	By Multi_Variable_1 = By.xpath("//input[@id='context_tile_attribute_custom_0_variable']");
	By Multi_DisplayName_1 = By.xpath("//input[@id='context_tile_attribute_custom_0_display']");
	By Add_Variable_link = By.xpath("(//span[@class='f-title'])[1]");
	By Multi_Variable_2 = By.xpath("//input[@id='context_tile_attribute_custom_1_variable']");
	By Multi_DisplayName_2 = By.xpath("//input[@id='context_tile_attribute_custom_1_display']");
	
	By Create_button = By.xpath("(//button[text()='Create'])[1]");
	By SuccessPopUp = By.xpath("//I[@class='icon icon-close-4 f-abs-all']");
	By Action_Icon = By.xpath("(//span[@class='f-icon f-abs-all'])[1]");
	By Edit_link = By.xpath("//button[text()='Edit']");
	By Edit_DisplayName = By.xpath("//input[@id='context_tile_edit_name_display']");
	By Save_button = By.xpath("(//button[text()='Save'])[1]");
	By Yes_button = By.xpath("//button[text()='Yes']");
	By Preview_link = By.xpath("//button[text()='Preview']");
	By DID_field = By.xpath("//input[@id='context_pop_session_name_did']");
	By ANI_field = By.xpath("//input[@id='context_pop_session_name_ani']");
	By Continue_button = By.xpath("//button[text()='Continue']");
	By Switch_To_ContextPop = By.xpath("//div[@id='modal-context-pop-session-content']");
	By Copy_Text_ContextPop = By.xpath("//div[text()='Context Pop:']");
	By Delete_link = By.xpath("//button[text()='Delete']");
	By Edit_Success_Pop = By.xpath("//button[@class='f-abs f-abs-r f-abs-t f-button f-container f-h-76 f-w-76 pure-input-1']");
	
			
	
	
	
	
	public void Customer_Context_pop() throws Exception {
		try {
			System.out.println("Inside Customer Context Pop Header Meathod");
			takeScreenShot("CustomerContextPop");
			clickElement(Customer_Context_Pop);
			System.out.println("Customer Context Pop Hearder dropdown clicked");							
		}catch (Exception e) {
			System.out.println("Customer Context Pop Hearder dropdown not found....");
			throw (e);
		}
	}
	
	public void method_Tile_Management() {
		try {
			System.out.println("Inside Tile_Management Meathod");
			clickElement(Tile_Management);
			takeScreenShot("TileManagementPage");
			System.out.println("Tile_Management option clicked....");
		}catch (Exception e) {
			System.out.println("method_Tile_Management not found....");
		}
	}
	
	
	public void method_CreateTile_button() {
		try {
			System.out.println("Inside method_CreateTile_button");
			takeScreenShot("CreateTilePopup");
			Thread.sleep(500);
			clickElement(CreateTile_Button);
			System.out.println("CreateTile_button clicked....");
			takeScreenShot("CreateTilePopUp");
		}catch (Exception e) {
			System.out.println("method_CreateTile_button not found....");
		}
	}
	
	public void method_CreateTile_button_2() {
		try {
			System.out.println("Inside method_CreateTile_button_2");
			Thread.sleep(500);
			clickElement(Create_TileButton_2);
			System.out.println("CreateTile_button clicked....");
		}catch (Exception e) {
			System.out.println("method_CreateTile_button_2 not found....");
		}
	}
	
	
	public void method_Select_Single_Variable() {
		try {
			System.out.println("Inside method_Select_Single_Variable");
			clickElement(SingleVariable);
			System.out.println("Single_Variable Selected....");
		}catch (Exception e) {
			
		}
	}
	
	public void method_Select_Multi_Variable() {
		try {
			System.out.println("Inside method_Select_Multi_Variable");
			clickElement(MultiVariable);
			System.out.println("MultiVariable selected.....");
		}catch (Exception e) {
			System.out.println("method_Select_Multi_Variable not found.....");
		}
	}
	
	public void method_Next_Button() {
		try {
			System.out.println("Inside Method Next_Button");
			clickElement(Next_Button);
			System.out.println("Next_Button clicked....");
		}catch (Exception e) {
			System.out.println("Method Next_button not found....");
		}
	}
	
	public void method_Enter_ContextTile_Name() {
		try {
			System.out.println("Inside method_Enter_ContextTile_Name");
			//setElementText(Context_Tile_Name, "CustomVariable Single Tile");
			String ContextTileName = generateNewWord(7);
			setElementText(Context_Tile_Name, ContextTileName);
			System.out.println("Context_Tile_Name entered.....");
		}catch (Exception e) {
			System.out.println("method_Enter_ContextTile_Name not found.....");
		}
	}
	
	public void method_Enter_Multi_ContextTIle_Name() {
		try {
			System.out.println("Inside method_Enter_Multi_ContextTIle_Name");
			//setElementText(Context_Tile_Name, "CustomVariable Single Tile");
			String ContextTileName = generateNewWord(7);
			setElementText(Multi_ContextTIle_Name, ContextTileName);
			System.out.println("Multi_Context_Tile_Name entered.....");
		}catch (Exception e) {
			System.out.println("method_Enter_Multi_ContextTIle_Name not found.....");
		}
	}
	
	public void method_Enter_Variable() {
		try {
			System.out.println("Inside Method Enter_Variable");
			setElementText(Variable, "checkout");
			System.out.println("Variable entered....");
		}catch (Exception e) {
			System.out.println("Method Enter_Variable not found....");
		}
	}
	
	public void method_Enter_Multi_Variable_1() {
		try {
			System.out.println("Inside method_Enter_Multi_Variable_1");
			setElementText(Multi_Variable_1, "conversion");
			System.out.println("Multi_Variable_1 entered successfully.....");
		}catch (Exception e) {
			System.out.println("method_Enter_Multi_Variable_1 not found.....");
		}
	}
	
	public void method_Enter_Multi_Variable_2() {
		try {
			System.out.println("Inside method_Enter_Multi_Variable_2");
			setElementText(Multi_Variable_2, "checkout");
			System.out.println("Multi_Variable_2 entered successfully.....");
		}catch (Exception e) {
			System.out.println("method_Enter_Multi_Variable_2 not found.....");
		}
	}
	
	public void method_Add_Variable_link() {
		try {
			System.out.println("Inside method_Add_Variable_link");
			clickElement(Add_Variable_link);
			System.out.println("method_Add_Variable_link clicked.....");
		}catch (Exception e) {
			System.out.println("method_Add_Variable_link not found.....");
		}
	}
	
	public void method_Enter_Display_Name() {
		try {
			System.out.println("Inside Method Display_Name");
			setElementText(Display_Name, "TestData");
			System.out.println("Display_Name entered....");
		}catch (Exception e) {
			System.out.println("Method Enter_Display_Name not found....");
		}
	}
	
	public void method_Multi_DisplayName_1() {
		try {
			System.out.println("Inside method_Multi_DisplayName_1");
			setElementText(Multi_DisplayName_1, "CON");
			System.out.println("method_Multi_DisplayName_1 entered....");
		}catch (Exception e) {
			System.out.println("method_Multi_DisplayName_1 not found....");
		}
	}
	
	public void method_Multi_DisplayName_2() {
		try {
			System.out.println("Inside method_Multi_DisplayName_2");
			setElementText(Multi_DisplayName_2, "CHECK");
			System.out.println("method_Multi_DisplayName_2 entered....");
		}catch (Exception e) {
			System.out.println("method_Multi_DisplayName_2 not found....");
		}
	}
	
	public void method_Create_Button() {
		try {
			System.out.println("Inside Method Create_Button");
			clickElement(Create_button);
			System.out.println("Create_Button clicked....");
		}catch (Exception e) {
			System.out.println("Method Create_Button not found....");
		}
	}
	
	public void method_Action_Icon() {
		try {
			System.out.println("Inside method_Action_Icon");
			clickElement(Action_Icon);
			System.out.println("Action_Icon clicked.....");
		}catch (Exception e) {
			System.out.println("method_Action_Icon not found.....");
		}
	}
	
	public void method_UpdateSingle_Tile() {
		try {
			System.out.println("Inside method_UpdateSingle_Tile");
			clearElement(Edit_DisplayName);
			System.out.println("Display_Name removed.....");
			setElementText(Edit_DisplayName, "CheckOut");
			System.out.println("New display name entered.....");			
		}catch (Exception e) {
			System.out.println("method_Action_Icon not found.....");
		}
	}
	
	public void method_Edit_Action() {
		try {
			System.out.println("Inside method_Edit_Action");
			clickElement(Edit_link);
			System.out.println("method_Edit_Action link clicked.....");			
		}catch (Exception e) {
			System.out.println("method_Edit_Tile not found....");
		}
	}	
	
	public void method_SaveButton() {
		try {
			System.out.println("Inside method_SaveButton");
			clickElement(Save_button);
			System.out.println("Save button clicked.....");
		}catch (Exception e) {
			System.out.println("method_SaveButton not found.....");
		}
	}
	
	public void method_Confirmation_YES_Button() {
		try {
			System.out.println("Inside method_Confirmation_YES_Button");
			clickElement(Yes_button);
			System.out.println("Confirmation Yes_button clicked.....");
		}catch (Exception e) {
			System.out.println("method_Confirmation_YES_Button not found.....");
		}
	}
	
	public void method_Close_SuccessPop() {
		try {
			System.out.println("Inside method_Close_SuccessPop.....");
			clickElement(SuccessPopUp);
			System.out.println("Success pop-up closed.....");
		}catch (Exception e) {
			System.out.println("method_Close_SuccessPop not found.....");
		}
	}
	
	public void method_Delete_Action() {
		try {
			System.out.println("Inside method_DeleteTile");
			clickElement(Delete_link);
			System.out.println("Delete link clicked.....");			
		}catch (Exception e) {
			System.out.println("method_DelteTile not found.....");
		}
	}

}
