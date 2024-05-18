package Task121;
import Task121.DateTask;

import static Task121.DateTask.leapYears;

public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1, 1, 1978);
        DateTask date2 = new DateTask(9, 21,1984);
        System.out.println("Date1: " + date1);
        System.out.println("Date2: " + date2);
        DateTask.leapYears();

    }
}