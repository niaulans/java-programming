package chapter3;

import java.util.Scanner;

/*If statement
* All salespeoplle get a payment of $1000 a week.
* Salespersons who exceed 10 sales get an additional bonus of $250.
* */
public class SalaryCalculator {

    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.print("How many sales did the employee make this week: ");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        input.close();

        if(sales > quota) {
            salary = salary + bonus;
        }

        System.out.print("The employee pay is: " + salary);
    }
}
