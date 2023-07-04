package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        int quota =  10;

        System.out.print("Enter the number of sales you made this week: ");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        input.close();

        if(sales >= quota) {
            System.out.print("Congrats! You've met your quota");
        } else{
            int salesShort = quota - sales;
            System.out.print("You did not make your quota. You were " + salesShort + " sales short.");
        }
    }
}
