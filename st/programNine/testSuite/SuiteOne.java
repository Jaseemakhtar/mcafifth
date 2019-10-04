package testSuite;

import logic.ATMSystem;
import org.testng.Assert;
import org.testng.annotations.*;

public class SuiteOne {

    private ATMSystem atmSystem;

    @BeforeClass
    public void start(){
        atmSystem = new ATMSystem();
        atmSystem.start();
    }

    @Test(priority = 0)
    public void acceptCard(){
        Assert.assertTrue(atmSystem.insertCard("8505 4504 4520 3208", "1234"));
    }

    @Test(priority = 1)
    public void checkExpiry(){
        Assert.assertTrue(!atmSystem.insertCard("4522 5604 9087 7541", "5678"));
    }

    @Test(priority = 2)
    public void testWrongPin(){
        boolean test = false;
        for(int i = 0; i < 3; i++){
            int randomPassword = (int) Math.floor(Math.random() * 10 + 1000);
            test = atmSystem.insertCard("5106 8075 6508 8287", "" + randomPassword);
        }
        Assert.assertTrue(test);
    }

    @Test(priority = 3)
    public void selectLanguage(){
        Assert.assertEquals(atmSystem.selectLanguage(1), "english");
    }

    @Test(priority = 4)
    public void selectAccountType(){
        Assert.assertEquals(atmSystem.selectAccountType(2), "savings");
    }

    @AfterClass
    public void end(){
        atmSystem.end();
    }
}
