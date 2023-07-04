package chapter7;

import java.util.Scanner;

public class DayofTheWeek {

    public static void main(String[] args) {

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday" , "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for the day of the week: ");
        int index = input.nextInt();
        input.close();

        System.out.print("Corresponding day: " + week[index -1]);
    }
}
