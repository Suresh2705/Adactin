package com.NovemberProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver dr;

	@FindBy(name="username")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}

	@FindBy(id="password")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}

	@FindBy(name="login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	public LoginPage(WebDriver dr1) {
		this.dr = dr1;
		PageFactory.initElements(dr, this);
	}

}
