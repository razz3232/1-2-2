import java.sql.Date;

public class MyDate{
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1978,1,1);
        DateTask date2 = new DateTask(1984,8,21);

        DateTask dateTask = new DateTask();
        int year1 = dateTask.setYear(1978);
        int month = dateTask.setMonth(1);
        int day = dateTask.setDay(1);
        System.out.println(year1+" "+month+" "+day);

        System.out.println(date1.toString());
        System.out.println(date2.toString());

        DateTask.isLeapYear(year1);
        DateTask.displayLeapYears(year1, 1984);
    }
    
}

