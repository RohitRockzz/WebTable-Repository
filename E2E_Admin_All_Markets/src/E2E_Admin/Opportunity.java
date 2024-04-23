package E2E_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Opportunity {
	
	public Driver_Setup set;
	public WebDriverWait wait = new WebDriverWait(Driver_Setup.driver, 20);
	public String OpportunityName = "XHRUKCore-E2E_Tax_Soldo_UK";
	
	public void createNewStandardOpportunity() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]//parent::button")));
		Driver_Setup.driver.findElement(By.xpath("//span[contains(text(),'Next')]//parent::button")).click();
		Thread.sleep(5000);
	}
	
	public void enterOpportunityDetails() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Name']")));
		Driver_Setup.driver.findElement(By.xpath("//input[@name='Name']")).click();
		Driver_Setup.driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(OpportunityName);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Stage')]//ancestor::lightning-picklist//button")));
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Stage')]//ancestor::lightning-picklist//button")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left' and @aria-label='Stage']//lightning-base-combobox-item[2]")));
		Driver_Setup.driver.findElement(By.xpath("//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left' and @aria-label='Stage']//lightning-base-combobox-item[2]")).click();
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Amount']")));
		Driver_Setup.driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("11000");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='CloseDate']")));
		Driver_Setup.driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		Driver_Setup.driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("10/10/2027");
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Portfolio Interest')]//parent::div//button")));
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Portfolio Interest')]//parent::div//button")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='Advertising']//parent::span//parent::lightning-base-combobox-item")));
		Driver_Setup.driver.findElement(By.xpath("//span[@title='Advertising']//parent::span//parent::lightning-base-combobox-item")).click();
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='SaveEdit']")));
		Driver_Setup.driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		Thread.sleep(10000);
	}
	
	public void openOpportunity() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='window' and contains(text(),'"+OpportunityName+"')]//ancestor::a")));
		Driver_Setup.driver.findElement(By.xpath("//span[@id='window' and contains(text(),'"+OpportunityName+"')]//ancestor::a")).click();
		Thread.sleep(5000);
	}
	
	public void createProposal() throws InterruptedException {
		Driver_Setup.driver.navigate().refresh();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Create Quote/Proposal')]")));
		Driver_Setup.driver.findElement(By.xpath("//button[contains(text(),'Create Quote/Proposal')]")).click();
		Thread.sleep(10000);
	}
	
}
