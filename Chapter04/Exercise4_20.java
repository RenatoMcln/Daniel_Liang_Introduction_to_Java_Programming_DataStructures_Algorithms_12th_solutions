package Chapter04;

import java.util.Scanner;

public class Exercise4_20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the two strings
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        // Display the result to the user
        System.out.printf("Length: %d and First character: %c", string.length(), string.charAt(0));
        
    }
}