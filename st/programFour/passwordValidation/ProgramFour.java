package passwordValidation;

import java.util.ArrayList;

public class ProgramFour {
    ArrayList<String> passwordsDb;
    ArrayList<String> userNames;


    public ProgramFour(){
        passwordsDb = new ArrayList<>();
        userNames = new ArrayList<>();

        userNames.add("tony");
        passwordsDb.add("stark");

        userNames.add("bruce");
        passwordsDb.add("banner");

        userNames.add("steve");
        passwordsDb.add("rogers");
    }

    public boolean acceptPassword(String userName, String pasword, String rePassword){

        for(int i = 0; i < userNames.size(); i++){
            if(userNames.get(i).equals(userName)){
                if(passwordsDb.get(i).equals(pasword) && passwordsDb.get(i).equals(rePassword)){
                    System.out.println("User authenticated!");
                    return true;
                }else{
                    System.out.println("User unauthorized!");
                }
            }
        }

        return false;
    }
}
