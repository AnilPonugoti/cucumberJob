package utility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericUtils {
	
	public WebDriver driver;
	
	public genericUtils(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void switchToOffersPage() {
		if(!driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers")) {
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		
		}
		
	}

}
