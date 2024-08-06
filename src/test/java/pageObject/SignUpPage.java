package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage {

	Select SelectDOB;

	public SignUpPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//b[normalize-space()='Enter Account Information']") // Signup Page Header
	WebElement txt_SignUpHeader;

	@FindBy(xpath = "//input[@id='id_gender1']") // Select Gender
	WebElement Rdbtn_Gender1;

	@FindBy(xpath = "//input[@id='password']") // Enter Password field
	WebElement txt_setPassword;

	@FindBy(xpath = "//select[@id='days']") // Select Day dropdown
	WebElement dd_day;

	@FindBy(xpath = "//select[@id='months']") // Select Month dropdown
	WebElement dd_month;

	@FindBy(xpath = "//select[@id='years']") // Select Year dropdown
	WebElement dd_year;

	@FindBy(xpath = "//input[@id='newsletter']") // Checkbox NewLetter
	WebElement chk_NewsLetter;

	@FindBy(xpath = "//input[@id='optin']") // Checkbox Offers
	WebElement chk_offers;

	@FindBy(xpath = "//input[@id='first_name']") // Enter FirstName field
	WebElement txt_FirstName;

	@FindBy(xpath = "//input[@id='last_name']") // Enter LastName field
	WebElement txt_LastName;

	@FindBy(xpath = "//input[@id='company']") // Enter Company field
	WebElement txt_Company;

	@FindBy(xpath = "//input[@id='address1']") // Enter Address1 field
	WebElement txt_Address1;

	@FindBy(xpath = "//input[@id='address2']") // Enter Address2 field
	WebElement txt_Address2;

	@FindBy(xpath = "//input[@id='state']") // Enter State field
	WebElement txt_State;

	@FindBy(xpath = "//input[@id='city']") // Enter City field
	WebElement txt_City;
	// input[@id='city']

	@FindBy(xpath = "//input[@id='zipcode']") // Enter ZipCode field
	WebElement txt_ZipCode;

	@FindBy(xpath = "//input[@id='mobile_number']") // Enter MobileNumber field
	WebElement txt_MobileNumber;

	@FindBy(xpath = "//button[normalize-space()='Create Account']") // Button Create Account
	WebElement btn_CreatAccount;

	@FindBy(xpath = "//b[normalize-space()='Account Created!']") // Account Create Message
	WebElement hdr_AccountCreated;

	@FindBy(xpath = "	//a[normalize-space()='Continue']") // Account Created Continue button
	WebElement btn_Conitnue;

	public String get_SignUpHeader() {
		try {
			return (txt_SignUpHeader.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}

	}

	public void set_gender() {
		Rdbtn_Gender1.click();
	}

	public void set_Password(String Password) {
		txt_setPassword.sendKeys(Password);
	}

	public void select_Day() {
		SelectDOB = new Select(dd_day);
		SelectDOB.selectByValue("12");

	}

	public void select_Month() {
		SelectDOB = new Select(dd_month);
		SelectDOB.selectByValue("3");

	}

	public void select_Year() {
		SelectDOB = new Select(dd_year);
		SelectDOB.selectByValue("1991");

	}

	public void set_NewLetter() {
		chk_NewsLetter.click();
	}

	public void set_Offers() {
		chk_offers.click();
	}

	public void enter_FirstName(String FirstName) {
		txt_FirstName.sendKeys(FirstName);
	}

	public void enter_LastName(String LastName) {
		txt_LastName.sendKeys(LastName);
	}

	public void enter_Company(String Company) {
		txt_Company.sendKeys(Company);
	}

	public void enter_Address1(String Add1) {
		txt_Address1.sendKeys(Add1);
	}

	public void enter_Address2(String Add2) {
		txt_Address2.sendKeys(Add2);
	}

	public void enter_State() {
		txt_State.sendKeys("Maharashtra");
	}

	public void enter_City() {
		txt_City.sendKeys("Navi Mumbai");
	}

	public void enter_Zipcode() {
		txt_ZipCode.sendKeys("410218");
	}

	public void enter_Mobile(String Mob) {
		txt_MobileNumber.sendKeys(Mob);
	}

	public void click_CreateAccount() {
		btn_CreatAccount.click();
	}

	public String verify_AccountCreation() {
		return (hdr_AccountCreated.getText());

	}

	public void click_Continue() {
		btn_Conitnue.click();
	}

}
