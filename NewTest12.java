package Screenshot1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class NewTest12 {
  @Test
  public void Hari() throws IOException {
System.getProperty("webdriver.chrome.driver", "C:\\Users\\phari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com//");
	  
	   File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
		File s1 = new File("D:\\Excel ssheet Data\\google2.jpg");
	
		FileHandler.copy(s, s1);
	  

  }
}
