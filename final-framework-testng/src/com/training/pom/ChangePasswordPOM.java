package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPOM {
	private WebDriver driver; 
	
	public ChangePasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Edit profile')]")
	private WebElement editProfile; 
	
	@FindBy(id="profile_password0")
	private WebElement password;
	
	@FindBy(id="password1")
	private WebElement newPassword; 
	
	@FindBy(id="profile_password2")
	private WebElement confirmPassword; 
	
	@FindBy(id="profile_apply_change")
	private WebElement saveSettings; 
	
	public void editProfile() {
		this.editProfile.click(); 
	}
	
	public void password(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	public void newPassword(String password) {
		this.newPassword.clear(); 
		this.newPassword.sendKeys(password); 
	}
	
	public void confirmPassword(String password) {
		this.confirmPassword.clear(); 
		this.confirmPassword.sendKeys(password); 
	}
	
	public void saveSettings() {
		this.saveSettings.click(); 
	}
}
