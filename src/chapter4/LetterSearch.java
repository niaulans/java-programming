package chapter4;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {

        System.out.print("Enter some text: ");
        Scanner input = new Scanner(System.in);
        String text = input.next();
        input.close();

        boolean letterFound = false;

        // Search text for letter A
        for(int i=0; i<text.length(); i++) {
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        if(letterFound) {
            System.out.print("This text contains the letter 'A'");
        } else {
            System.out.print("This text does not contain the letter 'A'");
        }
    }
}
