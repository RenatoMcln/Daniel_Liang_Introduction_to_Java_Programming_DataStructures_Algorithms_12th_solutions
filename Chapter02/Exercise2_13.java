package Chapter02;

import java.util.Scanner;

public class Exercise2_13 {
    //Financial application: compound value
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for the first input
        System.out.print("To calculate the account value with an interest rate of 5%\nEnter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();

        //Defining the required variables and values
        double annualRate = 0.05;
        double monthlyRate = (int) ((annualRate / 12) * 100000 + 0.5) / 100000.0;

        double firstMonthValue = monthlySaving * (1 + monthlyRate);
        double secondMonthValue = (monthlySaving + firstMonthValue) * (1 + monthlyRate);
        double thirdMonthValue = (monthlySaving + secondMonthValue) * (1 + monthlyRate);
        double fourMonthValue = (monthlySaving + thirdMonthValue) * (1 + monthlyRate);
        double fiveMonthValue = (monthlySaving + fourMonthValue) * (1 + monthlyRate);
        double sixMonthValue = (int) (((monthlySaving + fiveMonthValue) * (1 + monthlyRate)) * 100 + 0.5) / 100.0;

        //Display the result to the user
        System.out.println("After the sixth month, the account value is $" + sixMonthValue);

    }
}

