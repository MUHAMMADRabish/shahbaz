package com.protratiningtech.org.Trainingsessionsforthestudentsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOfAmazon {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend9th\\Trainingsessionsforthestudentsselenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.lexus.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement Shoplinks=driver.findElement(By.xpath("//*[text()='SHOP' and @aria-expanded='false' ]"));
		Actions ob=new Actions(driver);
		ob.moveToElement(Shoplinks).build().perform();
		Thread.sleep(6000);
		WebElement search=driver.findElement(By.xpath("//a[@aria-label=\"SEARCH L/CERTIFIED\"]"));
		ob.moveToElement(search).click().build().perform(); 
	}

}
