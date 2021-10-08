package com.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ml {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\C\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://en-gb.facebook.com/");
		
		WebElement txt = driver.findElement(By.xpath("//input[@name='email']"));
		txt.sendKeys("Thangamurugan");
		
		Actions a = new Actions(driver);
		a.doubleClick(txt).perform();
		a.contextClick(txt).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		Actions b = new Actions(driver);
		b.doubleClick(pwd).perform();
		
		Robot d = new Robot();
		d.keyPress(KeyEvent.VK_CONTROL);
		d.keyPress(KeyEvent.VK_V);
		
	}

}
