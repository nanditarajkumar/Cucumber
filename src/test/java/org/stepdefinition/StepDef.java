package org.stepdefinition;

import org.base.Base;
import org.sample.BookingConfirmation;
import org.sample.LoginPage;
import org.sample.SearchHotel;
import org.sample.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {
	LoginPage loginpage = new LoginPage();
	SearchHotel search = new SearchHotel();
	SelectHotel select = new SelectHotel();
	BookingConfirmation booking=new BookingConfirmation();

	@Given("user is on adactin page")
	public void user_is_on_adactin_page() {
		maximize();
	}

	@When("user should enter {string} and {string} and click login button")
	public void user_should_enter_and_and_click_login_button(String username, String password) {

		loginpage.login(username, password);

	}

	@When("user should navigate to search hotel page")
	public void user_should_navigate_to_search_hotel_page() {
		implicitwait();
		search.searchText();
	}

	@When("user should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter(String location, String hotel, String roomType, String numberOfRooms,
			String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		search.searchHotel(location, hotel, roomType, numberOfRooms, checkInDate, checkOutDate, adultsPerRoom,
				childrenPerRoom);
	}

	@Then("user should navigate to select hotel page")
	public void user_should_navigate_to_select_hotel_page() {
		implicitwait();
		select.selectText();
	}

	@Given("userOne is on adactin page")
	public void userone_is_on_adactin_page() {
		maximize();
	}

	@When("userOne should enter {string} and {string} and click login button")
	public void userone_should_enter_and_and_click_login_button(String username, String password) {
		loginpage.login(username, password);

	}

	@When("userOne should navigate to select hotel page")
	public void userone_should_navigate_to_select_hotel_page() {
		search.searchText();
	}

	@When("userOne should enter {string},{string},{string},{string},{string}")
	public void userone_should_enter(String location, String numberOfRooms, String checkInDate, String checkOutDate,
			String adultsPerRoom) {
		search.searchHotel1(location, numberOfRooms, checkInDate, checkOutDate, adultsPerRoom);

	}

	@Given("userTwo is on adactin page")
	public void usertwo_is_on_adactin_page() {
		maximize();
	}

	@When("userTwo should enter {string} and {string}and click login button")
	public void usertwo_should_enter_and_and_click_login_button(String username, String password) {
		loginpage.login(username, password);
	}

	@When("userTwo should navigate to select hotel page")
	public void usertwo_should_navigate_to_select_hotel_page() {
		search.searchText();
	}

	@When("userTwo should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void usertwo_should_enter(String location, String hotel, String roomType, String numberOfRooms,
			String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		search.searchHotel(location, hotel, roomType, numberOfRooms, checkInDate, checkOutDate, adultsPerRoom,
				childrenPerRoom);
	}

	@Then("userTwo should verify error message in date")
	public void usertwo_should_verify_error_message_in_date() {
		
		search.checkInError();
		search.checkOutError();
	}

	@Given("userThree is on adactin page")
	public void userthree_is_on_adactin_page() {
		maximize();
	}

	@When("userThree should enter {string} and {string}and click login button")
	public void userthree_should_enter_and_and_click_login_button(String username, String password) {
		loginpage.login(username, password);
	}

	@When("userThree should navigate to select hotel page")
	public void userthree_should_navigate_to_select_hotel_page() {
		search.searchText();
	}

	@Then("userThree should click the search button and verify error message")
	public void userthree_should_click_the_search_button_and_verify_error_message() {
		search.locationError();
	}

	@Given("userFour is on adactin page")
	public void userfour_is_on_adactin_page() {
		maximize();
	}

	@When("userFour should enter {string} and {string}")
	public void userfour_should_enter_and(String username, String password) {
	loginpage.login(username, password);
	}

	@When("userFour should click login button and naviagate to hotel page")
	public void userfour_should_click_login_button_and_naviagate_to_hotel_page() {
		search.searchText();
	}

	@When("userFour should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userfour_should_enter(String location, String hotel, String roomType, String numberOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		search.searchHotel(location, hotel, roomType, numberOfRooms, checkInDate, checkOutDate, adultsPerRoom, childrenPerRoom);
	}

	@When("userFour should click search button and user is on select hotel page , click that radio button and user should click continue button")
	public void userfour_should_click_search_button_and_user_is_on_select_hotel_page_click_that_radio_button_and_user_should_click_continue_button() {
           select.selectText();
           select.selecthotel();
	}

	@When("userFour should enter the {string},{string},{string}")
	public void userfour_should_enter_the(String firstname, String lastname, String address) {
     booking.booking1(firstname, lastname, address);
	}

	@Then("userFour should verify success message")
	public void userfour_should_verify_success_message(io.cucumber.datatable.DataTable dataTable) {
		booking.booking2(dataTable);
		implicitwait();
		booking.orderid();
	}

	@Given("userFive is on adactin page")
	public void userfive_is_on_adactin_page() {
		maximize();
	}

	@When("userFive should enter {string} and {string}")
	public void userfive_should_enter_and(String username, String password) {
		loginpage.login(username, password);
	}

	@When("userFive should click login button and navigate to search hotel page")
	public void userfive_should_click_login_button_and_navigate_to_search_hotel_page() {
		search.searchText();
	}

	@When("userFive should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userfive_should_enter(String location, String hotel, String roomType, String numberOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
	search.searchHotel(location, hotel, roomType, numberOfRooms, checkInDate, checkOutDate, adultsPerRoom, childrenPerRoom);
	}

	@When("userFive should click search button and user is on select hotel page")
	public void userfive_should_click_search_button_and_user_is_on_select_hotel_page() {
		select.selectText();
	}

	@When("userFive should click the radio button and click continue button")
	public void userfive_should_click_the_radio_button_and_click_continue_button() {
		select.selecthotel();
	}

	@When("userFive should not enter any credentials and click book now button")
	public void userfive_should_not_enter_any_credentials_and_click_book_now_button() {
		booking.Error();
	}

	@Then("userFive should verify {int} error message")
	public void userfive_should_verify_error_message(Integer int1) {
		}

	@Given("userSix is on adactin page")
	public void usersix_is_on_adactin_page() {
           maximize();
	}

	@When("userSix should enter {string} and {string}")
	public void usersix_should_enter_and(String username, String password) {
		loginpage.login(username, password);
	}

	@When("userSix should click login button and naviagate to hotel page")
	public void usersix_should_click_login_button_and_naviagate_to_hotel_page() {
      search.searchText();
	}

	@When("userSix should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void usersix_should_enter(String location, String hotel, String roomType, String numberOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		search.searchHotel(location, hotel, roomType, numberOfRooms, checkInDate, checkOutDate, adultsPerRoom, childrenPerRoom);
	}

	@When("userSix should click search button and user is on select hotel page , click that radio button and user should click continue button")
	public void usersix_should_click_search_button_and_user_is_on_select_hotel_page_click_that_radio_button_and_user_should_click_continue_button() {
         select.selectText();
         select.selecthotel();
	}

	@When("userSix should enter the {string},{string},{string}")
	public void usersix_should_enter_the(String firstname, String lastname, String address) {
        booking.booking1(firstname, lastname, address);
	}

	@When("userSix should click the Booked Itinerary")
	public void usersix_should_click_the_Booked_Itinerary() {
		}

	@Then("userSix should click the cancel id button and verify the message")
	public void usersix_should_click_the_cancel_id_button_and_verify_the_message(
			io.cucumber.datatable.DataTable dataTable) {
		booking.booking2(dataTable);
		implicitwait();
		booking.cancelBooking1();
		
	}
    
	@Given("userSeven is on adactin page")
	public void userseven_is_on_adactin_page() {
		maximize();
	}

	@When("userSeven should enter {string} and {string}")
	public void userseven_should_enter_and(String username, String password) {
	loginpage.login(username, password);
	}

	@When("userSeven should click login button and naviagate to hotel page")
	public void userseven_should_click_login_button_and_naviagate_to_hotel_page() {
		search.searchText();
	}

	@When("userSeven should click the Booked Itinerary")
	public void userseven_should_click_the_Booked_Itinerary() {
		implicitwait();
	}

	@Then("userSeven should click the cancel id button and verify the message")
	public void userseven_should_click_the_cancel_id_button_and_verify_the_message() {
		booking.cancelExisting();
	}

}