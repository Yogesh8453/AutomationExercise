package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.SignupLoginPage;
import testBase.BaseClass;

public class TC004_LogoutUserTest extends BaseClass{
	
	@Test(groups={"Regression","Master","Sanity"})
	public void testLogoutUser() {
		HomePage hp=new HomePage(driver);
		hp.clickSignup_Login();
		
		SignupLoginPage SLP=new SignupLoginPage(driver);
		SLP.enterSignInEmail(p.getProperty("Email"));
		SLP.enterSignInPassword(p.getProperty("Password"));
		SLP.clickSignIn();
		String LoggedInUser=hp.verifyLoggedInUser();
		Assert.assertEquals(LoggedInUser, "Yogesh");
		hp.clickLogout();
		String LoginHeader=SLP.verifyLoginPageHeader();
		Assert.assertEquals(LoginHeader, "Login to your account");
		driver.getCurrentUrl().contains("Login");
	}

}
