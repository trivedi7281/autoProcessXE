package xepackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//details are provided by the config.properties

public class LoginPage extends BaseClass {

	ConfigReader config = new ConfigReader();

	@Test(priority = 1)
	public void version()
	{
		String version = driver.findElement(By.xpath("//*[@id='login']/p")).getText();
		System.out.println(version);
		Assert.assertEquals(version, config.getVersion());

	}

    @Test(priority = 2)
    public void UserLogin() {
		
		driver.findElement(By.xpath("//input[@id='tempTxtUserName']")).sendKeys(config.getUserName());
		driver.findElement(By.id("tempTxtPassword")).sendKeys(config.getPasssword());
		driver.findElement(By.id("tempImgBtnLogin")).click();
	}

	@Test(priority = 3)
	public void copyright() throws InterruptedException
	{
		String copyright = driver.findElement(By.xpath("//*[@id='div_Footer']/p[2]")).getText();
		System.out.println(copyright);
		Assert.assertEquals(copyright,  );

	}

    
}
