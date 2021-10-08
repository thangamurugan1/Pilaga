package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\C\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		
		WebElement txtusr = driver.findElement(By.xpath("https://en-gb.facebook.com/"));
		txtusr.sendKeys("Thangamurugan");
		String d = txtusr.getAttribute("value");
		System.out.println("Username : "+d);
		
		WebElement txtpwd = driver.findElement(By.xpath("//input[@name='pass']"));
		txtpwd.sendKeys("123456yth");
		String p = txtpwd.getAttribute("value");
		System.out.println("Password : "+p);
	}
}
