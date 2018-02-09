package Tests;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

public class testcases {
	public WebDriver driver ;
	@BeforeTest
	public  void startup(){
		String DriverPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",DriverPath+File.separator + "Drivers"+File.separator+"chromedriver.exe");
		System.out.println(DriverPath+File.separator + "Drivers"+File.separator+"chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");
		
	}

}
