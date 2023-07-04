package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {

        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.print("Enter your salary: ");
        Scanner input = new Scanner (System.in);
        double salary = input.nextDouble();

        System.out.print("Enter the number of years with your currennt employer: ");
        double years = input.nextDouble();

        input.close();

        if(salary >= requiredSalary) {
            if(years >= requiredYearsEmployed) {
                System.out.print("Congrats! You qualify for the loan.");
            }
            else {

                System.out.print("Sorry, you must have worked at your current job " + requiredYearsEmployed + " years");
            }
        } else {
            System.out.print("Sorry, you must earn at least " + requiredSalary + " to qualify for the loan");
        }
    }
}
