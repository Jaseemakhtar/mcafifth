package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import program.NextDate;

public class TestSuite1 {
    NextDate nextDate;

    @BeforeClass
    public void setUp(){
        nextDate = new NextDate();
    }

    @Test
    public void testNextDate(){
        Assert.assertEquals(nextDate.generateNextDate(31, 10, 2019), "1-11-2019");
    }
}
