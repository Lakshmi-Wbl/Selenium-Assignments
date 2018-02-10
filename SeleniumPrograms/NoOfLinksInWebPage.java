package com.SeleniumPrograms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Iterator;

public class NoOfLinksInWebPage {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Resources//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
		
		  
		List<WebElement> links=driver.findElements(By.tagName("a"));
        
		Iterator<WebElement> it = links.iterator();
		String url = "";
		int count=0;
		System.out.println(links.size());
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            if(url!=null)
            {
            	count++;
            	System.out.println(url);
            }
            
        }
        System.out.println("No of links:"+ count);
		
	}	
}
		