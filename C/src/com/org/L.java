package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\C\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		WebElement s = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		s.click();
		
		WebElement k = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		k.click();
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("Thangamurugan");
		a.accept();
	}

}
