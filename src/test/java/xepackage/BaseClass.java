package xepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public WebDriver driver;

	@BeforeClass
	public void setup () {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.32.0.173/edctest/");
	}
	
	@AfterClass
	public void tearDown () {
		
		driver.quit();
		
	}

    
}
