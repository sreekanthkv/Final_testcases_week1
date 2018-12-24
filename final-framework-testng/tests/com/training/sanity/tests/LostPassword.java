package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ChangePasswordPOM;
import com.training.pom.LoginPOM;
import com.training.pom.LostpasswordPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LostPassword {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ChangePasswordPOM changePasswordPOM;
	private LostpasswordPOM Lostpasswordpom;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
	properties = new Properties();
	FileInputStream inStream = new FileInputStream("./resources/others.properties");
	properties.load(inStream);
	driver = DriverFactory.getDriver(DriverNames.CHROME);
	Lostpasswordpom = new LostpasswordPOM(driver); 


	baseUrl = properties.getProperty("baseURL");
	screenShot = new ScreenShot(driver); 
	// open the browser 
	driver.get(baseUrl);
	
	// new
	}



	@AfterTest
	public void manTest() throws Exception {
	Thread.sleep(1000);
	driver.quit();
	}

	@Test
	public void lostpasswordTest() {

	Lostpasswordpom.clickIlostpasswordlink();
	Lostpasswordpom.enterValidemailid("manzoor@gmail.com");
	Lostpasswordpom.clickSendmessagebtn();
	screenShot.captureScreenShot("Third");
	}
}