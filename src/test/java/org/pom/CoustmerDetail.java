package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityclass.BaseClass;

public class CoustmerDetail extends BaseClass {
public CoustmerDetail() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="first_name")
private WebElement name;
@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="address")
private WebElement addres;
@FindBy(id="cc_num")
private WebElement creditno;
@FindBy(id="cc_type")
private WebElement cardtype ;
@FindBy(id="cc_exp_month")
private WebElement expmon ;
@FindBy(id="cc_exp_year")
private WebElement expyear;
@FindBy(id="cc_cvv")
private WebElement cvv;
@FindBy(id="book_now")
private WebElement book;
public WebElement getName() {
	return name;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddres() {
	return addres;
}
public WebElement getCreditno() {
	return creditno;
}
public WebElement getCardtype() {
	return cardtype;
}
public WebElement getExpmon() {
	return expmon;
}
public WebElement getExpyear() {
	return expyear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBook() {
	return book;
}
}
