package Chapter02;

import java.util.Scanner;
//The system can add up digits from 0 to 9999.
public class Exercise2_06 {
    //Sum the digits in an integer
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt to user for the input
        System.out.print("Enter a number between 0 and 99999" +
                ": ");
        short number = input.nextShort();

        /*Define the required variables
        (maximum number of isolated digits: 4 because 0 - 1000 or abcd)*/
        int numberD = number % 10;
        int numberC = (number / 10) % 10;
        int numberB = (number / 100) % 10;
        int numberA = (number / 1000);
        int sumOfTheDigits = numberA + numberB + numberC + numberD;

        //Display the result to the user
        System.out.println("The sum of the digits is " + sumOfTheDigits);

    }
}
