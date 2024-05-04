package com.protratiningtech.org.Trainingsessionsforthestudentsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend9th\\Trainingsessionsforthestudentsselenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	WebElement EmailField=driver.findElement(By.id("email"));
	EmailField.sendKeys("hr@protrainingtech.com");
	WebElement PsswrdField=driver.findElement(By.name("pass"));
	PsswrdField.sendKeys("Shahbaz");
	Thread.sleep(6000);
	WebElement Forgotlk=driver.findElement(By.linkText("Forgot password?"));
	Forgotlk.click();
	
	}

}
