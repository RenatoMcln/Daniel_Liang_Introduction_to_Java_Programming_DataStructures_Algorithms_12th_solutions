package Chapter04;

import java.util.Scanner;

public class Exercise4_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the letter grade
        System.out.print("Enter a letter grade: ");
        String s = input.next();

        char letter = Character.toUpperCase(s.charAt(0)); // To display to the user

        // Display the result to the user
        byte grade = -1;

        switch (letter) {
            case 65: grade = 4; break;
            case 66: grade = 3; break;
            case 67: grade = 2; break;
            case 68: grade = 1; break;
            case 70: grade = 0; break;
            default: // Handle exceptions
                System.out.printf("%s is an invalid grade", s);
                System.exit(1);
                break;
        }

        // Display the result to the user
        System.out.printf("The numeric value for grade %c is %d", letter, grade);

    }
}


