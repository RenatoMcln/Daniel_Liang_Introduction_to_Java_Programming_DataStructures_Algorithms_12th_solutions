package Chapter03;

import java.util.Scanner;

public class Exercise3_33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        // Proportion
        double simplifiedCost1 = weight1 / price1;
        double simplifiedCost2 = weight2 / price2;

        // Compare the two values and display the result to the user
        if (simplifiedCost1 > simplifiedCost2) {
            System.out.println("Package 1 has a better price.");
        } else if (simplifiedCost1 < simplifiedCost2) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("Two packages have the same price.");
        }

    }
}
