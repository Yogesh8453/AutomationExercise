package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.SignupLoginPage;
import testBase.BaseClass;

public class TC002_LoginUserValidData extends BaseClass {

	@Test(groups = { "Regression", "Master", "Sanity" })
	public void testLoginValidUser() {

		try {
			HomePage hp = new HomePage(driver);
			logger.info("****Clicking on Signup/Login Link****");
			hp.clickSignup_Login();

			SignupLoginPage SLP = new SignupLoginPage(driver);
			logger.info("****Entering Email Id & Password****");
			SLP.enterSignInEmail(p.getProperty("Email"));
			SLP.enterSignInPassword(p.getProperty("Password"));
			logger.info("****Clicking on Sign In button****");
			SLP.clickSignIn();
			logger.info("****Verifying Expected Result****");

			String expectedLoggedInUserName = hp.verifyLoggedInUser();
			if (expectedLoggedInUserName.equals("Yogesh")) 
			{
				// Assert.assertEquals(expectedLoggedInUserName, "Yogeshh");
				Assert.assertTrue(true);
				logger.info("****Test Passed****");
			}
			else 
			{
				logger.error("****Test Failed****");
				logger.debug("****Debug Logs****");
				Assert.assertTrue(false);
				
			}
		} catch (Exception e) {
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		} finally {
			logger.info("***** Finished TC002_LoginUserValidData*****");
		}

	}
}
