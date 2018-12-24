package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPOM {
	private WebDriver driver; 
	
	public SignUpPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li/a[contains(text(),'Sign up!')]")
	private WebElement signUp;
	
	@FindBy(id="registration_firstname")
	private WebElement firstName;
	
	@FindBy(id="registration_lastname")
	private WebElement lastName;
	
	@FindBy(id="registration_email")
	private WebElement email;
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="pass1")
	private WebElement pass1; 
	
	@FindBy(id="pass2")
	private WebElement pass2;
	
	@FindBy(id="registration_phone")
	private WebElement phone; 
	
	@FindBy(xpath = "//div/button[@data-id='registration_language']")
	private WebElement registrationLanguage;
	
	@FindBy(xpath ="//div[@class='bs-searchbox']/input")
	private WebElement searchLanguage;
	
	@FindBy(xpath = "//li/a/span[contains(text(),'English')]")
	private WebElement language;
	
	@FindBy(xpath = "//div[@class='radio']/label/input")
	private WebElement student;
	
	@FindBy(xpath = "//div[@class='radio']/label/input[@value='1']")
	private WebElement teacher;
	
	@FindBy(id="registration_submit")
	private WebElement register; 	
	
	
	public void clickSignUpBtn() {
		this.signUp.click(); 
	}
	
	public void sendfirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	
	public void sendlastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}
	
	public void sendemail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public void senduserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void pass1(String pass1) {
		this.pass1.clear();
		this.pass1.sendKeys(pass1);
	}
	
	public void pass2(String pass2) {
		this.pass2.clear();
		this.pass2.sendKeys(pass2);
	}
	
	public void phone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}
	
	public void registrationLanguage(String registrationLanguage) {
		this.registrationLanguage.click(); 
		this.searchLanguage.clear();
		this.searchLanguage.sendKeys(registrationLanguage);
		this.language.click();
	}
	
	public void student() {
		this.student.click(); 
	}
	
	public void teacher() {
		this.student.click(); 
	}
	
	public void register() {
		this.register.click(); 
	}
}
