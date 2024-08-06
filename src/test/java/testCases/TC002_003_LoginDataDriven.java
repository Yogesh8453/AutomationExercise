package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.SignupLoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC002_003_LoginDataDriven extends BaseClass{

	@Test(dataProvider = "LoginData",dataProviderClass=DataProviders.class, groups={"Regression","Master"})
	public void testLoginValidUser(String email, String pwd, String exp) {
	HomePage hp = new HomePage(driver); 
	hp.clickSignup_Login(); 
	
	SignupLoginPage SLP = new SignupLoginPage(driver);
	SLP.enterSignInEmail(email);
	SLP.enterSignInPassword(pwd);
	SLP.clickSignIn();
	boolean targetPage=hp.checkLogoutbutton();
	
try {
	if(exp.equalsIgnoreCase("Valid"))
	{
		if(targetPage==true)
		{			
			hp.clickLogout();
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	if(exp.equalsIgnoreCase("Invalid"))
	{
		if(targetPage==true)
		{
			hp.clickLogout();
			Assert.assertTrue(false);
			
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	
	}catch(Exception e)
	{
		Assert.fail();
	}
	
}
}
