package E2E_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Account {
	public Create_Lead lead;
	public Driver_Setup set;
	public WebDriverWait wait = new WebDriverWait(Driver_Setup.driver, 30);
	public JavascriptExecutor js = (JavascriptExecutor)Driver_Setup.driver;
	
	public void editAndVerifyAccount() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Edit')]")));
		Driver_Setup.driver.findElement(By.xpath("//button[contains(text(),'Edit')]")).click();
		Thread.sleep(10000);
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Type of Business Other')]//parent::lightning-textarea//textarea")).sendKeys("Test");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Sales Team')]//ancestor::lightning-combobox//button")));
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Sales Team')]//ancestor::lightning-combobox//button")).click();
		Thread.sleep(5000);
		Driver_Setup.driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Global']")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Tier')]//ancestor::lightning-combobox//button")));
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Tier')]//ancestor::lightning-combobox//button")).click();
		Thread.sleep(5000);
		Driver_Setup.driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Tier 3']")).click();
		Thread.sleep(5000);
		
		//Verify Account
		
		Driver_Setup.driver.findElement(By.xpath("//input[@name='Account_Synonym__c']")).sendKeys("Test");
		Driver_Setup.driver.findElement(By.xpath("//input[@name='Account_Synonym__c']")).clear();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Account Status')]//ancestor::lightning-combobox//button")));
		WebElement accountStatus = Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Account Status')]//ancestor::lightning-combobox//button"));
		accountStatus.click();
		Thread.sleep(5000);
		Driver_Setup.driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Verified']")).click();
		Thread.sleep(3000);
		Driver_Setup.driver.findElement(By.xpath("//button[contains(text(),'Save') and @name='SaveEdit']")).click();
		Thread.sleep(10000);
		
	}
	
	public void addPaymentMethod() {
		Driver_Setup.driver.findElement(By.xpath("")).click();
	}
	
	public void opportunityList() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Related')]")));
		Driver_Setup.driver.findElement(By.xpath("//a[contains(text(),'Related')]")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,3000)", "");
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Opportunities') and @title='Opportunities']")));
		Driver_Setup.driver.findElement(By.xpath("//span[contains(text(),'Opportunities') and @title='Opportunities']")).click();
		Thread.sleep(5000);
	}
	
	
	public void accountLocationsList() throws InterruptedException {
		Driver_Setup.driver.findElement(By.xpath("//img[@title='Account Locations']//parent::span//parent::force-record-avatar//parent::records-highlights-icon//parent::div")).click();
		Thread.sleep(5000);
	}
	
	
	public void taxExpempt() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Tax Exempt ?')]//parent::div//div[@class='slds-form-element__control']//button")));
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Tax Exempt ?')]//parent::div//div[@class='slds-form-element__control']//button")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Tax Exempt ?']//lightning-base-combobox-item[2]")));
		Driver_Setup.driver.findElement(By.xpath("//div[@aria-label='Tax Exempt ?']//lightning-base-combobox-item[2]")).click();
		Driver_Setup.driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Driver_Setup.driver.navigate().refresh();
		Thread.sleep(10000);
	}

	
	public void setNewAddress() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'New Account Location')]")));
		Driver_Setup.driver.findElement(By.xpath("//button[contains(text(),'New Account Location')]")).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='accessibility title']")));
		Driver_Setup.driver.switchTo().frame(0);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Skip Validation')]")));
		Driver_Setup.driver.findElement(By.xpath("//span[contains(text(),'Skip Validation')]")).click();
		Thread.sleep(10000);
	}
	
	public void UnitedStatesAddress() throws InterruptedException {
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Name']")));
		Driver_Setup.driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("United States");
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Street')]//parent::lightning-textarea//textarea")).sendKeys("701 Waterford Way Ste 490");
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'City')]//parent::div//input")).sendKeys("Miami");
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Postal Code')]//parent::div//input")).sendKeys("33126-4617");
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'State')]//parent::div//input")).sendKeys("FL");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Country')]//parent::div//parent::lightning-combobox//button")));
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Country')]//parent::div//parent::lightning-combobox//button")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Country']//lightning-base-combobox-item[@data-value='United States']")));
		Driver_Setup.driver.findElement(By.xpath("//div[@aria-label='Country']//lightning-base-combobox-item[@data-value='United States']")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='SaveEdit']")));
		Driver_Setup.driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
	}
	
}
