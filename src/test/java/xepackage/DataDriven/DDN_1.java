package xepackage.DataDriven;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xepackage.BaseClass;

//This class is for the learning purpose....

public class DDN_1 extends BaseClass{

    @Test(dataProvider = "userLoginData")
    public void testCredentials(String username, String password) throws InterruptedException {

        driver.findElement(By.id("tempTxtUserName")).sendKeys(username);
		driver.findElement(By.id("tempTxtPassword")).sendKeys(password);
        driver.findElement(By.id("tempImgBtnLogin")).click();
        Thread.sleep(10000);
        String Profile = driver.findElement(By.xpath("//*[@id='lblProfile']")).getText();
		System.out.println(Profile);
		Assert.assertEquals(Profile, "Administrator");
        
    }


    //two dimensional array to initialize any data 
    @DataProvider(name = "userLoginData")
    public Object[][] passData()
    {
        Object[][] data = new Object[3][2];

        data[0][0]="AT14";  
        data[0][1]="h@123456";
        
        /*data[1][0]="AT15";  
        data[1][1]="j@123456";
        
        data[2][0]="AT16";  
        data[2][1]="h@123456";*/

        return data;


    }

}
