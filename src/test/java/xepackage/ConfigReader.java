package xepackage;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;


public class ConfigReader {
    // Here we create a constructor of Config reader

    Properties pro ;

    public ConfigReader() {

        try 
        {
            File src = new File("E:\\ProcessXE\\autoProcessXE\\src\\test\\java\\xepackage\\Configuration\\Config.property");

            FileInputStream fin = new FileInputStream(src);

            pro = new Properties();

            pro.load(fin);
        } 
        catch (Exception e) {
            System.out.println("Exception is  ==" + e.getMessage());
            e.printStackTrace();
        } 
        

    }


    public String getURL()
    {
        return pro.getProperty("URL");
        
    }

    public String getUserName()
    {
        return pro.getProperty("UserName");
        
    }

    public String getPasssword()
    {
        return pro.getProperty("Password");
        
    }

    public String getVersion()
    {
        return pro.getProperty("version");
        
    }


    public String getCopyRight()
    {
        return pro.getProperty("copyright");
        
    }


}
