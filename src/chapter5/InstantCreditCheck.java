package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    // Global variables
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double s = getSalary();
        int c = getCreditScore();
        scanner.close();
        boolean qualified = isUserQualified(c, s);
        notifyUser(qualified);

    }
    public static double getSalary(){
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore() {
        System.out.print("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(int creditScore, double salary) {
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if(isQualified) {
            System.out.print("Congrats! You've been approve.");
        } else{
            System.out.print("Sorry. You've been declined.");
        }
    }
}
