package chapter4;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {

        System.out.print("Enter the number of items you would like to scan: ");
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();

        double total = 0;

        // (awal, berhenti, increment)
        for(int i=0; i<quantity; i++) {

            System.out.print("Enter the cost of the item " + (i+1) + ": ");
            double price = input.nextDouble();
            total = total + price;
        }

        input.close();
        System.out.println("--------------------------------------------");
        System.out.print("Your total is Rp." + total);
    }
}
