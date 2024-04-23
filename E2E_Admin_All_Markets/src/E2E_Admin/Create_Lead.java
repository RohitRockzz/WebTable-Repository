package E2E_Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Lead {
		
	public  Driver_Setup setup;
	public  WebDriverWait wait = new WebDriverWait(Driver_Setup.driver, 30);
	public String firstName = "E2E_Marry_Contact";
	public String lastName = "Fake_05";
	public String fullName = firstName+" "+lastName;
	public String businessName = "TAX_Account";
	public String email = "jamesfakecontact11.demo12@dummymail.com";
	public String phoneNumber = "8878123183";
	public String account_link;
	
	
	public void navigateToLeadPage() {
		Driver_Setup.driver.navigate().to("https://unity--unityqa.sandbox.lightning.force.com/lightning/o/Lead/list");
	}
	
	public  void newICISLeadAsAdmin() throws InterruptedException {
		
		Driver_Setup.driver.findElement(By.xpath("//ul[@class='branding-actions slds-button-group slds-m-left--xx-small oneActionsRibbon forceActionsContainer']//li//a[@title='New']")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='slds-form-element__label' and contains(text(),'ICIS Leads')]//parent::div//parent::label//div[@class='changeRecordTypeOptionLeftColumn']/span")));
		Driver_Setup.driver.findElement(By.xpath("//span[@class='slds-form-element__label' and contains(text(),'ICIS Leads')]//parent::div//parent::label//div[@class='changeRecordTypeOptionLeftColumn']/span")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]//parent::button")));
		Driver_Setup.driver.findElement(By.xpath("//span[contains(text(),'Next')]//parent::button")).click();
		Driver_Setup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(10000);
	}
	
	
	public void ICISsearchFilter() throws InterruptedException {
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(), 'Business Name')]//following::div[3]//input")).click();
		Driver_Setup.driver.findElement(By.xpath("//label[contains(text(), 'Business Name')]//following::div[3]//input")).sendKeys(businessName);
		Driver_Setup.driver.findElement(By.xpath("//lightning-input[@id='dunsNumber']//div//div/input")).click();
		Driver_Setup.driver.findElement(By.xpath("//lightning-input[@id='dunsNumber']//div//div/input")).sendKeys("983654321");
		Driver_Setup.driver.findElement(By.xpath("//label[@id='labelCompanyUrl']//following::div//lightning-input[@id='Website']//input")).click();
		Thread.sleep(5000);
		Driver_Setup.driver.findElement(By.xpath("//button[contains(text(), 'Create New')]")).click();
		Thread.sleep(10000);
	}
	
	public void enterLeadDetails() throws InterruptedException {
		
		Driver_Setup.driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		Driver_Setup.driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
		Driver_Setup.driver.findElement(By.xpath("//input[@name='lastName']")).clear();
		Driver_Setup.driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastName);
		Thread.sleep(5000);
		Driver_Setup.driver.findElement(By.xpath("//records-record-layout-item[@field-label='Email']//input")).clear();
		Driver_Setup.driver.findElement(By.xpath("//records-record-layout-item[@field-label='Email']//input")).sendKeys(email);
		Driver_Setup.driver.findElement(By.xpath("//records-record-layout-item[@field-label='Phone']//input")).clear();
		Driver_Setup.driver.findElement(By.xpath("//records-record-layout-item[@field-label='Phone']//input")).sendKeys(phoneNumber);
		Thread.sleep(5000);
		Driver_Setup.driver.findElement(By.xpath("//input[@name='Company']")).clear();
		Driver_Setup.driver.findElement(By.xpath("//input[@name='Company']")).sendKeys(businessName);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//records-record-layout-item[@field-label='Organisation Type']//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']")));
		WebElement org = Driver_Setup.driver.findElement(By.xpath("//records-record-layout-item[@field-label='Organisation Type']//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
		org.click();
		Thread.sleep(3000);
		org.click();
		Thread.sleep(5000);
		Driver_Setup.driver.findElement(By.xpath("//records-record-layout-item[@field-label='Organisation Type']//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']//parent::div//parent::div//div[2]//lightning-base-combobox-item[3]")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//records-record-layout-item[@field-label='Business Type']//button")));
		WebElement businessType = Driver_Setup.driver.findElement(By.xpath("//records-record-layout-item[@field-label='Business Type']//button"));
		businessType.click();
		Thread.sleep(3000);
		businessType.click();
		Thread.sleep(5000);
		Driver_Setup.driver.findElement(By.xpath("//records-record-layout-item[@field-label='Business Type']//button//parent::div//parent::div//div[2]//lightning-base-combobox-item[3]")).click();
		Thread.sleep(5000);
	}
	
	
	public void BillingAddress() throws InterruptedException {
		WebElement street = Driver_Setup.driver.findElement(By.xpath("//label[contains(text(),'Street')]//parent::lightning-textarea//div//textarea"));
		WebElement city = Driver_Setup.driver.findElement(By.xpath("//input[@name='City__c']"));
		WebElement state = Driver_Setup.driver.findElement(By.xpath("//input[@name='State__c']"));
		WebElement postalCode = Driver_Setup.driver.findElement(By.xpath("//input[@name='Postal_Code__c']"));
		WebElement country = Driver_Setup.driver.findElement(By.xpath("//records-record-layout-item[@class='slds-form__item slds-no-space' and @field-label='Country']//button"));
		
		
		//United Kingdom
		street.sendKeys("1 ALBION ROAD");
		city.sendKeys("Sutton");
		state.sendKeys("Antrim");
		postalCode.sendKeys("SM2 5TA");
		Thread.sleep(5000);
		country.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//lightning-base-combobox-item[@data-value='United Kingdom']")));
		Driver_Setup.driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='United Kingdom']")).click();
		Thread.sleep(5000);
		Driver_Setup.driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(10000);
	}
	
	public void convertLead() throws InterruptedException{
		
		Driver_Setup.driver.navigate().refresh();
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='Convert']")));
		Driver_Setup.driver.findElement(By.xpath("//button[@name='Convert']")).click();
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal-footer slds-modal__footer']//button//parent::div//span//button")));
		Driver_Setup.driver.findElement(By.xpath("//div[@class='modal-footer slds-modal__footer']//button//parent::div//span//button")).click();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='primaryField truncate']//a[@data-refid='recordId']")));
		Driver_Setup.driver.findElement(By.xpath("//div[@class='primaryField truncate']//a[@data-refid='recordId']")).click();
		Thread.sleep(5000);
		this.account_link = Driver_Setup.driver.getCurrentUrl();
		Thread.sleep(5000);
	}
	
	
	
}
