package Chapter04;

import java.util.Scanner;

public class Exercise4_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the required input
        System.out.print("Enter employee’s name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double weekHours = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();


        // Define the required variables
        double grossPay = weekHours * hourlyPay;

        double federalWithholding = grossPay * federalTax;

        double stateWithholding = grossPay * stateTax;

        double totalDeduction = federalWithholding + stateWithholding;

        double netPay = grossPay - totalDeduction;


        // Display the table to the user
        System.out.printf("%nEmployee Name: %s %nHours Worked: %.1f %nPay Rate: $%.2f %nGross Pay: $%.2f %n", name, weekHours, hourlyPay, grossPay);

        System.out.printf("Deductions:%n\tFederal Withholding (%.1f%%): $%.2f %n\tState Withholding (%.1f%%): $%.2f %n",
                          federalTax * 100, federalWithholding, stateTax * 100, stateWithholding);

        System.out.printf("\tTotal Deduction: $%.2f %nNet Pay: $%.2f", totalDeduction, netPay);

    }
}

