package E2E_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginAsICIS_SalesUser {
	
		public Driver_Setup driver;
		WebDriverWait wait = new WebDriverWait(Driver_Setup.driver, 30);
		
		public void loginAsICISSalesUser() throws InterruptedException {
			Driver_Setup.driver.navigate().to("https://unity--unityqa.sandbox.lightning.force.com/lightning/r/User/0054G00000BBpVMQA1/view");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='User Detail']")));
			Driver_Setup.driver.findElement(By.xpath("//div[@title='User Detail']")).click();
			Thread.sleep(7000);
			Driver_Setup.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(9000);
			Driver_Setup.driver.switchTo().frame(0);
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(Driver_Setup.driver.findElement(By.xpath("//td[@id='topButtonRow']/input[04]"))));
			Driver_Setup.driver.findElement(By.xpath("//td[@id='topButtonRow']/input[04]")).click();
			Thread.sleep(15000);
		}
		
		
		public void createNewLead() throws InterruptedException {
			Driver_Setup.driver.navigate().refresh();
			Thread.sleep(10000);
			Driver_Setup.driver.navigate().to("https://unity--unityqa.sandbox.lightning.force.com/lightning/o/Lead/list");
			Driver_Setup.driver.findElement(By.xpath("//ul[@class='branding-actions slds-button-group slds-m-left--xx-small oneActionsRibbon forceActionsContainer']//li//a[@title='New']")).click();
			Thread.sleep(5000);
			Driver_Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(5000);
		}
		
		
		public void logoutAsICIS_SalesUser() throws InterruptedException {
			Driver_Setup.driver.findElement(By.xpath("//a[contains(text(),'Log out as ICIS Sales User')]")).click();
			Thread.sleep(10000);
		}
}
