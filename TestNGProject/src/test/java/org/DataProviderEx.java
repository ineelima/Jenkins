package org;
import org.testng.annotations.DataProvider;

public class DataProviderEx {

    @DataProvider
    public Object[][] dp(){
        Object[][] a={{1},{2},{3}};
            return a;
    }

}
