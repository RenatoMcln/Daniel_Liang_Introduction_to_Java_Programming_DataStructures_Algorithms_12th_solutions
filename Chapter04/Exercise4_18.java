package Chapter04;

import java.util.Scanner;

public class Exercise4_18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter two characters: ");
        String s = input.next();
        char major = s.charAt(0);
        char status = s.charAt(1);

        // Handle exceptions
        if (s.length() != 2) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        // Define corresponding names
        String majorName = "";

        switch (major) {
            case 'M': majorName = "Mathematics"; break;
            case 'C': majorName = "Computer Science"; break;
            case 'I': majorName = "Information Technology"; break;
            default: // Handle exceptions
                System.out.println("Invalid input");
                System.exit(1);
                break;
        }

        String statusName = "";
        switch (status) {
            case '1': statusName = "Freshman"; break;
            case '2': statusName = "Sophomore"; break;
            case '3': statusName = "Junior"; break;
            case '4': statusName = "Senior"; break;
            default: // Handle exceptions
                System.out.println("Invalid input");
                System.exit(1);
                break;
        }


        // Display the result to the user
        System.out.printf("%s %s", majorName, statusName);
        
    }
}

