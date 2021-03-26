package org.sample;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	 @FindBy(id="username")
	 private WebElement username;
	 @FindBy(id="password")
	 private WebElement password;
	 @FindBy(id="login")
	 private WebElement btnlogin;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public void login(String username,String password) {
		type(getUsername(), username);
		type(getPassword(), password);
		btnclick(getBtnlogin());

	}

}
