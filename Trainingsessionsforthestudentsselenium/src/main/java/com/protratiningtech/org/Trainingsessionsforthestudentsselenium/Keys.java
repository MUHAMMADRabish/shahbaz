package com.protratiningtech.org.Trainingsessionsforthestudentsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend9th\\Trainingsessionsforthestudentsselenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement Names=driver.findElement(By.name("email"));
		Names.sendKeys("saleem@gmail.com");
		Actions ob=new Actions(driver);
		ob.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("a").build().perform();
		ob.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("c").build().perform();
		ob.keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
		Thread.sleep(6000);
		Names.clear();
		Thread.sleep(6000);
		Names.click();
		//Thread.sleep(6000);
		ob.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("v").build().perform();
		ob.keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
	}

}
