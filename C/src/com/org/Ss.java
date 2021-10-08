package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ss {
       //MOUSE OVER ACTION
	    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\C\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		WebElement clk = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clk.click();
		WebElement mse = driver.findElement(By.xpath("(//div[@class=\"_28p97w\"])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(mse).perform();
		
		WebElement w = driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
		w.click();
	}

}
