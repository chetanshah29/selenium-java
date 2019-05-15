package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch2 {
	WebDriver driver=null;
	GoogleSearchObj obj=null;
	
	@BeforeTest
	public void init_test1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		obj=new GoogleSearchObj(driver);
	}
	
	@Test
	public void entertext1() throws InterruptedException {
		obj.settext("zerodha");
	}
	
	@Test
	public void enterbutton1() {
		obj.search();
	}
	
	@AfterTest
	public void close1() {
		driver.close();
	}
	
	
	
}
