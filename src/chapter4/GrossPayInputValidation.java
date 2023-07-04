package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 40;

        System.out.print("How many hours did you work this week? ");
        Scanner input = new Scanner(System.in);
        double hoursWorked = input.nextDouble();

        // validate input using while loop
        while(hoursWorked > maxHours || hoursWorked < 1) { // Loop berhenti kalau kondisi yang ditulis True
            System.out.println("Invalid entry. Yours hurs must be between 1 and 40. Try again.");
            hoursWorked = input.nextDouble();
        }
        input.close();
        double gross = rate * hoursWorked;
        System.out.println("Gross Pay: " + gross);
    }
}
