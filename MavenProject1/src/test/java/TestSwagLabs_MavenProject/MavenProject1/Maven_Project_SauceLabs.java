package TestSwagLabs_MavenProject.MavenProject1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Maven_Project_SauceLabs {
	
	WebDriver driver = WebDriverManager.chromedriver().create();
	
  @Test(dataProvider = "credentials")
  public void test1(String username , String password) {
	  
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("user-name")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  
	  driver.findElement(By.id("login-button")).click();
	  String title = driver.getTitle();
	  
	  System.out.println(title);
  }
	

  @DataProvider (name="credentials")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "locked_out_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },
      new Object[] { "performance_glitch_user", "secret_sauce" }
    };
  }
}
