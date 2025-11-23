package Chapter04;

import java.util.Scanner;

public class Exercise4_24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        // Sort the three names in ascending order
        if (city1.compareToIgnoreCase(city2) > 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
        }

        if (city2.compareToIgnoreCase(city3) > 0) {
            String temp = city2;
            city2 = city3;
            city3 = temp;
        }

        if (city1.compareToIgnoreCase(city2) > 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
        }

        // Display the names in alphabetical order to the user.
        System.out.printf("The three cities in alphabetical order are %s, %s, %s.", city1, city2, city3);

    }
}


