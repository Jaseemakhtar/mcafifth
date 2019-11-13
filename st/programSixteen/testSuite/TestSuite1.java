package testSuite;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import program.CountListItems;

public class TestSuite1 {
    CountListItems countListItems;

    @BeforeClass
    public void initTest(){
        countListItems = new CountListItems();
    }

    @Test
    public void testItems(){
        Assert.assertEquals(5, countListItems.openWebPage());
    }
}
