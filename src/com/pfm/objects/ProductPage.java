package com.pfm.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	WebDriver driver;
	@FindBy(xpath="//select[@data-test='product_sort_container']")
	WebElement filter;
@FindBy(id="react-burger-menu-btn")
WebElement menu;
@FindBy(id="logout_sidebar_link")
WebElement logout;

//By logout=By.id("logout_sidebar_link");page object modelcase
 public ProductPage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	 
 }
 public void changefilter() {
	// WebElement filterdropdown=driver.findElement(filter);page object modelcase
	 WebElement Filterdropdown=filter;
	 Select Filterdropdownselect = new Select(Filterdropdown);
	 Filterdropdownselect.selectByIndex(2); 
 }
 public void clickonlogout() {
	 try {
		 menu.click();
		 Thread.sleep(2000);
		 logout.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }

}
