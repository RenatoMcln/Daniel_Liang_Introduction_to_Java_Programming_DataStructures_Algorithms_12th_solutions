package Chapter03;

import java.util.Scanner;

public class Exercise3_18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the weight
        System.out.println("Enter the weight of the package to calculate its cost for shipping.");
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Handling exceptions
        if (weight <= 0) {
            System.out.println("Invalid input! Please enter a value greater than 0.");
            System.exit(1);
        } else if (weight > 20) {
            System.out.println("Too heavy, the package cannot be shipped.");
            System.exit(1);
        }

        // Defining shipping cost in dollars
        double shippingCost;

        if (weight > 0 && weight <= 1) {
            shippingCost = 3.5;
        } else if (weight > 1 && weight <= 3) {
            shippingCost = 5.5;
        } else if (weight > 3 && weight <= 10) {
            shippingCost = 8.5;
        } else {
            shippingCost = 10.5;
        }

        // Display the result to the user
        System.out.println("The shipping cost in dollars is $" + shippingCost);
        
    }
}
