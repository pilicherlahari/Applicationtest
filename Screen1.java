package Screenshot1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screen1 {
	
	@Test
	void m1() throws IOException
	{
	System.getProperty("webdriver.chrome.driver", "C:\\Users\\phari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com//");
	  
	   File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
		File s1 = new File("D:\\Excel ssheet Data\\google1.jpg");
	
		FileHandler.copy(s, s1);
	  
	}

}
