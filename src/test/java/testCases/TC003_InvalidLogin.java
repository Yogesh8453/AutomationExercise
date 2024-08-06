package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.SignupLoginPage;
import testBase.BaseClass;

public class TC003_InvalidLogin extends BaseClass{
	
	@Test(groups={"Regression","Master"})
	public void testInvalidLogin() {
		HomePage hp = new HomePage(driver);
		hp.clickSignup_Login();
		
		SignupLoginPage SLP = new SignupLoginPage(driver);
		SLP.enterSignInEmail("invalidemail@gmail.com");
		SLP.enterSignInPassword("InvalidPwd");
		SLP.clickSignIn();
		String ActualErrorMsg=SLP.InvalidLoginErrorMessage();
		Assert.assertEquals(ActualErrorMsg, "Your email or password is incorrect!");
		
	}

}
