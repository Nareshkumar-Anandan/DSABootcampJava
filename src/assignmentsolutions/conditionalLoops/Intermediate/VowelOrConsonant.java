package assignmentsolutions.conditionalLoops.Intermediate;

// Java Program Vowel Or Consonant

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Letter: ");
        char letter = sc.next().charAt(0);

        if ((letter >= 'A' && letter <= 'Z') ||
                (letter >= 'a' && letter <= 'z')) {

            if (letter == 'A' || letter == 'E' || letter == 'I' ||
                    letter == 'O' || letter == 'U' ||
                    letter == 'a' || letter == 'e' || letter == 'i' ||
                    letter == 'o' || letter == 'u') {

                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }

        } else {
            System.out.println("Invalid Input");
        }
    }
}