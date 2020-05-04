package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pom.LoginPage;
import org.pom.POMCLASS;
import org.utilityclass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainPage extends BaseClass {
	POMCLASS p = new POMCLASS();

	@Given("user in the login page")
	public void user_in_the_login_page() {
		System.out.println("krishna");
		if (true) {
			
		}
		launchBrowser();
		launchUrl("http://adactin.com/HotelApp/index.php");
		winMaximize();
		System.out.println("hello");
	}

	@When("user enter the username and password")
	public void user_enter_the_username_and_password() throws Exception {
		LoginPage l = new LoginPage();
		sendKey(l.getUsername(), "krishnarajan");
		sendKey(l.getPassword(), "krishnarajan");
		takesScreenshot("1");
	}

	@When("to click the login button")
	public void to_click_the_login_button() throws Exception {

		elementClick(p.getLogin().getLog());
		takesScreenshot("2");
	}

	@Then("verify the page is working")
	public void verify_the_page_is_working() {
		WebElement txt = findXpath("//a[text()='Search Hotel']");
		getTheText(txt);
		Assert.assertTrue(getTheText(txt).contains("Search Hotel"));
	}

	@Given("User in the search page of adactin hotel")
	public void user_in_the_search_page_of_adactin_hotel() {
		System.out.println("User in the hotel search page");
	}

	@When("User enter the location and Hotel and RoomType")
	public void user_enter_the_location_and_Hotel_and_RoomType() {

		sendKey(p.getSearch().getLocation(), "Sydney");
		sendKey(p.getSearch().getHotel(), "Hotel Creek");
		sendKey(p.getSearch().getRoomtype(), "Standard");
	}

	@When("User enter the no of room check in and check out  date")
	public void user_enter_the_no_of_room_check_in_and_check_out_date() {

		sendKey(p.getSearch().getRoomcount(), "1 - One");
		sendKey(p.getSearch().getCheckind(), "28/03/2020");
		sendKey(p.getSearch().getCheckoutd(), "24/04/2020");
	}

	@When("User enter the adults and children per room")
	public void user_enter_the_adults_and_children_per_room() {

		sendKey(p.getSearch().getAdultsno(), "1 - One");
		sendKey(p.getSearch().getChildno(), "1 - One");
	}

	@Then("user Click Search and outcome")
	public void user_Click_Search_and_outcome() throws Exception {
		takesScreenshot("3");

		elementClick(p.getSearch().getSearch());
	}

	@Given("User in the select page of adactin hotel")
	public void user_in_the_select_page_of_adactin_hotel() throws Exception {
		WebElement element = findXpath("//td[text()='Select Hotel ']");
		getTheText(element);

		Assert.assertTrue(getTheText(element).contains("Select Hotel"));
	}

	@When("User click button icon in the page")
	public void user_click_button_icon_in_the_page() {

		elementClick(p.getHotel().getRadiobutton());
	}

	@When("click the continue button")
	public void click_the_continue_button() {

		elementClick(p.getHotel().getCont());
	}

	@Then("User check the outcome")
	public void user_check_the_outcome() {
		WebElement element = findXpath("//td[text()='Book A Hotel ']");
		getTheText(element);

		Assert.assertTrue(getTheText(element).contains("Book A Hotel"));
	}

	@Given("User send the First Last name and address")
	public void user_send_the_First_Last_name_and_address() {

		sendKey(p.getCustomer().getName(), "guru");
		sendKey(p.getCustomer().getLastname(), "raj");
		sendKey(p.getCustomer().getAddres(), "8/1212 new");
	}

	@When("User send the Credit card no and card Type")
	public void user_send_the_Credit_card_no_and_card_Type() {

		sendKey(p.getCustomer().getCreditno(), "5678451235687895");
		sendKey(p.getCustomer().getCardtype(), "VISA");
	}

	@When("user set the Expiry month date and CVV no")
	public void user_set_the_Expiry_month_date_and_CVV_no() {

		sendKey(p.getCustomer().getExpmon(), "March");
		sendKey(p.getCustomer().getExpyear(), "2023");
		sendKey(p.getCustomer().getCvv(), "555");
	}

	@When("click Book now")
	public void click_Book_now() {

		elementClick(p.getCustomer().getBook());
	}

	@Then("user get the invoice no")
	public void user_get_the_invoice_no() throws InterruptedException {
		Thread.sleep(8000);

		WebElement xpath = findId("order_no");
		getTheAttribute(xpath);

	}
 
}
