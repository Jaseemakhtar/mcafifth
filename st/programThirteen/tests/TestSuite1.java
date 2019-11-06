package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import program.ProgramThirteen;

public class TestSuite1 {

    ProgramThirteen programThirteen;

    @BeforeClass
    public void init(){
        programThirteen = new ProgramThirteen();
    }

    @Test
    public void scoreCheck(){
        Assert.assertEquals(programThirteen.displayPassed(), 8);
    }
}
