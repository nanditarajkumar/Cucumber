package org.sample;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class SelectHotel extends Base {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	@FindBy(id = "continue")
	private WebElement continue1;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinue1() {
		return continue1;
	}

	public void selecthotel() {
		btnclick(getRadiobutton());
		btnclick(getContinue1());

	}

	public void selectText() {
		String currenturl = getCurrenturl(driver);
		Assert.assertEquals("Navigated to select hotel page", "http://adactinhotelapp.com/SelectHotel.php", currenturl);
	}
}
