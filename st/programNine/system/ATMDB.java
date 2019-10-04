package logic;

public class ATMDB {
    String cardNo;
    int expiryDate;
    String password;

    public ATMDB(String cardNo, String password, int expiryDate){
        this.cardNo = cardNo;
        this.password = password;
        this.expiryDate = expiryDate;
    }
}