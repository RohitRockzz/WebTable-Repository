package TestNG_Practice;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "dp")
  public void test(String username, String password) {
	  
	  WebDriver driver;
	  driver = new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\durgasi.jagadish\\Desktop\\Selenium Data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.id("user-name")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.id("login-button")).click();
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.getMessage();
	}
	  
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  try {
		FileUtils.copyFile(src, new File (""));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.getMessage();
	}
	  driver.close();
	  driver.quit();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      { "standard_user", "secret_sauce" },
      { "locked_out_user", "secret_sauce" },
      { "problem_user", "secret_sauce" },
      { "performance_glitch_user", "secret_sauce" },
      { "error_user", "secret_sauce"}
    };
  }
  
  }
  
  
