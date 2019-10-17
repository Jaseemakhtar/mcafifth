package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import program.DateFieldTest;

public class TestSuiteOne {
    DateFieldTest dFT;

    @BeforeClass
    public void init(){
        dFT = new DateFieldTest();
    }

    @Test
    public void testCase1(){
        //Date must be in the format MM/DD/YYYY
        Assert.assertTrue(dFT.checkDate("04/31/2019"));
    }
}
