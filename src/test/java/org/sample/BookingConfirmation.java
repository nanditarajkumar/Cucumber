package org.sample;

import java.util.List;
import java.util.Map;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class BookingConfirmation extends Base {
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement creditCardNo;

	@FindBy(id = "cc_type")
	private WebElement creditCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;

	@FindBy(id = "cc_cvv")
	private WebElement CVVNumber;

	@FindBy(id = "book_now")
	private WebElement booknow;

	@FindBy(id = "first_name_span")
	private WebElement firstnameError;

	@FindBy(id = "last_name_span")
	private WebElement lastnameError;

	@FindBy(id = "address_span")
	private WebElement addressError;

	@FindBy(id = "cc_num_span")
	private WebElement creditcardError;

	@FindBy(id = "cc_type_span")
	private WebElement creditTypeError;

	@FindBy(id = "cc_expiry_span")
	private WebElement creditExpiryError;

	@FindBy(id = "cc_cvv_span")
	private WebElement creditCVVError;

	@FindBy(linkText = "Booked Itinerary")
	private WebElement cancelLink;

	@FindBy(id = "order_no")
	private WebElement orderid;

	@FindBy(id = "search_result_error")
	private WebElement cancelError;

	@FindBy(id = "order_id_text")
	private WebElement searchid;

	@FindBy(id = "search_hotel_id")
	private WebElement btngo;

	@FindBy(xpath = "(//table//tr[2]//td[3])[3]")
	private WebElement cancelSingleButton;

	@FindBy(xpath = "(//table)[5]//tr[10]//td[3]")
	private WebElement cancelSingleButton1;

	public WebElement getCancelSingleButton1() {
		return cancelSingleButton1;
	}

	public WebElement getCancelSingleButton() {
		return cancelSingleButton;
	}

	public WebElement getBtngo() {
		return btngo;
	}

	public WebElement getSearchid() {
		return searchid;
	}

	public WebElement getCancelError() {
		return cancelError;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getCancelLink() {
		return cancelLink;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getFirstnameError() {
		return firstnameError;
	}

	public WebElement getLastnameError() {
		return lastnameError;
	}

	public WebElement getAddressError() {
		return addressError;
	}

	public WebElement getCreditcardError() {
		return creditcardError;
	}

	public WebElement getCreditTypeError() {
		return creditTypeError;
	}

	public WebElement getCreditExpiryError() {
		return creditExpiryError;
	}

	public WebElement getCreditCVVError() {
		return creditCVVError;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCVVNumber() {
		return CVVNumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public void booking(String firstname, String lastname, String address, io.cucumber.datatable.DataTable dataTable) {

		type(getFirstname(), firstname);
		type(getLastname(), lastname);
		type(getAddress(), address);

		List<Map<String, String>> emp = dataTable.asMaps();
		Map<String, String> m1 = emp.get(0);

		String s1 = m1.get("creditCardNo");
		type(getCreditcardNo(), s1);

		String s2 = m1.get("creditCardType");
		selectBytext(getCreditCardType(), s2);

		String s3 = m1.get("expiryMonth");
		selectBytext(getExpiryMonth(), s3);

		String s4 = m1.get("expiryYear");
		selectBytext(getExpiryYear(), s4);

		String s5 = m1.get("CVVNumber");
		type(getCVVNumber(), s5);

		btnclick(getBooknow());

	}

	public void booking1(String firstname, String lastname, String address) {

		type(getFirstname(), firstname);
		type(getLastname(), lastname);
		type(getAddress(), address);

	}

	public String orderid() {
		String text = getText(getOrderid());
		System.out.println(text);
		return text;
	}

	public void booking2(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> emp = dataTable.asMaps();
		Map<String, String> m1 = emp.get(0);

		String s1 = m1.get("creditCardNo");
		type(getCreditcardNo(), s1);

		String s2 = m1.get("creditCardType");
		selectBytext(getCreditCardType(), s2);

		String s3 = m1.get("expiryMonth");
		selectBytext(getExpiryMonth(), s3);

		String s4 = m1.get("expiryYear");
		selectBytext(getExpiryYear(), s4);

		String s5 = m1.get("CVVNumber");
		type(getCVVNumber(), s5);

		btnclick(getBooknow());
	}

	public void Error() {
		btnclick(getBooknow());
		String text = getText(getFirstnameError());
		Assert.assertEquals("First name Error", "Please Enter your First Name", text);

		String text1 = getText(getLastnameError());
		Assert.assertEquals("Last name Error", "Please Enter you Last Name", text1);

		String text6 = getText(getAddressError());
		Assert.assertEquals("Address Error", "Please Enter your Address", text6);

		String text2 = getText(getCreditcardError());
		Assert.assertEquals("Credit Card Error", "Please Enter your 16 Digit Credit Card Number", text2);

		String text3 = getText(getCreditTypeError());
		Assert.assertEquals("Credit type Error", "Please Select your Credit Card Type", text3);

		String text4 = getText(getCreditExpiryError());
		Assert.assertEquals("Expiry Error", "Please Select your Credit Card Expiry Month", text4);

		String text5 = getText(getCreditCVVError());
		Assert.assertEquals("CVV Error", "Please Enter your Credit Card CVV Number", text5);

	}

	public void cancelLink() {
		btnclick(getCancelLink());
	}

	public void cancelExisting() {
		btnclick(getCancelLink());
		btnclick(getCancelSingleButton1());
		simpleAlert();
		String text = getText(getCancelError());
		Assert.assertEquals("Cancel message", "The booking has been cancelled.", text);

	}

	public void cancelBooking1() {

		WebElement orderid2 = getOrderid();

		String text = orderid2.getAttribute("value");

		btnclick(getCancelLink());
		type(getSearchid(), text);
		btnclick(getBtngo());
		getCancelSingleButton().click();

		simpleAlert();
		String text1 = getText(getCancelError());
		Assert.assertEquals("Cancel message", "The booking has been cancelled.", text1);


	}

}
