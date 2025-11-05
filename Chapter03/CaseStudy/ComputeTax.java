package Chapter03.CaseStudy;

import java.util.Scanner;

public class ComputeTax {

    public static void main(String[] args) {

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

            double tax = 0;

            //Defining the Tax Rates for each filing status
            if (filingStatus < 0 || filingStatus > 3) {
                System.out.println("Wrong choice. Please enter 0, 1, 2, or 3.");

            } else if (income < 0) {
                System.out.println("Positive values only!");

            } else if (filingStatus == 0) {

                if (income <= 8350) {
                    tax = income * 0.10;

                } else if (income <= 33950) {
                    tax = (income - 8350) * 0.15 + (8350 * 0.10);

                } else if (income <= 82250) {
                    tax = (income - 33950) * 0.25 + (33950 - 8350) * 0.15 + (8350 * 0.10);

                } else if (income <= 171550) {
                    tax = (income - 82250) * 0.28 + (82250 - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.10;

                } else if (income <= 372950) {
                    tax = (income - 171550) * 0.33 + (171550 - 82250) * 0.28 + (82250 - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.10;

                } else {
                    tax = (income - 372950) * 0.35 + (372950 - 171550) * 0.33 + (171550 - 82250) * 0.28 + (82250 - 33950) * 0.25 + (33950 - 8350) * 0.15 + 8350 * 0.10;
                }

            } else if (filingStatus == 1) {

                if (income <= 16700) {
                    tax = income * 0.10;

                } else if (income <= 67900) {
                    tax = (income - 16700) * 0.15 + (16700 * 0.10);

                } else if (income <= 137050) {
                    tax = (income - 67900) * 0.25 + (67900 - 16700) * 0.15 + (16700 * 0.10);

                } else if (income <= 208850) {
                    tax = (income - 137050) * 0.28 + (137050 - 67900) * 0.25 + (67900 - 16700) * 0.15 + (16700 * 0.10);

                } else if (income <= 372950) {
                    tax = (income - 208850) * 0.33 + (208850 - 137050) * 0.28 + (137050 - 67900) * 0.25 + (67900 - 16700) * 0.15 + (16700 * 0.10);

                } else {
                    tax = (income - 372950) * 0.35 + (372950 - 208850) * 0.33 + (208850 - 137050) * 0.28 + (137050 - 67900) * 0.25 + (67900 - 16700) * 0.15 + (16700 * 0.10);
                }

            } else if (filingStatus == 2) {

                if (income <= 8350) {
                    tax = income * 0.10;

                } else if (income <= 33950) {
                    tax = (income - 8350) * 0.15 + (8350 * 0.10);

                } else if (income <= 68525) {
                    tax = (income - 33950) * 0.25 + (33950 - 8350) * 0.15 + (8350 * 0.10);

                } else if (income <= 104425) {
                    tax = (income - 68525) * 0.28 + (68525 - 33950) * 0.25 + (33950 - 8350) * 0.15 + (8350 * 0.10);

                } else if (income <= 186475) {
                    tax = (income - 104425) * 0.33 + (104425 - 68525) * 0.28 + (68525 - 33950) * 0.25 + (33950 - 8350) * 0.15 + (8350 * 0.10);

                } else {
                    tax = (income - 186475) * 0.35 + (186475 - 104425) * 0.33 + (104425 - 68525) * 0.28 + (68525 - 33950) * 0.25 + (33950 - 8350) * 0.15 + (8350 * 0.10);
                }

            } else {

                if (income <= 11950) {
                    tax = income * 0.10;

                } else if (income <= 45500) {
                    tax = (income - 11950) * 0.15 + (11950 * 0.10);

                } else if (income <= 117450) {
                    tax = (income - 45500) * 0.25 + (45500 - 11950) * 0.15 + (11950 * 0.10);

                } else if (income <= 190200) {
                    tax = (income - 117450) * 0.28 + (117450 - 45500) * 0.25 + (45500 - 11950) * 0.15 + (11950 * 0.10);

                } else if (income <= 372950) {
                    tax = (income - 190200) * 0.33 + (190200 - 117450) * 0.28 + (117450 - 45500) * 0.25 + (45500 - 11950) * 0.15 + (11950 * 0.10);

                } else {
                    tax = (income - 372950) * 0.35 + (372950 - 190200) * 0.33 + (190200 - 117450) * 0.28 + (117450 - 45500) * 0.25 + (45500 - 11950) * 0.15 + (11950 * 0.10);
                }

            }

            //Display the result to the user
            if (filingStatus == 0 || filingStatus == 1 || filingStatus == 2 || filingStatus == 3) {
                System.out.println("Your Tax Rate is: $" + tax);
            }
        }
    }