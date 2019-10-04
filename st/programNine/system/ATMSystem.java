package logic;

import java.util.ArrayList;
import java.util.Calendar;

public class ATMSystem {

    private ArrayList<ATMDB> atmdbs;
    private Calendar calendar;

    public void start(){
        atmdbs = new ArrayList<>();
        calendar = Calendar.getInstance();

        ATMDB user1 = new ATMDB("8505 4504 4520 3208", "1234", 2022);
        ATMDB user2 = new ATMDB("4522 5604 9087 7541", "5678", 2018);
        ATMDB user3 = new ATMDB("5106 8075 6508 8287", "4321", 2021);

        atmdbs.add(user1);
        atmdbs.add(user2);
        atmdbs.add(user3);

        println("Welcome to the ATM.");
    }

    public boolean insertCard(String cardNo, String password){
        for(int i = 0; i < atmdbs.size(); i++){

            ATMDB row = atmdbs.get(i);

            if(row.cardNo.equals(cardNo)){
                println("Card Inserted!");

                if(row.password.equals(password)){

                    println("User authenticated.");
                    int year = calendar.get(Calendar.YEAR);
                    if(row.expiryDate < year){
                        println("Card has expired!");
                        return false;
                    }

                    return true;
                }else{
                    println("Wrong password.");
                    return false;
                }
            }
        }

        println("Card not registered.");
        return false;
    }

    public String selectLanguage(int choice){
        println("Select Language.");
        println("1. English");
        println("2. Hindi");
        println("Enter your choice.");

        switch (choice){
            case 1:
                println("English selected.");
                return "english";
            case 2:
                println("Hindi selected.");
                return "hindi";

            default:
                return "invalid";
        }
    }

    public String selectAccountType(int choice){
        println("Select Account type.");
        println("1. Current");
        println("2. Savings");
        println("Enter your choice.");
        switch (choice){
            case 1:
                return "current";
            case 2:
                return "savings";

            default:
                return "invalid";
        }
    }

    public void println(Object o){
        System.out.println(String.valueOf(o));
    }


    public void end(){
        println("Thank you for using ATM. Bye!");
    }

}
