package com.SeleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolldown {
	
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Resources//geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://whiteboxqa.com/");
			org.openqa.selenium.JavascriptExecutor jse=(org.openqa.selenium.JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1000)","");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id="sidebar"]/div[2]/p/a"));
		}

	}


