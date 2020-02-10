package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

		String currentUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		String pageSource = driver.getPageSource();
		Class<? extends WebDriver> class1 = driver.getClass();

		System.out.println("CurrentURL of The Page   :" + currentUrl);
		System.out.println("Title  of The Page       :" + title);
		System.out.println("Class                    :" + class1);

		System.out.println("----------------------------------------------");
		System.out.println("PageSource of The Page   :" + pageSource);
		System.out.println("----------------------------------------------");

		// You can validate it against the 'current url' as

		/*
		 * String URL = driver.getCurrentUrl(); Assert.assertEquals(URL,
		 * "https://www.google.com/" );
		 */

		if (title.equals("Google")) {
			System.out.println("Title Passed");
		} else {
			System.out.println("Title Fail");
		}

		if (currentUrl.equals("https://www.google.com/")) {
			System.out.println("URL is Passed");

		} else {
			System.out.println("URL is Fail");
		}

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// driver.close();

	}

}
