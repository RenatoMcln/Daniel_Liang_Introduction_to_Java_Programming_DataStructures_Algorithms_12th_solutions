package Chapter04;

import java.util.Scanner;

public class Exercise4_19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String isbn = input.next();

        if (isbn.length() != 9) {
            System.out.println("Please enter exactly the first 9 digits of an ISBN number.");
            System.exit(1);
        }

        // Defining the single digits
        String d1 = "" + isbn.charAt(0);
        String d2 = "" + isbn.charAt(1);
        String d3 = "" + isbn.charAt(2);
        String d4 = "" + isbn.charAt(3);
        String d5 = "" + isbn.charAt(4);
        String d6 = "" + isbn.charAt(5);
        String d7 = "" + isbn.charAt(6);
        String d8 = "" + isbn.charAt(7);
        String d9 = "" + isbn.charAt(8);

        int d10Expression = (Integer.parseInt(d1) + Integer.parseInt(d2) * 2 + Integer.parseInt(d3) * 3 +
                             Integer.parseInt(d4) * 4 + Integer.parseInt(d5) * 5 + Integer.parseInt(d6) * 6 +
                             Integer.parseInt(d7) * 7 + Integer.parseInt(d8) * 8 + Integer.parseInt(d9) * 9) % 11;

        String d10; // d10 digit

        if (d10Expression == 10) {
            d10 = "X";
        } else {
            d10 = String.valueOf(d10Expression);
        }

        // Display the result to the user
        System.out.printf("The ISBN-10 number is %s%s%s%s%s%s%s%s%s%s", d1, d2, d3, d4, d5, d6, d7, d8, d9, d10);

    }
}
