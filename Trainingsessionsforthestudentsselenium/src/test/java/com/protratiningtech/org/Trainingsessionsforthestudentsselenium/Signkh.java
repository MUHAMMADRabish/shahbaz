package com.protratiningtech.org.Trainingsessionsforthestudentsselenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Utility;
import Pages.Forgot;
import Pages.Home;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Signkh extends Utility {
	
	
	//WebDriver driver;
  @Test (priority = 1)
  public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  ob.emailfieldsfill();
	  ob.psswrdfieldfill();
	  shots();
	  ob.ForgotPsswordClick();
	  shots();
	 Forgot fb=new Forgot(driver);
	 fb.ForgotPsswordFields();
	 fb.SearchButtonClicks();
	 Thread.sleep(6000);
	  String forgotlktexts= fb.Google();
	  System.out.println(forgotlktexts);
	  SoftAssert assertion=new SoftAssert();
	//  Assert.assertEquals(forgotlktexts, "Use your Google accountsk");
	  assertion.assertEquals(forgotlktexts, "Use your Google accountsk");
	  System.out.println("This is after the assertion");
	  assertion.assertAll();
  }
 /* @BeforeMethod
  public void beforeMethod() {
	  Ibrowsers("Edge");
	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
  }
 public void Ibrowsers(String browser) {
	  if(browser.equalsIgnoreCase("Chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend9th\\Trainingsessionsforthestudentsselenium\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
		  
	  }else if(browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend9th\\Trainingsessionsforthestudentsselenium\\Drivers\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  
	  }else {
		  System.out.println("Name of browser didn't exist");
	  }
	  
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(6000);

	  
	  
	  
	  driver.quit();
  }*/
  @Test(priority = 2,dependsOnMethods = "f")
  public void CreateAnAccount() {
	  Home ob=new Home(driver);
	  ob.CreateAnAccount();
  }
 /* public void shots() throws IOException {
	  Date sessio=new Date();
	  System.out.println(sessio);
	 String kj= sessio.toString().replace(" ", "_").replace(":", "_");
	 System.out.println(kj);
	File output=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(output, new File("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend9th\\Trainingsessionsforthestudentsselenium\\Pictures\\"+kj+"pictures.png"));
	
  }*/

}
