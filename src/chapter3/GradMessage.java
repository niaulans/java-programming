package chapter3;

import java.util.Scanner;

public class GradMessage {

    public static void main(String[] args){

        System.out.print("Enter your letter grade: ");
        Scanner input = new Scanner(System.in);
        String grade = input.next();

        String message;

        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder.";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade.";
        }

        System.out.print(message);
    }
}
