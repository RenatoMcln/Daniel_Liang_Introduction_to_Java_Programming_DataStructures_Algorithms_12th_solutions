package Chapter02;

import java.util.Scanner;

public class Exercise2_17 {
    //Science: wind-chill temperature
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompts the user to enter a temperature and a wind speed
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double fahrenheit = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        //Calculating wind-chill temperature
        double windChillTemp =  (35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed, 0.16) +
                                0.4275 * fahrenheit * Math.pow(windSpeed, 0.16));

        double windChillTempRounded = (int) (windChillTemp * 10000) / 10000.0;

        //Display the result to the user
        System.out.println("The wind chill index is " + windChillTempRounded);

    }
}
