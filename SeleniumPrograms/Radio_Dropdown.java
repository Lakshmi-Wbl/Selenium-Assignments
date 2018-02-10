package com.SeleniumPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/lucky_emily/Downloads/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("devv");
		driver.findElement(By.name("reg_email__")).sendKeys("7770007777");
		driver.findElement(By.name("reg_passwd__")).sendKeys("john");
		
		// handling drop down
		
		//first approach
		Select sel1=new Select(driver.findElement(By.id("month")));
		sel1.selectByVisibleText("Feb");
		Thread.sleep(2000);
		
		//second approach
		Select sel2=new Select(driver.findElement(By.id("day")));
		sel2.selectByValue("20");
		Thread.sleep(2000);
		
		//third approach
		Select sel3=new Select(driver.findElement(By.id("year")));
		sel3.selectByIndex(19);
		Thread.sleep(2000);
		
		//handle radio button
		driver.findElement(By.id("u_0_8")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("u_0_9")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		}

}
