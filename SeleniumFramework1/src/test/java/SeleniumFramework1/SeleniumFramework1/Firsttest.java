package SeleniumFramework1.SeleniumFramework1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Firsttest {
	
	/*@Test
	public void run(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement txtsearchbox=driver.findElement(By.xpath("//input[@name='q']"));
		//WebElement btnenter=driver.findElement(By.xpath("//input[@name='btnK']"));
		txtsearchbox.sendKeys("zerodha kite login website");
		txtsearchbox.sendKeys(Keys.ENTER);
		//btnenter.click();
		Thread.sleep(3000);
		driver.close();
		
    }*/
	@Test
	public void execute() {
		System.out.println("hello");
	}
	
	@AfterTest
	public void clean() {
		System.out.println("finish test");
	}
	
}


