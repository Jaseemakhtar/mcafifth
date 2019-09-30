package testSuite1;

import atm.ATMSystem;
import org.testng.*;
import org.testng.annotations.*;


public class TestSuite {
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
            System.out.println(randomPassword);
        }
        Assert.assertTrue(test);
    }

    @Test(priority = 3)
    public void selectLanguage(){

    }

    @Test(priority = 4)
    public void selectAccountType(){

    }

    @AfterClass
    public void end(){
        atmSystem.end();
    }
}
