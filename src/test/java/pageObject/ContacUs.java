package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContacUs extends BasePage {

	public ContacUs(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "	//a[normalize-space()='Contact us']") // Contact Us
	WebElement lnk_ContactUs;

	public void clickContactUs() {
		lnk_ContactUs.click();
	}

	@FindBy(xpath = "//input[@placeholder='Name']") // Contact us Name
	WebElement txt_ContactUsName;

	public void setContactUsName() {
		txt_ContactUsName.sendKeys("Test Name");
	}

	@FindBy(xpath = "	// input[@placeholder='Email']") // Contact us Email
	WebElement txt_ContactUsEmail;

	public void setContactUsEmail(String Email) {
		txt_ContactUsEmail.sendKeys(Email);
	}

	@FindBy(xpath = "	// input[@placeholder='Subject']") // Contact us Subject
	WebElement txt_ContactUsSubject;

	public void setContactUsSubject() {
		txt_ContactUsSubject.sendKeys("Test Subject");
	}

	@FindBy(xpath = "// textarea[@id='message']") // Contact us Message
	WebElement txt_ContactUsMessage;

	public void setContactUsMessage() {
		txt_ContactUsMessage.sendKeys("Test Message");
	}

	@FindBy(xpath = "// input[@name='upload_file']") // Contact us Upload File
	WebElement btn_ContactUsUploadFile;

	public void uploadContactUsUploadFile() {
		btn_ContactUsUploadFile.sendKeys(System.getProperty("user.dir")+"\\test.txt");
	}

	@FindBy(xpath = "// input[@name='submit']") // Contact us Submit Button
	WebElement btn_ContactUsSubmit;

	public void clickContactUsSubmit() {
		btn_ContactUsSubmit.click();
	}

	@FindBy(xpath = "// div[@class='status alert alert-success']") // Contact us Success Message
	WebElement txt_ContactUsSubmitSuccess;

	public String verifyContactUsSubmitSuccess() {
		String ActualSuccessMsg = txt_ContactUsSubmitSuccess.getText();
		return ActualSuccessMsg;
	}

	@FindBy(xpath = "// span[normalize-space()='Home']") // Contact us Home Button
	WebElement btn_ContactUsHomeBtn;

	public void clickHomeButton() {
		btn_ContactUsHomeBtn.click();
	}

}
