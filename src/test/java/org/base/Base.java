package org.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import gherkin.ast.DataTable;

public class Base {
	public static WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajkumar\\eclipse-workspace\\CucumberDay4\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void enterUrl(String url) {
		driver.get(url);
	}
	
	public String getCurrenturl(WebDriver driver) {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
    public void simpleAlert() {
     Alert al= driver.switchTo().alert();
     al.accept();
     
    	
	}
	public void maximize() {
		driver.manage().window().maximize();
	}

	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	public void type(WebElement element, String data) {
		if (isDisplayed(element) && isEnabled(element)) {
			element.sendKeys(data);
		} else
			System.err.println("Webelement is hidden or textbox is disbaled");
	}

	public void btnclick(WebElement element) {
		if (isDisplayed(element) && isEnabled(element)) {
			element.click();
		} else
			System.err.println("Webelement is hidden or button is disbaled");
	}

	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();

	}

	public boolean isEnabled(WebElement element) {
		return element.isEnabled();

	}

	public boolean isSelected(WebElement element) {
		return element.isSelected();

	}

	public void selectBytext(WebElement element, String text) {
		new Select(element).selectByVisibleText(text);

	}

	public void selectByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);

	}

	public void selectByValue(WebElement element, String text) {
		new Select(element).selectByValue(text);

	}

	public List<WebElement> getoptions(WebElement element) {
		List<String> datas = new ArrayList<String>();
		List<WebElement> options = new Select(element).getOptions();
		for (WebElement w : options) {
			datas.add(w.getText());
		}
		return options;
	}

	public void jstype(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value'),'" + data + "')", element);

	}

	public void jsclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public void quit() {
		driver.quit();

	}

	public void close() {
		driver.close();

	}

	public void clear(WebElement element) {
		element.clear();

	}
	
	public String getText(WebElement element) {
		return element.getText();
		

	}

}
