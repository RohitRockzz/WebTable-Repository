package E2E_Admin;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Setup{
	
	public static WebDriver driver = new ChromeDriver();
	
	public void browserInstance() throws InterruptedException {
		driver.navigate().to("https://unity--unityqa.sandbox.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}
	
	public void breakDown() {
		driver.close();
		driver.quit();
	}
}
