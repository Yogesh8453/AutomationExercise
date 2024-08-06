package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.TestCasesPage;
import testBase.BaseClass;

public class TC007_Verfiy_TC_Page extends BaseClass {
	
	@Test(groups={"Regression","Master","Sanity"}) 
	public void verifyTestCasesPage() {
		HomePage hp = new HomePage(driver);
		hp.clickTestCases();
		TestCasesPage TC = new TestCasesPage(driver);
		Assert.assertEquals(TC.getTCPageHeader(), "TEST CASES");
		System.out.println("Total Number of TCs Present on Page "+TC.verifyTotalTCs());
		Assert.assertEquals(TC.verifyTotalTCs(), 27);
		
	}

}
