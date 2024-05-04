package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Utility {
	public WebDriver driver;

  
  @BeforeMethod
  @Parameters({"browser","uri"})
  public void Ibrowsers(String browser,String website) {
	  if(browser.equalsIgnoreCase("Chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend9th\\Trainingsessionsforthestudentsselenium\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
		  
	  }else if(browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend9th\\Trainingsessionsforthestudentsselenium\\Drivers\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  
	  }else {
		  System.out.println("Name of browser didn't exist");
	  }
	  driver.get(website);
		driver.manage().window().maximize();
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
  
  
	  public void shots() throws IOException {
		  Date sessio=new Date();
		  System.out.println(sessio);
		 String kj= sessio.toString().replace(" ", "_").replace(":", "_");
		
		 System.out.println(kj);
		File output=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(output, new File("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend9th\\Trainingsessionsforthestudentsselenium\\Pictures\\"+kj+"pictures.png"));
		
	  }

}
