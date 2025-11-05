package Chapter03.CaseStudy;

import java.util.Scanner;

public class ComputeTax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your filing status and taxable income to calculate your personal income tax.");

        //Prompt the user for the first input
        System.out.print("\nEnter your filing status:\n" +
                "0 - for single filers\n" + "1 - for married filing jointly or qualified widow(er)\n" +
                "2 - for married filing separately\n" + "3 - for head of household\n" + "\nEnter your choice: ");
        byte filingStatus = input.nextByte();

        //Prompt the user for the second input
        System.out.print("Enter your taxable income: ");
        double income = input.nextDouble();


        //Defining Tax Rates for zero filers
        double zeroFilersTax1 = income * 0.10;
        double zeroFilersTax2 = (income - 8350) * 0.15 + (8350 * 0.10);
        double zeroFilersTax3 = (income - 33950) * 0.25 + (33950 - 8350) * 0.15 + (8350 * 0.10);
        double zeroFilersTax4 = (income - 82250) * 0.28 + (82250 - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.10;
        double zeroFilersTax5 = (income - 171550) * 0.33 + (171550 - 82250) * 0.28 + (82250 - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.10;
        double zeroFilersTax6 = (income - 372950) * 0.35 + (372950 - 171550) * 0.33 + (171550 - 82250) * 0.28 + (82250 - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.10;

        //Defining Tax Rates for one filers
        double oneFilersTax1 = income * 0.10;
        double oneFilersTax2 = (income - 16700) * 0.15 + (16700 * 0.10);
        double oneFilersTax3 = (income - 67900) * 0.25 + (67900 - 16700) * 0.15 + (16700 * 0.10);
        double oneFilersTax4 = (income - 137050) * 0.28 + (137050 - 67900) * 0.25 + (67900 - 16700) * 0.15 + (16700 * 0.10);
        double oneFilersTax5 = (income - 208850) * 0.33 + (208850 - 137050) * 0.28 + (137050 - 67900) * 0.25 + (67900 - 16700) * 0.15 + (16700 * 0.10);
        double oneFilersTax6 = (income - 372950) * 0.35 + (372950 - 208850) * 0.33 + (208850 - 137050) * 0.28 + (137050 - 67900) * 0.25 + (67900 - 16700) * 0.15 + (16700 * 0.10);

        //Defining Tax Rates for two filers
        double twoFilersTax1 = income * 0.10;
        double twoFilersTax2 = (income - 8350) * 0.15 + (8350 * 0.10);
        double twoFilersTax3 = (income - 33950) * 0.25 + (33950 - 8350) * 0.15 + (8350 * 0.10);
        double twoFilersTax4 = (income - 68525) * 0.28 + (68525 - 33950) * 0.25 + (33950 - 8350) * 0.15 + (8350 * 0.10);
        double twoFilersTax5 = (income - 104425) * 0.33 + (104425 - 68525) * 0.28 + (68525 - 33950) * 0.25 + (33950 - 8350) * 0.15 + (8350 * 0.10);
        double twoFilersTax6 = (income - 186475) * 0.35 + (186475 - 104425) * 0.33 + (104425 - 68525) * 0.28 + (68525 - 33950) * 0.25 + (33950 - 8350) * 0.15 + (8350 * 0.10);

        //Defining Tax Rates for three filers
        double threeFilersTax1 = income * 0.10;
        double threeFilersTax2 = (income - 11950) * 0.15 + (11950 * 0.10);
        double threeFilersTax3 = (income - 45500) * 0.25 + (45500 - 11950) * 0.15 + (11950 * 0.10);
        double threeFilersTax4 = (income - 117450) * 0.28 + (117450 - 45500) * 0.25 + (45500 - 11950) * 0.15 + (11950 * 0.10);
        double threeFilersTax5 = (income - 190200) * 0.33 + (190200 - 117450) * 0.28 + (117450 - 45500) * 0.25 + (45500 - 11950) * 0.15 + (11950 * 0.10);
        double threeFilersTax6 = (income - 372950) * 0.35 + (372950 - 190200) * 0.33 + (190200 - 117450) * 0.28 + (117450 - 45500) * 0.25 + (45500 - 11950) * 0.15 + (11950 * 0.10);


        //Defining the Tax Rates for each filing status

        if (filingStatus < 0 || filingStatus > 3) {
            System.out.println("Wrong choice. Please enter 0, 1, 2, or 3.");

        } else if (income < 0) {
            System.out.println("Positive values only!");

        } else if (filingStatus == 0) {
            if (income <= 8350) {
                System.out.println("Your Tax Rate is: $" + zeroFilersTax1);
            } else if (income <= 33950) {
                System.out.println("Your Tax Rate is: $" + zeroFilersTax2);
            } else if (income <= 82250) {
                System.out.println("Your Tax Rate is: $" + zeroFilersTax3);
            } else if (income <= 171550) {
                System.out.println("Your Tax Rate is: $" + zeroFilersTax4);
            } else if (income <= 372950) {
                System.out.println("Your Tax Rate is: $" + zeroFilersTax5);
            } else {
                System.out.println("Your Tax Rate is: $" + zeroFilersTax6);
            }

        } else if (filingStatus == 1) {
            if (income <= 16700) {
                System.out.println("Your Tax Rate is: $" + oneFilersTax1);
            } else if (income <= 67900) {
                System.out.println("Your Tax Rate is: $" + oneFilersTax2);
            } else if (income <= 137050) {
                System.out.println("Your Tax Rate is: $" + oneFilersTax3);
            } else if (income <= 208850) {
                System.out.println("Your Tax Rate is: $" + oneFilersTax4);
            } else if (income <= 372950) {
                System.out.println("Your Tax Rate is: $" + oneFilersTax5);
            } else {
                System.out.println("Your Tax Rate is: $" + oneFilersTax6);
            }

        } else if (filingStatus == 2) {
            if (income <= 8350) {
                System.out.println("Your Tax Rate is: $" + twoFilersTax1);
            } else if (income <= 33950) {
                System.out.println("Your Tax Rate is: $" + twoFilersTax2);
            } else if (income <= 68525) {
                System.out.println("Your Tax Rate is: $" + twoFilersTax3);
            } else if (income <= 104425) {
                System.out.println("Your Tax Rate is: $" + twoFilersTax4);
            } else if (income <= 186475) {
                System.out.println("Your Tax Rate is: $" + twoFilersTax5);
            } else {
                System.out.println("Your Tax Rate is: $" + twoFilersTax6);
            }

        } else {
            if (income <= 11950) {
                System.out.println("Your Tax Rate is: $" + threeFilersTax1);
            } else if (income <= 45500) {
                System.out.println("Your Tax Rate is: $" + threeFilersTax2);
            } else if (income <= 117450) {
                System.out.println("Your Tax Rate is: $" + threeFilersTax3);
            } else if (income <= 190200) {
                System.out.println("Your Tax Rate is: $" + threeFilersTax4);
            } else if (income <= 372950) {
                System.out.println("Your Tax Rate is: $" + threeFilersTax5);
            } else {
                System.out.println("Your Tax Rate is: $" + threeFilersTax6);
            }

        }


    }
}
