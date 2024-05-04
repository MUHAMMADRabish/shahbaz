package com.protratiningtech.org.Trainingsessionsforthestudentsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend9th\\Trainingsessionsforthestudentsselenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement CreatebuttonClick=driver.findElement(By.linkText("Create new account"));
		CreatebuttonClick.click();
		Thread.sleep(6000);
		WebElement Monthofbirth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(Monthofbirth);
		ob.selectByValue("5");
		WebElement FirstNameField=driver.findElement(By.name("firstname"));
		FirstNameField.sendKeys("Saleem");
		WebElement MaleToggle=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
		MaleToggle.click();
		
	}

}
