package program;

public class DateFieldTest {
    int mm, dd, yyyy;
    int nDay;

    public boolean checkDate(String date){
        String[] dates = date.split("/");

        System.out.println("Entered Date: " + date);

        mm = Integer.parseInt(dates[0]);
        dd = Integer.parseInt(dates[1]);
        yyyy = Integer.parseInt(dates[2]);

        if(mm > 12 || mm <= 0){
            System.out.println("Invalid Month!");
            return false;
        }

        if(yyyy < 1000){
            System.out.println("Invalid Year!");
            System.out.println("Must be 4 digits!");
            return false;
        }

        switch (mm){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nDay = 31;
                break;

            case 2:
                if(checkYear(yyyy))
                    nDay = 29;
                else
                    nDay = 28;

                break;

            case 4:
            case 6:
            case 9:
            case 11:
                nDay = 30;
                break;
        }

        if(dd > nDay || dd <= 0){
            System.out.println("Invalid Day!");
            System.out.println("Month " + mm + " has " + nDay + " days");
            return false;
        }



        return true;
    }

    private boolean checkYear(long year) {
        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else if (year % 4 == 0)
            return true;
        else
            return false;
    }
}
