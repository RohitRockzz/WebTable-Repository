package TestCaptch.WebTable;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver {
	
	
	public driver(WebDriver webdriver ,String name){
		
		if(name.equals("chrome")) {
		webdriver = WebDriverManager.chromedriver().create();
		}
		else{
			
			System.out.println("No such browser found...");
		}
		
	}
	
	
}
