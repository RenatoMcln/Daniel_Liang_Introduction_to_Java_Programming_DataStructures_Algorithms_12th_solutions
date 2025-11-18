
package Chapter03;

import java.util.Scanner;

public class Exercise3_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the first input
        System.out.print("0 - Sunday, 1 - Monday, 2 - Tuesday, 3 - Wednesday, 4 - Thursday, " +
                "5 - Friday, 6 - Saturday." + "\nEnter today’s day: ");
        byte todayNumber = input.nextByte();

        // Initializing the string "today" to use it
        String today = "";
        String futureDay;

        // Defining the strings corresponding to the numbers
        if (todayNumber > 6 || todayNumber < 0) {
            System.out.println("Invalid input!");
            System.exit(1);
        } else if (todayNumber == 0) {
             today = "Sunday";
        } else if (todayNumber == 1) {
             today = "Monday";
        } else if (todayNumber == 2) {
             today = "Tuesday";
        } else if (todayNumber == 3) {
             today = "Wednesday";
        } else if (todayNumber == 4) {
             today = "Thursday";
        } else if (todayNumber == 5) {
             today = "Friday";
        } else {
             today = "Saturday";
        }

        // Prompt the user for the second input
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();

        // Defining the future day
        int futureDayNumber = (elapsedDays + todayNumber) % 7;

        // Defining the strings corresponding to the numbers
        if (futureDayNumber == 0) {
             futureDay = "Sunday";
        } else if (futureDayNumber == 1) {
             futureDay = "Monday";
        } else if (futureDayNumber == 2) {
             futureDay = "Tuesday";
        } else if (futureDayNumber == 3) {
             futureDay = "Wednesday";
        } else if (futureDayNumber == 4) {
             futureDay = "Thursday";
        } else if (futureDayNumber == 5) {
             futureDay = "Friday";
        } else {
             futureDay = "Saturday";
        }

        // Display the result to the user
        System.out.println("Today is " + today + " and the future day is " + futureDay);

    }
}