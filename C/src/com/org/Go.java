package com.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Go {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\C\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(6000);
		
		WebElement txt = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txt.sendKeys("Thangamurugan");
		
		Actions a = new Actions(driver);
		a.doubleClick(txt).perform();;
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		
		Actions p = new Actions(driver);
		
		WebElement k = driver.findElement(By.xpath("//input[@type='password']"));
		p.doubleClick(k).perform();
		
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_CONTROL);
		t.keyPress(KeyEvent.VK_V);
	}

}
