package chapter2;

import java.util.Scanner;

public class Excercise {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter season of the year: ");
        String season = input.next();
        System.out.print("Enter a number: ");
        int qty = input.nextInt();
        System.out.print("Enter an adjective: ");
        String adj = input.next();

        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + qty + " cups of coffee");
    }



}
