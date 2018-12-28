package com.tns.prueba.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(DriverUtil.getDriver(), this);
	}

	@FindBy(how = How.NAME, using = "user")
	private WebElement userText;
	
	@FindBy(how = How.NAME, using = "password") 
	private WebElement passwordText;
	
	@FindBy(how = How.CLASS_NAME, using = "button")
	private WebElement buttonLogin;
	
	public void navigateTo(String url) {
		DriverUtil.getDriver().navigate().to(url);
	}
	
	public void setUser(String user) {
		userText.sendKeys(user); 
	}
	
	public void setPassword(String password) {
		passwordText.sendKeys(password);
	}
	
	public void clickButton() {
		buttonLogin.click();
	}
	
	public String getResultPage() {
		return DriverUtil.getDriver().getTitle();
	} 
	
	public void close() {
		DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DriverUtil.getDriver().close();
	}
	
}
