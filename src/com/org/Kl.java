package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\A\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://en-gb.facebook.com/");
		WebElement txtusr = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
		txtusr.sendKeys("Thanga");
		WebElement txtpwd = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));

		txtpwd.sendKeys("Gold");
		
		txt.sendKeys("Thangamurugan");
	    WebElement btn = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		btn.click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		
	}

}
