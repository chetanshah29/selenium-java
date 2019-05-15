package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchObj {
	WebDriver driver;
	By txtboxsearch=By.name("q");
	By btnclick=By.name("btnK");
	
	GoogleSearchObj(WebDriver driver) {
		this.driver=driver;
	}
	
	public void settext(String txt) throws InterruptedException {
		WebElement el=driver.findElement(btnclick);
		driver.findElement(txtboxsearch).sendKeys(txt);
		Thread.sleep(3000);
		el.sendKeys(Keys.RETURN);
		
	}
	
	public void search() {
		System.out.println("Entering search");
//		driver.findElement(btnclick).sendKeys(Keys.RETURN);
	}
	
	

}
