package Chapter02;

import java.util.Scanner;

public class Exercise2_21 {
    //Financial application: calculate future investment value
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user the instructions
        System.out.println("Compute the future investment value entering the following values:\n");

        //Reads in the inputs
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        short numberOfYears = input.nextShort();

        //Calculate the required variables
        double monthlyInterestRate = annualInterestRate / 1200;
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        double futureInvestmentValueRounded = (long) (futureInvestmentValue * 100) / 100.0;

        //Display the result to the user
        System.out.println("Future value is $" + futureInvestmentValueRounded);

    }

}
