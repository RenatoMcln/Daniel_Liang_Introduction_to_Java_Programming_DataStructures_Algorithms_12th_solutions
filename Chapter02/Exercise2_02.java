package Chapter02;

import java.util.Scanner;

public class Exercise2_02 {
    //Compute the volume and area of a cylinder
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt for the first input
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        //Prompt for the second input
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();

        //Define the required variables and values
        final double PI = 3.14159;
        double area = radius * radius * PI;
        double volume = area * length;

        //Display the calculation
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);

    }
}
