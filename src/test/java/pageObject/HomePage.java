package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver); 
		
	}
	
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")		//SignUp Login button
	WebElement lnkSignupLogin;
	
	@FindBy(tagName = "b")		// Logged in Username
	WebElement lnkLoggedInUser;

	@FindBy(xpath = "//a[normalize-space()='Delete Account']")		//Account Deleted link
	WebElement lnkDeleteAccount;
	
	@FindBy(xpath = "//b[normalize-space()='Account Deleted!']")		//Account Deleted Message
	WebElement msgDeleteAccount;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")					//Logout link
	WebElement lnkLogout;
	
	@FindBy(xpath = "//a[contains(text(),'Test Cases')]")				//Test Cases Link
	WebElement lnk_TestCases;
	
	
	public void clickSignup_Login() {
		lnkSignupLogin.click();
	}
	
	public String verifyLoggedInUser() {
		
		return(lnkLoggedInUser.getText());
	}
	public void clickDeleteAccount() {
		lnkDeleteAccount.click();
	}
	
	public String verifyDeleteAccountMsg() {
		
		return(msgDeleteAccount.getText());
	}
	public void clickLogout() {
		lnkLogout.click();
	}
	public void clickTestCases() {
		lnk_TestCases.click();
	}
	public boolean checkLogoutbutton() {
		try {
		return(lnkLogout.isDisplayed());
		}catch (Exception e) {
			return false;
		}
	}

}
