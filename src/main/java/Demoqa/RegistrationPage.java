package Demoqa;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import BasePages.GenericActions;

public class RegistrationPage extends GenericActions{
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

	public static void enterFirstName() throws IOException {
		String FirstNameValue=readTestData("Registration", "FirstName", 1);
		FirstName.sendKeys(FirstNameValue);
	}

	public static void enterLastName() throws IOException {
		String LastNameValue=readTestData("Registration", "LastName", 2);
		LastName.sendKeys(LastNameValue);
	}

	public static void enterMaritalStatus() {
		// Need to write to condition here
		Marital_Status_Married.click();
	}

	public static void enterHobby() {
		Hobby_cricket.click();
	}

	public static void selectCountry() throws IOException {
		String CountryValue=readTestData("Registration", "Country", 2);
		Select selectCountry = new Select(Country);
		selectCountry.selectByValue(CountryValue);
	}

	public static void selectDOB() {
	
		try {
			String MonthValue=readTestData("Registration", "Month", 2).substring(0, readTestData("Registration", "Month", 2).indexOf("."));
			String DayValue=readTestData("Registration", "Day", 2).substring(0, readTestData("Registration", "Day", 2).indexOf("."));
			String YearValue=readTestData("Registration", "Year", 2).substring(0, readTestData("Registration", "Year", 2).indexOf("."));
			Select selectMonth = new Select(DOB_Month);
			selectMonth.selectByValue(MonthValue);
			Select selectDay = new Select(DOB_Day);
			selectDay.selectByValue(DayValue);
			Select selectYear = new Select(DOB_Year);
			selectYear.selectByValue(YearValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void enterPhoneNumber() throws IOException {
		String PhNumberValue=readTestData("Registration", "PhoneNumber", 2);
		PhoneNumber.sendKeys(PhNumberValue);
	}

	public static void enterUserName() throws IOException {
		String UserNameValue=readTestData("Registration", "UserNameValue", 2);
		UserName.sendKeys(UserNameValue);
	}

	public static void enterEmail() throws IOException {
		String EmailValue=readTestData("Registration", "Email", 2);
		Email.sendKeys(EmailValue);
	}

	public static void enterAboutUrSelf() throws IOException {
		String AboutUrSelfValue=readTestData("Registration", "AboutUrSelt", 2);
		About_UrSelf.sendKeys(AboutUrSelfValue);
	}

	public static void enterPassword() throws IOException {
		String PasswordValue=readTestData("Registration", "Password", 2);
		Password.sendKeys(PasswordValue);
	}

	public static void enterConfirmPassword() throws IOException {
		String ConfirmPasswordValue=readTestData("Registration", "Password", 2);
		ConfirmPassword.sendKeys(ConfirmPasswordValue);
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
