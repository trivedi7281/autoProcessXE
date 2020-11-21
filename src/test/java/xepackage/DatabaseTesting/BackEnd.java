package xepackage.DatabaseTesting;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BackEnd extends ConnectmsSQL {

    @Test(priority = 1)
    public void plantMst() throws SQLException {

        
            String query = "select * from PlantMst where vPlantName = 'Matoda'";
            // Get the contents of userinfo table from DB
            ResultSet result = stmt.executeQuery(query);
            //print the result untill all the records are printed
            //res.next() returns true if there is any text record else returns false
            System.out.println("Query has been executed sucessfully");
            while (result.next())
            {
                String PlantNo = result.getString(1);
                Assert.assertEquals(PlantNo, "1"); 
                String PlantCode = result.getString(9);
                Assert.assertEquals(PlantCode, "0010");
            }
        
    
   }
    
}
