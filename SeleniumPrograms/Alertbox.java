package com.SeleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/lucky_emily/Downloads/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("500");
		driver.findElement(By.name("submit")).click();
		
		Alert alert=driver.switchTo().alert();
		String alertmessage=driver.switchTo().alert().getText();
		
		System.out.println(alertmessage);
		alert.accept();
		
		Thread.sleep(4000);
		
		try{
			Alert alert1=driver.switchTo().alert();
			String alertmessage1=driver.switchTo().alert().getText();
			
			System.out.println(alertmessage1);
			alert1.accept();
			
		}
		catch(Exception e)
		{
			driver.close();
		}
		driver.close();
		
	}

}
