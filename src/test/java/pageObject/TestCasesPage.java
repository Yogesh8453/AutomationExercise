package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends BasePage {

	public TestCasesPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//b[normalize-space()='Test Cases']") // Test Case Page Header
	WebElement txt_TCHeader;

	public String getTCPageHeader() {
		return (txt_TCHeader.getText());
	}
	
	@FindBy(tagName = "u")
	List<WebElement> TCCount;
	
	public int verifyTotalTCs() {
		return(TCCount.size());
	}
}