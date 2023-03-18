package com.pfm.main;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.pfm.objects.LoginPage;
import com.pfm.objects.ProductPage;

public class pagefactorymodelmain {

	public static void main(String[] args) {
		try {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");
			LoginPage login = new LoginPage(driver);
			login.enterusername("standard_user");
			login.enterpassword("secret_sauce");
			login.clickonlogin();
			Thread.sleep(2000);
			ProductPage product = new ProductPage(driver);
			product.changefilter();
			Thread.sleep(2000);
			product.clickonlogout();
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}

	}

}
