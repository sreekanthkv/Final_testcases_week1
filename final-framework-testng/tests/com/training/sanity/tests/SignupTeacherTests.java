package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.SignUpPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SignupTeacherTests {
	
	private static Properties properties;
	private WebDriver driver;
	private String baseUrl;
	private SignUpPOM signPOM;
	private ScreenShot screenShot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@BeforeMethod
	public void setUp() {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		signPOM = new SignUpPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@Test
	public void signUpTeacher() {
		signPOM.clickSignUpBtn();
		signPOM.sendfirstName("Bharat30");
		signPOM.sendlastName("waja123");
		signPOM.sendemail("bharat12345@gmail.com");
		signPOM.senduserName("bharatwaja12345");
		signPOM.pass1("Test@1234");
		signPOM.pass2("Test@1234");
		signPOM.phone("9874563210");
		signPOM.registrationLanguage("English");
		signPOM.teacher();
		signPOM.register();
		screenShot.captureScreenShot("Third");
		
	}
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
		
	}
}
