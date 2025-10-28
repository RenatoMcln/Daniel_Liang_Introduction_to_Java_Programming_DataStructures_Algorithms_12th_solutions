package Chapter02;

import java.util.Scanner;

public class Exercise2_11 {
    //Population projection
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for the input
        System.out.print("Enter the number of years to calculate the future population: ");
        int years = input.nextInt();

        //Defining the required values and variables
        int currentPopulation = 312_032_486;
        final int DAYS_IN_A_YEAR = 365;
        final int SECONDS_IN_A_DAY = 86_400;
        final int SECONDS_IN_A_YEAR = SECONDS_IN_A_DAY * DAYS_IN_A_YEAR;

        //Daily change of population
        double births = SECONDS_IN_A_YEAR / 7.0;
        double deaths = SECONDS_IN_A_YEAR / 13.0;
        double newImmigrants = SECONDS_IN_A_YEAR / 45.0;

        //calculating the future population
        int futurePopulation = (int) ((births - deaths + newImmigrants) * years + currentPopulation);

        //Display the result to the user
        System.out.println("The current population is: " + currentPopulation);
        System.out.println("The population in " + years + " years is " + futurePopulation);

    }

}
