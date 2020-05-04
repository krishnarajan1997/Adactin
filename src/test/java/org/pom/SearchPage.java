package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityclass.BaseClass;

public class SearchPage extends BaseClass{
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(id="location")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotel;
@FindBy(id="room_type")
private WebElement roomtype;
@FindBy(id="room_nos")
private WebElement roomcount;
@FindBy(id="datepick_in")
private WebElement checkind;
@FindBy(id="datepick_out")
private WebElement checkoutd;
@FindBy(id="adult_room")
private WebElement adultsno;
@FindBy(id="child_room")
private WebElement childno;
@FindBy(id="Submit")
private WebElement search;
public WebElement getLocation() {
	return location;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getRoomcount() {
	return roomcount;
}
public WebElement getCheckind() {
	return checkind;
}
public WebElement getCheckoutd() {
	return checkoutd;
}
public WebElement getAdultsno() {
	return adultsno;
}
public WebElement getChildno() {
	return childno;
}
public WebElement getSearch() {
	return search;
}
}
