package Chapter02;

import java.util.Scanner;

public class Exercise2_08 {
    //Current time zone
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Prompt the user for the input
        System.out.print("Enter the time zone offset to GMT: ");
        int timeZone = input.nextInt() * 60 * 60 * 1000;

        // 2. Defining the variables for the total time.
        long milli = System.currentTimeMillis() + timeZone;
        long seconds = milli / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;

        // 3. Getting the current time
        long currentHour = hours % 24;
        long currentMinutes = minutes % 60;
        long currentSeconds = seconds % 60;

        // 4. Checking if we need leading zeros
        boolean C1 = currentHour < 10;
        boolean C2 = currentMinutes < 10;
        boolean C3 = currentSeconds < 10;

        // 5. Printing the current time
        if (C1 && C2 && C3) {
            System.out.println("The current time is: 0" + currentHour + ":0" + currentMinutes + ":0" + currentSeconds);
        } else if (C1 && C2) {
            System.out.println("The current time is: 0" + currentHour + ":0" + currentMinutes + ":" + currentSeconds);
        } else if (C2 && C3) {
            System.out.println("The current time is: " + currentHour + ":0" + currentMinutes + ":0" + currentSeconds);
        } else if (C1 && C3) {
            System.out.println("The current time is: 0" + currentHour + ":" + currentMinutes + ":0" + currentSeconds);
        } else if (C2) {
            System.out.println("The current time is: " + currentHour + ":0" + currentMinutes + ":" + currentSeconds);
        } else if (C1) {
            System.out.println("The current time is: 0" + currentHour + ":" + currentMinutes + ":" + currentSeconds);
        } else if (C3) {
            System.out.println("The current time is: " + currentHour + ":" + currentMinutes + ":0" + currentSeconds);
        } else {
            System.out.println("The current time is: " + currentHour + ":" + currentMinutes + ":" + currentSeconds);
        }
    }
}
