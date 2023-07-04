package chapter3;

import java.util.Scanner;
import java.util.Locale;

public class TestResults {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.print("Enter your test score : ");
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();

        char grade;

        if(score < 60) {
            grade = 'F';
        } else if(score < 70) {
            grade = 'D';
        } else if(score < 80) {
            grade = 'C';
        } else if(score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.print("Your grade is " + grade);
    }
}
