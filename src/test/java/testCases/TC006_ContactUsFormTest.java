package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.ContacUs;
import pageObject.SignupLoginPage;
import testBase.BaseClass;

public class TC006_ContactUsFormTest extends BaseClass {

	@Test(groups={"Regression","Master","Sanity"}) 
	public void verifyContactUsForm() throws InterruptedException {
		
		ContacUs CU=new ContacUs(driver);
		CU.clickContactUs();
		CU.setContactUsName();
		CU.setContactUsEmail(p.getProperty("Email"));
		CU.setContactUsSubject();
		CU.setContactUsMessage();
		CU.uploadContactUsUploadFile();
		CU.clickContactUsSubmit();
		driver.switchTo().alert().accept();
		String ActualContactUsSubmitMsg=CU.verifyContactUsSubmitSuccess();
		Assert.assertEquals(ActualContactUsSubmitMsg, "Success! Your details have been submitted successfully.");
		CU.clickHomeButton();
		driver.getCurrentUrl().equals(p.getProperty("appurl"));
		
	}
}
