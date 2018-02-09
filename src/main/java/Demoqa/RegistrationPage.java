package Demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	public static WebDriver driver;
	@FindBy(how = How.LINK_TEXT, using = "Registration")
	static WebElement RegistrationLink;
	@FindBy(how = How.NAME, using = "first_name")
	static WebElement FirstName;
	@FindBy(how = How.NAME, using = "last_name")
	static WebElement LastName;
	@FindBy(how = How.XPATH, using = "//input[@value='single']")
	static WebElement Marital_Status_Single;
	@FindBy(how = How.XPATH, using = "//input[@value='married']")
	static WebElement Marital_Status_Married;
	@FindBy(how = How.XPATH, using = "//input[@value='divorced']")
	static WebElement Marital_Status_Divorced;
	@FindBy(how = How.XPATH, using = "//input[@value='dance']")
	static WebElement Hobby_dance;
	@FindBy(how = How.XPATH, using = "//input[@value='reading']")
	static WebElement Hobby_reading;
	@FindBy(how = How.XPATH, using = "//input[@value='cricket ']")
	static WebElement Hobby_cricket;
	@FindBy(how = How.ID, using = "dropdown_7")
	static WebElement Country;
	@FindBy(how = How.ID, using = "mm_date_8")
	static WebElement DOB_Month;
	@FindBy(how = How.ID, using = "dd_date_8")
	static WebElement DOB_Day;
	@FindBy(how = How.ID, using = "yy_date_8")
	static WebElement DOB_Year;
	@FindBy(how = How.ID, using = "phone_9")
	static WebElement PhoneNumber;
	@FindBy(how = How.ID, using = "username")
	static WebElement UserName;
	@FindBy(how = How.ID, using = "email_1")
	static WebElement Email;
	@FindBy(how = How.ID, using = "description")
	static WebElement About_UrSelf;
	@FindBy(how = How.ID, using = "password_2")
	static WebElement Password;
	@FindBy(how = How.ID, using = "confirm_password_password_2")
	static WebElement ConfirmPassword;
	@FindBy(how = How.ID, using = "piereg_passwordStrength")
	static WebElement Check_Password_Strength;
	@FindBy(how = How.NAME, using = "pie_submit")
	static WebElement Submit_Registration_Form;

	public RegistrationPage(WebDriver driver) {
		RegistrationPage.driver = driver;

	}

	public static void navigateToRegistrationPage() {
		RegistrationLink.click();
	}

	public static void enterFirstName() {
		FirstName.sendKeys("FirstName");
	}

	public static void enterLastName() {
		LastName.sendKeys("LastName");
	}

	public static void enterMaritalStatus() {
		// Need to write to condition here
		Marital_Status_Married.click();
	}

	public static void enterHobby() {
		Hobby_cricket.click();
	}

	public static void selectCountry() {
		Select selectCountry = new Select(Country);
		selectCountry.selectByValue("India");
	}

	public static void selectDOB() {
		Select selectMonth = new Select(DOB_Month);
		selectMonth.selectByValue("10");
		Select selectDay = new Select(DOB_Day);
		selectDay.selectByValue("2");
		Select selectYear = new Select(DOB_Year);
		selectYear.selectByValue("2009");
	}

	public static void enterPhoneNumber() {
		PhoneNumber.sendKeys("1234567890");
	}

	public static void enterUserName() {
		UserName.sendKeys("TestUserName9");
	}

	public static void enterEmail() {
		Email.sendKeys("test.tst@gmail.com");
	}

	public static void enterAboutUrSelf() {
		About_UrSelf.sendKeys("Tester");
	}

	public static void enterPassword() {
		Password.sendKeys("12345");
	}

	public static void enterConfirmPassword() {
		ConfirmPassword.sendKeys("123456789");
	}

	public static String getPasswordStrenghtIndicator() {
		Check_Password_Strength.click();
		String passwordStrength = null;
		if (Check_Password_Strength.getText().equals("Medium")) {
			passwordStrength = Check_Password_Strength.getText();
		}
		return passwordStrength;

	}

	public static void submitRegistrationForm() {
		Submit_Registration_Form.click();
	}
}
