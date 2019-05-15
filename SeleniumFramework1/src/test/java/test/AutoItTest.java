package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItTest {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		autoIt();
	}

	public static void autoIt() throws Exception{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://gofile.io/?t=uploadFiles");
		driver.findElement(By.id("btnChooseFiles")).click();
		//driver.findElement(By.name("file_description")).sendKeys("Hello");
		Runtime.getRuntime().exec("D:\\AutoIT\\FileUpload.exe");
		Thread.sleep(3000);
	}
}
