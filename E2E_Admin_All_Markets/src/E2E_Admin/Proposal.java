package E2E_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Proposal {
	
	public Create_Lead lead;
	public Driver_Setup set;
	public WebDriverWait wait = new WebDriverWait(Driver_Setup.driver, 20);
	
	public void editProposal() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Edit Do Not Send To vIPER']")));
		Driver_Setup.driver.findElement(By.xpath("//button[@title='Edit Do Not Send To vIPER']")).click();
		Thread.sleep(5000);
	}
	
	public void clearsoldToLocation() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Sold To Location')]//parent::lightning-grouped-combobox//button")));
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Sold To Location')]//parent::lightning-grouped-combobox//button")).click();
		Thread.sleep(5000);
	}
	
	public void enterSoldToLocation() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		Driver_Setup.driver.findElement(By.xpath("")).click();
		Thread.sleep(5000);
	}
	
	public void soldToContactAndExpectedStartDate() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Sold To Contact')]//parent::lightning-grouped-combobox//input")));
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Sold To Contact')]//parent::lightning-grouped-combobox//input")).sendKeys(lead.firstName);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//lightning-base-combobox-formatted-text[@title='\"+lead.fullName+\"']//ancestor::lightning-base-combobox-item")));
		Driver_Setup.driver.findElement(By.xpath("//lightning-base-combobox-formatted-text[@title='"+lead.fullName+"']//ancestor::lightning-base-combobox-item")).click();
		Thread.sleep(5000);
		
	}
	
	public void generateOrderForm() throws InterruptedException {
		Driver_Setup.driver.navigate().refresh();
		Thread.sleep(10000);
		
	}
}
