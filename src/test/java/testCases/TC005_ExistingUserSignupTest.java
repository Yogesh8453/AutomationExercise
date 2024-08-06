package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.SignupLoginPage;
import testBase.BaseClass;

public class TC005_ExistingUserSignupTest extends BaseClass{
	
	@Test(groups={"Regression","Master"})
	public void verifyUserAlreadyExists() {
	HomePage hp=new HomePage(driver);
	hp.clickSignup_Login();
	
	SignupLoginPage SLP=new SignupLoginPage(driver);
	SLP.enterUserName("Test");
	SLP.enterSignupEmail(p.getProperty("Email"));
	SLP.clickSignUp();
	String ActualErrorMsg=SLP.verifyExistingUser();
	Assert.assertEquals(ActualErrorMsg, "Email Address already exist!");
	
	}
}
