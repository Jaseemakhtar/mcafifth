package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import program.Bank;

public class TestSuite1 {
    Bank b;

    @BeforeClass
    public void initTest(){
        b = new Bank();
        b.init();
    }

    @Test(priority = 1)
    public void loggedInTest(){
        Assert.assertTrue(b.login("Tony","pepper"));
        b.logOut();
    }

    @Test(priority = 2)
    public void accountCreateTest(){
        Assert.assertTrue(b.createAccount("Jasmit","Jasmit"));
    }

    @Test(priority = 3)
    public void depositedTest(){
        Assert.assertTrue(b.deposit(1000));
    }

    @Test(priority = 4)
    public void withdrawalTest(){
        Assert.assertTrue(b.withdraw(1000));
    }

    @AfterClass
    public void exitTest(){
        b.exit();
    }
}
