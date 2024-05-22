package TestCaptch.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	
	WebDriver driver;
	
	
	@Test
	public void test() throws Exception {
		
		
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.dezlearn.com/webtable-example/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("")).getCssValue("color");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		WebElement e = driver.findElement(By.xpath(""));
		
		
		List<String> names = new ArrayList<String>();
		List<String> emails = new ArrayList<String>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(12);
		num.add(13);
		Assert.assertTrue(false);
		
		String filePath = System.getProperty("");
		FileInputStream fileStream = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(fileStream);
		XSSFSheet sheet = wb.getSheet("Sheet 1");
		int totalRows2 = sheet.getLastRowNum() - sheet.getFirstRowNum();
		XSSFRow row = sheet.getRow(0);
		int totalColumns = row.getLastCellNum() - row.getFirstCellNum();
		List<String> cellValues = new ArrayList<String>();
		for(int i=0; i<totalRows2;i++) {
			XSSFRow row2 = sheet.getRow(i);
			for(int j=0; j<totalColumns;j++) {
				XSSFCell cell = row2.getCell(j);
				cellValues.add(cell.getStringCellValue());
			}
		}
		
		for(int i=0; i<cellValues.size();i++) {
			System.out.println(cellValues.get(i));
		}
		
		Iterator<Integer> it = num.iterator();
	
		while(it.hasNext()) {
			
		}
		
		//Getting names from Column 1
		List<WebElement> totalRows = driver.findElements(By.xpath("//table[@class='tg']//tr"));
		System.out.println("Total Rows: "+totalRows.size());
		Thread.sleep(5000);
		
		
		  for(int i=2; i<=totalRows.size(); i++) {
			  String value = driver.findElement(By.xpath("//table[@class='tg']//tr["+i+"]/td[1]")).getText();
			  String email = driver.findElement(By.xpath("//table[@class='tg']//tr["+i+"]/td[2]")).getText();
			  names.add(value);
			  emails.add(email);
		  } 
		  
		  System.out.println("Names are: ");
		  for(String name: names) {
				System.out.println(name);
			}
		  
		  System.out.println("Emails are: ");
		  for(String email: emails) {
				System.out.println(email);
			}
		 
		  driver.close();
		  driver.quit();
	}

}
