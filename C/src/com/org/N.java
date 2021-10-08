package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class N {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\C\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		WebElement clse = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clse.click();
		
		Thread.sleep(4000);
		WebElement applia = driver.findElement(By.xpath("//img[@alt='Appliances']"));
		applia.click();
		
		Thread.sleep(4000);
		WebElement ac = driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/100/41/image/72d9983c5919f181.png?q=50']"));
		ac.click();
		
		
	}

}
