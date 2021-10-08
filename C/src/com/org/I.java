package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\C\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		WebElement txt = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		txt.click();
		
		WebElement clk = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		clk.click();
		
		Thread.sleep(10000);
		
		driver.switchTo().alert().accept();
}
}