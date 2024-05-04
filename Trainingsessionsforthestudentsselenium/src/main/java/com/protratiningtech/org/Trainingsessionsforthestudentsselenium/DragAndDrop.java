package com.protratiningtech.org.Trainingsessionsforthestudentsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend9th\\Trainingsessionsforthestudentsselenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement dropable=driver.findElement(By.linkText("Droppable"));
		dropable.click();
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		WebElement dragable=driver.findElement(By.id("draggable"));
		WebElement dropabletoobjects=driver.findElement(By.id("droppable"));
		Actions ob=new Actions(driver);
		ob.dragAndDrop(dragable, dropabletoobjects).build().perform();
		Thread.sleep(6000);
		driver.switchTo().parentFrame();
		WebElement Resizeable=driver.findElement(By.linkText("Resizable"));
		Resizeable.click();
	}

}
