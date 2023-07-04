package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double overCharge = 0.25;
    static double tax = 0.15;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double costPlan = costPlan();
        int over = overageMinutes();
        scanner.close();
        double overageFees = calculateOverageFees(over);
        double total = overageFees + costPlan;
        double taxFees = calculateTax(overageFees, costPlan);
        double finalTotal = finalTotal(taxFees, total);

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: " + "$"+costPlan);
        System.out.println("Overage: " + "$"+overageFees);
        System.out.println("Tax: " + "$"+taxFees);
        System.out.print("Total: " + "$"+finalTotal);

    }

    public static double costPlan() {
        System.out.print("Enter base cost of the plan: ");
        double costPlan = scanner.nextDouble();
        return costPlan;
    }

    public static int overageMinutes() {
        System.out.print("Enter overage minutes: ");
        int over = scanner.nextInt();
        return over;
    }

    public static double calculateOverageFees(int over) {
        double overageFees = over * overCharge;
        return overageFees;
    }

    public static double calculateTax(double overageFees, double total) {
        double taxFees = tax * total;
        return taxFees;
    }

    public static double finalTotal(double taxFees, double total) {
        double finalTotal = total + taxFees;
        return finalTotal;
    }
}
