package utility;

import org.openqa.selenium.WebDriver;

import pageFactory.PageObjectManager;

public class TextContextSetUp {
	
	public WebDriver driver;
	public String actualProdName;
	public PageObjectManager pageObjectManag;
	public TestBase tb;
	public genericUtils gt;
	
	public TextContextSetUp() {
		tb=new TestBase();
		pageObjectManag=new PageObjectManager(tb.WebDriverManager());
		gt=new genericUtils(tb.WebDriverManager());
		
	}

}
