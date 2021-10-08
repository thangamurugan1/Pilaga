package com.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class F {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\C\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://en-gb.facebook.com/");
		WebElement txtusr = driver.findElement(By.xpath("//input[@name='email']"));
		txtusr.sendKeys("Thanga");
		
		Actions a = new Actions(driver);
		a.doubleClick(txtusr).perform();
		a.contextClick(txtusr).perform();
		
		Robot r = new Robot();
		for(int i=0;i<=3;i++)
		{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
