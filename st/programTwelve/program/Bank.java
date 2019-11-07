package program;

import java.util.ArrayList;

public class Bank {
    ArrayList<BankAccount> accounts;
    boolean isLoggedIn;
    String loggedInUser;

    public void init(){
        println("---------------------");
        println("Welcome to Bank of CS!");
        accounts = new ArrayList<>();

        BankAccount acc1 = new BankAccount();
        acc1.userName = "Tony";
        acc1.password = "pepper";
        acc1.balance = 999;

        accounts.add(acc1);
    }

    public boolean createAccount(String userName, String password){

        for(BankAccount account: accounts){
            if(account.userName.equals(userName)){
                println("---------------------");
                println("User already exists!");
                return false;
            }
        }

        BankAccount acc = new BankAccount();
        acc.userName = userName;
        acc.password = password;

        accounts.add(acc);

        login(userName, password);

        return true;
    }

    public boolean login(String userName, String password){


        for(BankAccount account: accounts){
            if(account.userName.equals(userName) && account.password.equals(password)){
                println("---------------------");
                println("Login successful!");
                isLoggedIn = true;
                loggedInUser = userName;
            }
        }

        if(!isLoggedIn){
            println("---------------------");
            println("Login failed!");
        }

        return isLoggedIn;
    }

    public void logOut(){
        isLoggedIn = false;
    }

    public boolean deposit(long balance){
        if(isLoggedIn){
            for (BankAccount bankAccount: accounts){
                if (bankAccount.userName.equals(loggedInUser)){
                    bankAccount.balance += balance;
                    println("---------------------");
                    println("Deposited Amount: " + balance);
                    println("Available Amount: " + bankAccount.balance);
                    return true;
                }
            }
        }

        return false;
    }

    public boolean withdraw(long balance){
        if(isLoggedIn){
            for (BankAccount bankAccount: accounts){
                if (bankAccount.userName.equals(loggedInUser)){
                    if(bankAccount.balance >= balance){
                        bankAccount.balance -= balance;
                        println("---------------------");
                        println("Withdrawal Amount: " + balance);
                        println("Available Amount: " + bankAccount.balance);
                        return true;
                    }else{
                        println("---------------------");
                        println("Not sufficient balance!");
                        return false;
                    }
                }
            }


        }

        return false;
    }

    public void exit(){
        println("---------------------");
        println("Thank you for using Bank of CS!");
    }


    public static void println(Object o){
        System.out.println(o);
    }


}
