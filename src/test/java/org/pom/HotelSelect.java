package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityclass.BaseClass;

public class HotelSelect extends BaseClass {
	public HotelSelect() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="radiobutton_0")
private WebElement radiobutton;
@FindBy(id="continue")
private WebElement cont;
public WebElement getRadiobutton() {
	return radiobutton;
}
public WebElement getCont() {
	return cont;
}
}
