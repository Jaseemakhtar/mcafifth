package testSuite;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import passwordValidation.ProgramFour;

public class PasswordValidateTest {

    ProgramFour four;

    @BeforeMethod
    public void init(){
        four = new ProgramFour();
    }


    @Test(priority = 0)
    void testPassword(){
        Assert.assertTrue(four.acceptPassword("tony", "stark", "stark"));
    }

}
