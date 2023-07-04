package chapter5;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args){

        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        greetUser(name); // Call method
    }
    public static void greetUser(String name) {
        System.out.print("Hi there, " + name);
    }
}
