package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickOnImage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");

		WebElement link = driver.findElement(By.cssSelector(".fb_logo"));
		link.click();
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("We are back at Facebook's homepage");
		} else {
			System.out.println("We are Not in Facebook's homepage");
		}
		driver.close();
	}

}
