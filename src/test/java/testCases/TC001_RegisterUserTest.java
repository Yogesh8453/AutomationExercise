package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.SignUpPage;
import pageObject.SignupLoginPage;
import testBase.BaseClass;

public class TC001_RegisterUserTest extends BaseClass{
	
	@Test(groups={"Regression","Master","Sanity"}) 
	public void testUser_Registration() {
		HomePage hp = new HomePage(driver); 
		logger.info("***Clicking on the Login/SignUp***");
		hp.clickSignup_Login(); 
		
		SignupLoginPage SLP = new SignupLoginPage(driver);
		String ActualUsername =randomeString();
		
		logger.info("****Entering Email and UserName Details****");
		SLP.enterUserName(ActualUsername);
		SLP.enterSignupEmail(randomeEmailString());
		logger.info("****Clicking on Sign Up Button****");
		SLP.clickSignUp();
		
		SignUpPage SUP = new SignUpPage(driver);
		 
		logger.info("****Validating Sign up Header****");
		 String ConfirmHeader=SUP.get_SignUpHeader();
		 Assert.assertEquals(ConfirmHeader,"ENTER ACCOUNT INFORMATION");
		 
		 logger.info("****Entering User Details****");
		SUP.set_gender();
		SUP.set_Password(randomeAlphaNumberic());
		SUP.select_Day();
		SUP.select_Month();
		SUP.select_Year();
		SUP.set_NewLetter();
		SUP.set_Offers();
		SUP.enter_FirstName(randomeString());
		SUP.enter_LastName(randomeString());
		SUP.enter_Company(randomeString());
		SUP.enter_Address1(randomeString());
		SUP.enter_Address2(randomeString());
		SUP.enter_State();
		SUP.enter_City();
		SUP.enter_Zipcode(); 
		SUP.enter_Mobile(randomeNumber());
		logger.info("****Clicking on Create Account button****");
		SUP.click_CreateAccount();
		logger.info("****Validating Account Created Message****");
		String expectedACCreationmsg=SUP.verify_AccountCreation();
		Assert.assertEquals(expectedACCreationmsg,"ACCOUNT CREATED!");
		SUP.click_Continue();
		String expectedLoggedInUserName=hp.verifyLoggedInUser();
		Assert.assertEquals(expectedLoggedInUserName, ActualUsername);
		logger.info("****Clicking on Delete Account button****");
		hp.clickDeleteAccount();
		logger.info("****Validating Account Deleted Message****");
		String expectedDeleteMessage=hp.verifyDeleteAccountMsg();
		Assert.assertEquals(expectedDeleteMessage, "ACCOUNT DELETED!");
	} 

}
