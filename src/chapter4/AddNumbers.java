package chapter4;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean again = false;
        // di dalam do akan dijalankan kalau kondisi again = true
        do{
            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            double sum = num1 + num2;
            System.out.print("The sum is " + sum);

            System.out.print("Would you like to start over? ");
            again = input.nextBoolean();

        } while(again);
    }
}
