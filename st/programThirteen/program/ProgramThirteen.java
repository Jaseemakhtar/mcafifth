package program;

import java.util.ArrayList;

public class ProgramThirteen {
    ArrayList<StudentRecord> studentRecords;

    public ProgramThirteen(){
        studentRecords = new ArrayList<>();

        StudentRecord akshata = new StudentRecord();
        akshata.name = "Akshata";
        akshata.avg = 90;

        StudentRecord bhikkanmiya = new StudentRecord();
        bhikkanmiya.name = "Bhikkanmiya";
        bhikkanmiya.avg = 70;

        StudentRecord jaseem = new StudentRecord();
        jaseem.name = "Jaseem";
        jaseem.avg = 74;

        StudentRecord priya = new StudentRecord();
        priya.name = "Priya";
        priya.avg = 70;

        StudentRecord salim = new StudentRecord();
        salim.name = "Salim";
        salim.avg = 92;

        StudentRecord shubham = new StudentRecord();
        shubham.name = "Shubham";
        shubham.avg = 80;

        StudentRecord vinayak_k = new StudentRecord();
        vinayak_k.name = "Vinayak K";
        vinayak_k.avg = 79;

        StudentRecord vinayak_z = new StudentRecord();
        vinayak_z.name = "Vinayak Z";
        vinayak_z.avg = 78;

        StudentRecord sachin = new StudentRecord();
        sachin.name = "Sachin";
        sachin.avg = 20;

        studentRecords.add(akshata);
        studentRecords.add(bhikkanmiya);
        studentRecords.add(jaseem);
        studentRecords.add(priya);
        studentRecords.add(salim);
        studentRecords.add(shubham);
        studentRecords.add(vinayak_k);
        studentRecords.add(vinayak_z);
        studentRecords.add(sachin);
    }

    public int displayPassed(){
        int totalPassed = 0;

        for (StudentRecord studentRecord: studentRecords){
            if(studentRecord.avg > 60){
                System.out.println("Name: " + studentRecord.name);
                System.out.println("Your score: " + studentRecord.avg + "%");
                System.out.println("****  Passed  ****");
                System.out.println("___________________________");
                totalPassed += 1;
            }else{
                System.out.println("Name: " + studentRecord.name);
                System.out.println("Your score: " + studentRecord.avg + "%");
                System.out.println("****  Failed  ****");
                System.out.println("___________________________");
            }
        }

        return totalPassed;
    }
}
