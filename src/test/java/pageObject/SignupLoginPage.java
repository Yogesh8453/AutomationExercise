package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupLoginPage extends BasePage {

	public SignupLoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Name']")		//Sign up Username text field
	WebElement txt_Signup_UserName;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")		//Sign up Email text field
	WebElement txt_Signup_Email;
	
	@FindBy(xpath="//button[normalize-space()='Signup']")		//Sign up Button
	WebElement btn_Signup;
	
	@FindBy(xpath="//input[@data-qa='login-email']")		//Login Email
	WebElement txt_LoginEmail;
	
	@FindBy(xpath="//input[@placeholder='Password']")		//Login Password
	WebElement txt_LoginPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")		//Login Button
	WebElement btn_Login;
	
	@FindBy(xpath="//p[normalize-space()='Your email or password is incorrect!']") 	//Invalid Login Error message
	WebElement txt_InvalidLoginMsg;
	
	@FindBy(xpath="//h2[normalize-space()='Login to your account']")						//Login Page header
	WebElement txt_LoginPageHeader;
	
	@FindBy(xpath="//p[normalize-space()='Email Address already exist!']")				//User Already Exists text
	WebElement txt_UserAlreadyExists;
	
	public void enterUserName(String UserName)
	{
		txt_Signup_UserName.sendKeys(UserName);
	}
	public void enterSignupEmail(String Email)
	{
		txt_Signup_Email.sendKeys(Email);
	}
	public void enterSignInEmail(String Email)
	{
		txt_LoginEmail.sendKeys(Email);
	}
	public void enterSignInPassword(String Pwd)
	{
		txt_LoginPassword.sendKeys(Pwd);
	}
	public void clickSignIn()
	{
		btn_Login.click();
	}
	public void clickSignUp()
	{
		btn_Signup.click();
	}
	public String InvalidLoginErrorMessage() {
		String ErrorMsg=txt_InvalidLoginMsg.getText();
		return ErrorMsg;
	}
	public String verifyLoginPageHeader() {
		String Header=txt_LoginPageHeader.getText();
		return Header;
	}
	public String verifyExistingUser() {
		String UserExists=txt_UserAlreadyExists.getText();
		return UserExists;
	}

}
