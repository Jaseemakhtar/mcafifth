package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import program.UpdateExcelFile;

public class TestSuite1 {
    private UpdateExcelFile instance;

    @BeforeClass
    public void initTestSuite1(){
        instance = new UpdateExcelFile();
    }

    @Test
    public void testCaseUpdateFile(){
        Assert.assertEquals(instance.updateRecords(4, "v"), 8);
    }
}
