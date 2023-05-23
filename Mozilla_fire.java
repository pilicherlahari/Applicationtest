package Screenshot1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Mozilla_fire {
  private static final String Hari = null;

@Test
  public void HariScreen() throws IOException {
System.getProperty("webdriver.gecko.driver", "C:\\Users\\phari\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com//");
	  
	   File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
		File s1 = new File("C:\\Users\\phari\\OneDrive\\Pictures\\Saved Pictures\\fb.jpg");
	
		FileHandler.copy(s, s1);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("User Name");
		driver.findElement(By.name("pass")).sendKeys("password");
				
        File s3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
		File s2 = new File("C:\\Users\\phari\\OneDrive\\Pictures\\Saved Pictures\\loging .jpg");
	
		FileHandler.copy(s3, s2);
		
		
		driver.findElement(By.name("login")).click();
		File s4 =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File s5 =new File("C:\\Users\\phari\\OneDrive\\Pictures\\Saved Pictures\\fb\\openfb.jpg");
		FileHandler.copy(s4, s5);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/ul/li/div/a/div[1]/div[2]/div/div/div/div/span/span")).click();
		driver.navigate().forward();
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div[3]/div/div/div/a/div/div/div[1]/div")).click();
		File s7 =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File s6 =new File("C:\\Users\\phari\\OneDrive\\Pictures\\Saved Pictures\\fb\\openfb.jpg");
		FileHandler.copy(s7, s6);

		
		System.out.println("screen Shot successfully in driver");
		System.out.println("screen Shot successfully in driver");
		  
  }
}
