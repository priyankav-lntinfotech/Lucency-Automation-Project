package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Base.BaseActions;

public class APIKeysPage extends BaseActions{

	public APIKeysPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	By APIKey_SideMenu = By.xpath("//SPAN[@class='f-title'][text()='API Keys']");
	By API_Create_API_Btn = By.xpath("//SPAN[@class='f-title'][text()='Create API Key']");
	By API_Enter_API_Name = By.xpath("//input[@id='api_key_add_name']");
	By API_Click_API_DropDown = By.xpath("//div[@class='p-choice-item p-choice-item-selectable']");
	By API_Select_API_Type = By.xpath("//div[@id='choices--api_key_add_type-item-choice-3']");
	By API_Scroll_Down = By.xpath("//DIV[@class='tingle-modal tingle-modal--overflow tingle-modal--visible']");
	By API_Save_Btn = By.xpath("//button[@id='create-api-key']");
	By Model_Msg = By.xpath("//div[@class='f-title f-bold f-color-b f-lh-38 f-size-32 f-title'][text()='Success!']");
	By PopUp_TxtMsg = By.xpath("//div[@class='f-subtitle f-wb-w']");
	By SuccessPopUp_CloseBtn = By.xpath("(//I[@class='icon icon-close-4 f-abs-all'])[1]");	
	By Integration_Link = By.xpath("(//SPAN[@class='f-title f-underline'][text()='Integration'][text()='Integration'])[1]");
	By Integration_DropDown = By.xpath("(//div[@class='p-choice-inner'])[1]");	
	By Select_Google_Add = By.xpath("//div[@id='choices--api_key_integration_title-item-choice-2']");	
	By Next_Button = By.xpath("//button[@class='f-bg-1 f-bold f-button f-c f-color-w f-h-40 f-lh-40 f-pad-1-h f-size-14 f-w-175 pure-input-1'][text()='Next']");
	By Open_TimeZone = By.xpath("(//div[@class='p-choice-inner'])[1]");
	By Select_Time_Zone = By.xpath("//div[@id='choices--api_key_integration_google_add_time_zone-item-choice-2']");
	By Offline_Conversion_Name = By.xpath("//input[@id='api_key_integration_google_add_offline_conversion_name']");
	By call_conversion_name = By.xpath("//input[@id='api_key_integration_google_add_click_to_call_conversion_name']");
	By Save_Integration_Button = By.xpath("(//BUTTON[@class='f-bg-1 f-bold f-button f-c f-color-w f-h-40 f-lh-40 f-pad-1-h f-size-14 f-w-175 pure-input-1'][text()='Save'][text()='Save'])[1]");
	By Close_Integration_Success_PopUp = By.xpath("(//I[@class='icon icon-close-4 f-abs-r f-abs-v'])[1]");
	By Open_Integrations_Column = By.xpath("(//span[@class='f-l f-title'][text()='See All'][text()='See All'])[1]");
	By Deactivate_API_Key_Button = By.xpath("(//span[@class='f-d-b f-l f-title f-underline'][text()='Deactivate'][text()='Deactivate'])[1]");
	By Deactivate_API_Key_Confirmation = By.xpath("//BUTTON[@class='f-button f-button pure-input-1 f-bg-1 f-bold f-c f-color-w f-h-40 f-lh-40 f-pad-1-h f-size-14 f-w-175'][text()='Deactivate']");
	By Deactivate_API_Success_PopUp = By.xpath("(//I[@class='icon icon-close-4 f-abs-all'])[1]");
	
	
	public void apiKey_SideMenu_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(APIKey_SideMenu);
			System.out.println("APIKey Side Menu Link Clicked............");
		}catch (Exception e) {
			System.out.println("APIKey_SideMenu Link Not Found...........");
			throw (e);
		}
	}
	
	
	public void create_API_btn_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(API_Create_API_Btn);
			System.out.println("Create_API_BUtton Clicked............");
		}catch (Exception e) {
			System.out.println("Create_API_BUtton not Clicked............");
			throw (e);
		}
	}
	
	
	public void enter_ApiKeyName_Method() throws Exception {
		try {
			Thread.sleep(2000);
			//clickElement(Enter_API_Name);
			setElementText(API_Enter_API_Name, "MandarAuto");
			System.out.println("API Name Entered............");
		}catch (Exception e) {
			System.out.println("API Name Not Entered............");
			throw (e);
		}
	}
	
	
	public void select_API_Type_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(API_Click_API_DropDown);
			System.out.println("API Type DropDown Clicked............");
			Thread.sleep(2000);
			clickElement(API_Select_API_Type);
			System.out.println("API_Type Selected...................");
		}catch (Exception e) {
			System.out.println("API Type DropDown Not Clicked............");
			throw (e);
		}
	}
	
	
	/*public void select_API_Type_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(API_Select_API_Type);
			System.out.println("API_Type Selected...................");
		}catch (Exception e) {
			System.out.println("API Type DropDown Not Clicked............");
			throw (e);
		}
	}*/
	
	
	public void scroll_Down_Method() throws Exception {
		try {
			Thread.sleep(2000);
			//clickElement(API_Scroll_Down);
			System.out.println("Inside Scroll down Method.....................");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			System.out.println("Scroll Successfull...................");
		}catch (Exception e) {
			System.out.println("Unable to Scroll.....................");
			throw (e);
		}
	}
	
	
	
	public void click_Save_Btn_Method() throws Exception {
		try {
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			clickElement(API_Save_Btn);
			System.out.println("Save Button Clicked...................");
		}catch (Exception e) {
			System.out.println("Save Button Not Clicked...............");
			throw (e);
		}
	}
	
	public void successPopUp_Method() {		
		try {			
			Thread.sleep(3000);
			if (!driver.findElement(Model_Msg).getText().equals("Error!")) {
				System.out.println("Test Session Successflly Created......"+ driver.findElement(Model_Msg).getText());
				Thread.sleep(1000);
				clickElement(SuccessPopUp_CloseBtn);
		    	System.out.println("SuccessPopUp_CloseBtn clicked......");				
		     }else {		    	 
		    	 System.out.println(driver.findElement(Model_Msg).getText()+"--------"+ driver.findElement(PopUp_TxtMsg).getText());
		    	 Assert.fail();
		     }					
		}catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
	}
	
	public void click_Integration_Link() throws Exception {
		try {			
			Thread.sleep(2000);
			clickElement(Integration_Link);
			System.out.println("Integration_Link Clicked...................");
		}catch (Exception e) {
			System.out.println("Integration_Link Not Clicked...............");
			throw (e);
		}
	}
	
	/*public void apiKey_Integration_Link_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(API_Integration_Link);
			System.out.println("Integration_Link Clicked............");
		}catch (Exception e) {
			System.out.println("Integration_Link Not Clicked...........");
			throw (e);
		}
	}*/
	
	public void open_Integration_DropDown_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(Integration_DropDown);
			System.out.println("Integration_DroDown Clicked............");
		}catch (Exception e) {
			System.out.println("Integration_DroDown Not Clicked...........");
			throw (e);
		}
	}
	
	public void select_Integration_Value_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(Select_Google_Add);
			System.out.println("Google Ads Upload Selected............");
		}catch (Exception e) {
			System.out.println("Google Ads Upload Not Selected...........");
			throw (e);
		}
	}
	
	public void click_Next_Button_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(Next_Button);
			System.out.println("Next_Button Clicked............");
		}catch (Exception e) {
			System.out.println("Next_Button Not Clicked...........");
			throw (e);
		}
	}
	
	public void click_TimeZone_Dropdown_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(Open_TimeZone);
			System.out.println("Time Zone Drop-Down Open............");
		}catch (Exception e) {
			System.out.println("Time Zone Drop-Down Not Open...........");
			throw (e);
		}
	}
	
	public void Select_Time_Zone_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(Select_Time_Zone);
			System.out.println("Time Zone Selected............");
		}catch (Exception e) {
			System.out.println("Time Zone Not Selected...........");
			throw (e);
		}
	}
	
	public void enter_Offline_Conversion_Name__Method() throws Exception {
		try {
			Thread.sleep(2000);
			//clickElement(Offline_Conversion_Name);
			setElementText(Offline_Conversion_Name, "Test");
			System.out.println("Offline_Conversion_Name Entered............");
		}catch (Exception e) {
			System.out.println("Offline_Conversion_Name Not Entered...........");
			throw (e);
		}
	}
	
	public void enter_Call_Conversion_Name_Method() throws Exception {
		try {
			Thread.sleep(2000);
			//clickElement(call_conversion_name);
			setElementText(call_conversion_name, "Test123");
			System.out.println("Call_conversion_name Entered............");
		}catch (Exception e) {
			System.out.println("API_call_conversion_name Not Entered...........");
			throw (e);
		}
	}
	
	public void click_Save_Integration_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(Save_Integration_Button);
			System.out.println("Save_Integration Button Clicked............");
		}catch (Exception e) {
			System.out.println("Save_Integration Button Not Clicked...........");
			throw (e);
		}
	}
	
	public void close_Integration_Success_PopUp_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(Close_Integration_Success_PopUp);
			System.out.println("Integration_Success_PopUp Closed............");
			Thread.sleep(1000);
		}catch (Exception e) {
			System.out.println("Integration_Success_PopUp Not Closed...........");
			throw (e);
		}
	}
	
	public void Open_Integrations_Column_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(Open_Integrations_Column);
			System.out.println("Google Ads Upload successfully added in Integrations Column............");
		}catch (Exception e) {
			System.out.println("Google Ads Upload Not Added In Integrations Column...........");
			throw (e);
		}
	}
	
	public void deactivate_The_API_Method() throws Exception {
		try {
			Thread.sleep(1000);
			clickElement(Deactivate_API_Key_Button);
			Thread.sleep(1000);
			clickElement(Deactivate_API_Key_Confirmation);
			System.out.println("API Key Deactivated Successfully............");
			clickElement(Deactivate_API_Success_PopUp);
			System.out.println("Deactivate_API_Success_PopUp Closed Successfully............");
		}catch (Exception e) {
			System.out.println("Unable To Deactivated API Key...........");
			throw (e);
		}
	}

}
