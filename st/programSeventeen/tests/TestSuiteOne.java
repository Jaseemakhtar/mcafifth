package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import program.DesktopItems;

public class TestSuiteOne {
    DesktopItems desktopItems;

    @BeforeClass
    public void init(){
        desktopItems = new DesktopItems();
    }

    @Test
    public void test(){
        int items = desktopItems.countItems();
        Assert.assertEquals(items, 3);
    }
}
