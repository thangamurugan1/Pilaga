package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thanga\\eclipse-workspace\\C\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://en-gb.facebook.com/");
		WebElement txtusr = driver.findElement(By.xpath("//input[@name='email']"));
		txtusr.sendKeys("9566445069");
		WebElement pswd = driver.findElement(By.xpath("//input[@name='pass']"));
		pswd.sendKeys("appu1014.");
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().dismiss();
		
		WebElement msg = driver.findElement(By.xpath("(//div[@aria-label='Messenger'])[1]"));
		msg.click();
	
		
		WebElement df = driver.findElement(By.xpath("//span[text()='Subhas-Indian Velumani']"));
		df.click();
				
			
	}

}
