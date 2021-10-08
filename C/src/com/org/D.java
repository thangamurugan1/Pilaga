package com.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\C\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://en-gb.facebook.com/");
		
		WebElement lp = driver.findElement(By.xpath("//input[@id='email']"));
		lp.sendKeys("9566445069");
		
		Actions a = new Actions(driver);
		a.doubleClick(lp).perform();;
		a.contextClick(lp).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		Actions b = new Actions(driver);
		WebElement h = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
//		b.moveToElement(h).perform();
		b.doubleClick(h).perform();
		
		Robot s = new Robot();
		
		s.keyPress(KeyEvent.VK_CONTROL);
		s.keyPress(KeyEvent.VK_V);
		
	}

}
