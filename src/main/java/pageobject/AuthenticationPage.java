package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Base.BaseActions;

public class AuthenticationPage extends BaseActions{
	
	public AuthenticationPage(WebDriver driver) {
		super(driver);
		}

	By AgentPop_SideMenu = By.xpath("(//SPAN[@class='f-title'][text()='Agent Pop'])[1]");
	By Authentication_SubMenu = By.xpath("//SPAN[@class='f-title'][text()='Authentication']");
	By Add_Address_button = By.xpath("//span[@class='f-title'][text()='Add Address']");
	By Enter_IP_Address = By.xpath("//INPUT[@id='ip_address_add_ip_address']");
	By Enter_IP_Lable = By.xpath("//INPUT[@id='ip_address_add_label']");
	By Save_Button = By.xpath("(//BUTTON[@class='f-bg-1 f-bold f-button f-c f-color-w f-h-40 f-lh-40 f-pad-1-h f-size-14 f-w-175 pure-input-1'][text()='Save'][text()='Save'])[1]");
	By SuccessPopUp_Close = By.xpath("//I[@class='icon icon-close-4 f-abs-all']");
	By Edit_IP = By.xpath("(//SPAN[@class='f-title f-underline'][text()='Edit'][text()='Edit'])[1]");
	By Delete_IP = By.xpath("(//SPAN[@class='f-title f-underline'][text()='Delete'][text()='Delete'])[1]");
	By Delete_Confirmation = By.xpath("//BUTTON[@class='f-button f-button pure-input-1 f-bg-1 f-bold f-c f-color-w f-h-40 f-lh-40 f-pad-1-h f-size-14 f-w-175'][text()='Yes']");
	
	
	
	public void agentPop_SideMenu_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(AgentPop_SideMenu);
			System.out.println("Agent Pop Side Menu Clicked...........");
		}catch (Exception e) {
			System.out.println("Agent Pop Side Menu Not Found...........");
			throw (e);
		}
	}
	
	public void authentication_Sub_Menu_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(Authentication_SubMenu);
			System.out.println("Authentication Sub_Menu Link Clicked...........");
		}catch (Exception e) {
			System.out.println("Authentication Sub_Menu Link Not Found...........");
			throw (e);
		}
	}
	
	public void authentication_Add_Address_Method() throws Exception {
		try {
			Thread.sleep(2000);
			clickElement(Add_Address_button);
			System.out.println("Add_Address_button Clicked...........");
		}catch (Exception e) {
			System.out.println("Add_Address_button Not Found...........");
			throw (e);
		}
	}
	
	public void authentication_Enter_IP_Address() {
		try {
			Thread.sleep(2000);
			//clickElement(Enter_IP_Address);
			setElementText(Enter_IP_Address, "10.21.101.20");
			System.out.println("IP_Address Entered.............");
		}catch (Exception e) {
			System.out.println("IP_Address Not Entered.........");
		}
	}
	
	
	public void authentication_Enter_Label() {
		try {
			Thread.sleep(2000);
			//clickElement(Enter_IP_Lable);
			setElementText(Enter_IP_Lable, "Automation IP");
			System.out.println("IP_Lable Entered.............");
		}catch (Exception e) {
			System.out.println("IP_Lable Not Entered.........");
		}
	}
	
	
	public void authentication_Click_SaveButton() {
		try {
			Thread.sleep(2000);
			clickElement(Save_Button);
			System.out.println("Save_Button Clicked.............");
		}catch (Exception e) {
			System.out.println("Save_Button Not Clicked.........");
		}
	}
	
	
	public void authentication_Close_Success_PopUp() {
		try {
			Thread.sleep(2000);
			clickElement(SuccessPopUp_Close);
			System.out.println("SuccessPopUp_Close...............");
		}catch (Exception e) {
			System.out.println("SuccessPopUp_Close Not Closed.........");
		}
	}
	
	public void authentication_Edit_IP_Address() {
		try {
			Thread.sleep(2000);
			clickElement(Edit_IP);
			System.out.println("IP Successfully Edited...............");
		}catch (Exception e) {
			System.out.println("Unable To Edit IP........");
		}
	}
	
	public void authentication_Update_Label() {
		try {
			Thread.sleep(2000);
			//driver.findElement(Enter_IP_Lable).clear();
			setElementText(Enter_IP_Lable, "Automation");
			System.out.println("Label Column Cleared...............");
			Thread.sleep(2000);
			setElementText(Enter_IP_Lable, "Automation");
			System.out.println("Label Successfully Updated...............");
		}catch (Exception e) {
			System.out.println("Unable To Update Label........");
		}
	}
	
	public void authentication_Delete_IP_Address() {
		try {
			Thread.sleep(2000);
			clickElement(Delete_IP);
			System.out.println("IP Successfully Deleted...............");
		}catch (Exception e) {
			System.out.println("Unable To Delete IP........");
		}
	}
	
	public void authentication_Delete_Confirmation_PopUP() {
		try {
			Thread.sleep(2000);
			clickElement(Delete_Confirmation);
			System.out.println("Delete_Confirmation Accepted...............");
		}catch (Exception e) {
			System.out.println("Delete_Confirmation Not Accepted...........");
		}
	}
	
}
