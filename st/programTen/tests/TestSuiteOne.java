package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import triangleProblem.TriangleProblem;

public class TestSuiteOne {
    TriangleProblem t;

    @BeforeClass
    public void init(){
        t = new TriangleProblem();
    }

    @Test
    public void testCaseOne(){
        Assert.assertEquals(t.getTriangle(20, 30, 40), "scalene");
    }
}
