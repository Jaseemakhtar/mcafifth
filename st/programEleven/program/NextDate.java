package program;

public class NextDate {
    int nDay;
    int nextDay, nextMonth, nextYear;

    public String generateNextDate(int d, int m, int y){
        String  nextDate = "";

        System.out.println("Current date: " + d + "-" + m + "-" + y);

        switch (m){
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
                if(checkYear(y))
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

        nextDay = d + 1;
        nextMonth = m;
        nextYear = y;

        if(nextDay > nDay){
            nextDay = 1;
            nextMonth++;
        }

        if(nextMonth > 12){
            nextMonth = 1;
            nextYear++;
        }

        nextDate = nextDay + "-" + nextMonth + "-" + nextYear;
        System.out.println("Next date: " + nextDate);
        return nextDate;
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
