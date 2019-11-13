package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import program.CountObjects;

public class TestSuite1 {
    CountObjects countObjects;

    @BeforeClass
    public void init(){
        countObjects = new CountObjects();
    }

    @Test
    public void testCaseCount(){
        Assert.assertEquals(countObjects.openPageAndCount(), 705);
    }
}
