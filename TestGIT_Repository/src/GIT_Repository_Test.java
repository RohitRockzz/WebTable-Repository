import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class GIT_Repository_Test {
	
	
	WebDriver driver;
	@Test
	public void test() {
		
		
		System.setProperty("webdriver.chrome.driver","");
		driver = new ChromeDriver();
		driver.get("https://github.com");
		driver.close();
		driver.quit();
	}
	
	
	
	
	
}
