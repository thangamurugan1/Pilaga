package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ko {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\C\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		
		WebElement btnYoutube = driver.findElement(By.xpath("//span[@class='fa fa-youtube-square']"));
		j.executeScript("arguments[0].scrollIntoView(true)",btnYoutube);
		
		Thread.sleep(5000);
		
		WebElement lst = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		j.executeScript("arguments[0].scrollIntoView(true)",lst);
	
	}

}
