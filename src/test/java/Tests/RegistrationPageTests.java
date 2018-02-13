package Tests;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Demoqa.RegistrationPage;

public class RegistrationPageTests extends testcases {

	@BeforeClass
	public void createRegObj() {
		PageFactory.initElements(driver, RegistrationPage.class);
	}

	@Test(priority = 1)
	public void fillAndSubmitRegistrationForm() throws IOException {
		Demoqa.RegistrationPage.navigateToRegistrationPage();
		Demoqa.RegistrationPage.enterFirstName();
		Demoqa.RegistrationPage.enterLastName();
		Demoqa.RegistrationPage.enterMaritalStatus();
		Demoqa.RegistrationPage.enterHobby();
		Demoqa.RegistrationPage.selectCountry();
		Demoqa.RegistrationPage.selectDOB();
		Demoqa.RegistrationPage.enterPhoneNumber();
		Demoqa.RegistrationPage.enterUserName();
		Demoqa.RegistrationPage.enterEmail();
		Demoqa.RegistrationPage.enterAboutUrSelf();
		Demoqa.RegistrationPage.enterPassword();
		Demoqa.RegistrationPage.enterConfirmPassword();
		Demoqa.RegistrationPage.submitRegistrationForm();
	}
	
	@AfterClass
	public void closedown(){
		driver.close();
		driver.quit();
	}
	

}

