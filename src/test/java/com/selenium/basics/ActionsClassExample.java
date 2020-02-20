package com.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("header_topcat"))).build().perform();
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.id("big-data-and-analytics"));
		actions.moveToElement(link).build().perform();
		driver.findElement(By.xpath("//*[@id='big-data-and-analytics']")).click();
		Thread.sleep(2000);
		WebElement searchAct = driver.findElement(By.id("search-inp3"));
		actions.moveToElement(searchAct).build().perform();
		Action action;
		action = actions.sendKeys(searchAct, "Selenium").build();
		action.perform();
		Thread.sleep(2000);

	}

}
