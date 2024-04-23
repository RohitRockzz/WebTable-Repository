package E2E_Admin;

import org.openqa.selenium.By;

public class Salesforce_Login_Credentials {
		
	public static Driver_Setup set;
	
	public void loginToSalesforce() throws InterruptedException {
		Driver_Setup.driver.findElement(By.id("username")).clear();
		Driver_Setup.driver.findElement(By.id("username")).sendKeys("durgasi.jagadish@unity.com.unityqa");
		Driver_Setup.driver.findElement(By.id("password")).clear();
		Driver_Setup.driver.findElement(By.id("password")).sendKeys("MzLaPq%1234!@#$");
		Driver_Setup.driver.findElement(By.cssSelector("#rememberUn")).click();
		Thread.sleep(3000);
		Driver_Setup.driver.findElement(By.id("Login")).click();
		Thread.sleep(10000);
	}
}
