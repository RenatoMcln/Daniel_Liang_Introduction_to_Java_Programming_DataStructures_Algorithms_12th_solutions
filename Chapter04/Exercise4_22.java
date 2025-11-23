package Chapter04;

import java.util.Scanner;

public class Exercise4_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        // Check if there is a substring and display the result to the user
        if (s1.contains(s2)) {
            System.out.printf("%s is a substring of %s", s2, s1);
        } else {
            System.out.printf("%s is not a substring of %s", s2, s1);
        }

    }
}
