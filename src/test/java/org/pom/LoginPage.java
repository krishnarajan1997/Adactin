package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityclass.BaseClass;

public class LoginPage extends BaseClass {
public LoginPage() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement Username;
@FindBy(id="password")
private WebElement password;
@FindBy(id="login")
private WebElement log;
public WebElement getUsername() {
	return Username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLog() {
	return log;
}
}
