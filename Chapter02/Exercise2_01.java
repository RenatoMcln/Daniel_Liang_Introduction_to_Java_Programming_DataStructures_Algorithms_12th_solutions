package Chapter02;

import java.util.Scanner;

//Solution
public class Exercise2_01 {
    //Convert Celsius to Fahrenheit
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt for the input
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        //Convert Celsius to Fahrenheit;
        double fahrenheit = celsius * (9.0 / 5.0)  + 32;

        //Display the degrees in fahrenheit
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");

    }
}
