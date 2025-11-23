package Chapter04;

import java.util.Scanner;

public class Exercise4_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter a SSN in the format(DDD-DD-DDDD): ");
        String ssn = input.next();

        if (ssn.length() != 11 || ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
            System.out.printf("%s is an invalid social security number", ssn);
            System.exit(1);
        }

        // Define individual characters
        char char1 = ssn.charAt(0);
        char char2 = ssn.charAt(1);
        char char3 = ssn.charAt(2);
        char char5 = ssn.charAt(4);
        char char6 = ssn.charAt(5);
        char char8 = ssn.charAt(7);
        char char9 = ssn.charAt(8);
        char char10 = ssn.charAt(9);
        char char11 = ssn.charAt(10);

        boolean checkCondition = Character.isDigit(char1) && Character.isDigit(char2) && Character.isDigit(char3) &&
                Character.isDigit(char5) && Character.isDigit(char6) && Character.isDigit(char8) &&
                Character.isDigit(char9) && Character.isDigit(char10) && Character.isDigit(char11);

        // Handle exceptions
        if (!checkCondition) {
            System.out.printf("%s is an invalid social security number", ssn);
            System.exit(1);
        }

        // Display the result to the user
        System.out.printf("%s is a valid social security number", ssn);
        
    }
}