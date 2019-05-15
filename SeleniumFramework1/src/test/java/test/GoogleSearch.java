package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	WebDriver driver=null;
	GoogleSearchObj obj=null;
	
	@BeforeTest
	public void init_test() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		obj=new GoogleSearchObj(driver);
	}
	
	@Test
	public void entertext() throws InterruptedException {
		obj.settext("zerodha");
	}
	
	@Test
	public void enterbutton() {
		obj.search();
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
	
}
