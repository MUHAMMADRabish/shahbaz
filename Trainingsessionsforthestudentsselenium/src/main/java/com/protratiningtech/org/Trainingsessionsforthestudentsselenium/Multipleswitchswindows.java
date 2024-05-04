package com.protratiningtech.org.Trainingsessionsforthestudentsselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Multipleswitchswindows {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend9th\\Trainingsessionsforthestudentsselenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	String ParentWindowHandle=driver.getWindowHandle();
	System.out.println("Window handle parent ="+ParentWindowHandle);
		WebElement Forgotlinks=driver.findElement(By.linkText("Forgot password?"));
		Actions ob=new  Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		Forgotlinks.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		Set<String> windowhandles= driver.getWindowHandles();
		Iterator<String> iterators=windowhandles.iterator();
		String FirstWindowHandle=iterators.next();
		String Secondwindowhandle=iterators.next();
		System.out.println("First window handle ="+FirstWindowHandle);
		System.out.println("Second handle window ="+Secondwindowhandle);
		driver.switchTo().window(Secondwindowhandle);
			
		
		WebElement Namefields=driver.findElement(By.id("identify_email"));
		Namefields.sendKeys("hr@protrainingtech.com");
		
	}

}
