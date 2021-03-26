package org.sample;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class SearchHotel extends Base {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement roomType;
	
	@FindBy(id = "room_nos")
	private WebElement numberOfRooms;
	
	@FindBy(id = "datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(id = "child_room")
	private WebElement childrenPerRoom;

	@FindBy(id = "Submit")
	private WebElement submit;
	
	@FindBy(className="login_title")
	private WebElement searchText;
	
	@FindBy(id="checkin_span")
	private WebElement checkInError;
	
	@FindBy(id="checkout_span")
	private WebElement checkOutError;
	
	@FindBy(id="location_span")
	private WebElement locationError;

	public WebElement getLocationError() {
		return locationError;
	}

	public WebElement getCheckInError() {
		return checkInError;
	}

	public WebElement getCheckOutError() {
		return checkOutError;
	}

	public WebElement getSearchText() {
		return searchText;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public void locationError() {
      btnclick(getSubmit());
      String text = getText(getLocationError());
		System.out.println(text);
		
		Assert.assertEquals("Location Error","Please Select a Location",text);

		
	}
	
	public void checkInError() {
		String text = getText(getCheckInError());
		System.out.println(text);
		
		Assert.assertEquals("Check in Error","Check-In Date shall be before than Check-Out Date",text);

	}
	
	public void checkOutError() {
		String text1 = getText(getCheckOutError());
		System.out.println(text1);
		
		Assert.assertEquals("Check Out Error","Check-Out Date shall be after than Check-In Date",text1);
		

	}
	public void searchText() {
     String currenturl = getCurrenturl(driver);
     Assert.assertEquals("Navigated to search hotel page","http://adactinhotelapp.com/SearchHotel.php",currenturl);
	}
	
	public void searchHotel1(String location,String numberOfRooms ,String checkInDate,String checkOutDate,String adultsPerRoom) {
		selectBytext(getLocation(), location);
		selectBytext(getNumberOfRooms(), numberOfRooms);
		clear(getCheckInDate());
		type(getCheckInDate(), checkInDate);
		clear(getCheckOutDate());
		type(getCheckOutDate(), checkOutDate);
		selectBytext(getAdultsPerRoom(), adultsPerRoom);
		btnclick(getSubmit());
		
	}
	
	
		
	
	
	public void searchHotel(String location,String hotel,String roomType,String numberOfRooms ,String checkInDate,String checkOutDate,String adultsPerRoom,String childrenPerRoom ) {

		selectBytext(getLocation(), location);
		selectBytext(getHotel(), hotel);
		selectBytext(getRoomType(), roomType);
		selectBytext(getNumberOfRooms(), numberOfRooms);
		clear(getCheckInDate());
		type(getCheckInDate(), checkInDate);
		clear(getCheckOutDate());
		type(getCheckOutDate(), checkOutDate);
		selectBytext(getAdultsPerRoom(), adultsPerRoom);
		selectBytext(getChildrenPerRoom(), childrenPerRoom);
		btnclick(getSubmit());

	}

}








