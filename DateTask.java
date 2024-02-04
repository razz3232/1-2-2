import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTask{
    private int day;
    private int month;
    private int year;

    public DateTask(){
        this(1,1,1);
    }

    public DateTask(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
        }

    public String toString(){
        LocalDate date = LocalDate.of(year, month, day);
        DateTimeFormatter shortF = DateTimeFormatter.ofPattern("MMMM/d/yyyy");
        return (shortF.format(date)); 
        }
    public int getDay(){
        return this.day;
    }
    public int setDay(int day){
        this.day = 0;
        if(day>0)
            this.day = day;
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }
    public int setMonth(int month){
        this.month = 0;
        if(month>0)
            this.month = month;
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public int setYear(int year){
        this.year = 0;
        if(year>0)
            this.year = year;
        return this.year;
    }


    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void displayLeapYears(int startYear, int endYear) {
        System.out.println("Leap years between " + startYear + " and " + endYear + ":");
        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                System.out.print(year + " ");
            }
        }
        System.out.println();
    }

}