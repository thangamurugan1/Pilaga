package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\C\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
	
	WebElement sourc = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement dest = driver.findElement(By.xpath("//ol[@id='bank']"));
	Thread.sleep(3000);
	Actions a = new Actions(driver);
	a.dragAndDrop(sourc,dest).perform();;
}
}
