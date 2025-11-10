package Chapter03;

import java.util.Scanner;

public class Exercise3_09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        long isbn = input.nextLong();

        // Defining the single digits
        byte d9 = (byte) (isbn % 10);
        isbn /= 10;
        byte d8 = (byte) (isbn % 10);
        isbn /= 10;
        byte d7 = (byte) (isbn % 10);
        isbn /= 10;
        byte d6 = (byte) (isbn % 10);
        isbn /= 10;
        byte d5 = (byte) (isbn % 10);
        isbn /= 10;
        byte d4 = (byte) (isbn % 10);
        isbn /= 10;
        byte d3 = (byte) (isbn % 10);
        isbn /= 10;
        byte d2 = (byte) (isbn % 10);
        isbn /= 10;
        byte d1 = (byte) (isbn % 10);

        byte d10Expression = (byte) ((d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11);

        byte d10 = 0;
        String d10String = "";

        if (d10Expression == 10) {
            d10String = "X";
        } else {
            d10 = d10Expression;
        }

        // Display the result to the user
        if (d10Expression == 10) {
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10String);
        } else {
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        }

    }
}