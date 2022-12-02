package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utility.TextContextSetUp;

public class Hooks {
	
	public TextContextSetUp textContextSetUps;
	
	public Hooks(TextContextSetUp textContextSetUps) {
		this.textContextSetUps=textContextSetUps;
	}
	
	@After
	public void tearDown() {
		textContextSetUps.tb.WebDriverManager().quit();
	}
	
	@AfterStep
	public void getScreenShot(Scenario scenario) throws IOException {
		WebDriver driver=textContextSetUps.tb.WebDriverManager();
		if(scenario.isFailed()) {
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			byte[] sou=FileUtils.readFileToByteArray(source);
			scenario.attach(sou, "image/png", "image");
			
		}
	}

}
