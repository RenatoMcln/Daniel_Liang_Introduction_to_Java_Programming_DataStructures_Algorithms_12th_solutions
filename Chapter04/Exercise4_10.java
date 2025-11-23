package Chapter04;

import java.util.Scanner;

public class Exercise4_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Define the required variables
        String set1 = " 1  3  5  7\n" +
                      " 9 11 13 15\n" +
                      "17 19 21 23\n" +
                      "25 27 29 31";

        String set2 = " 2  3  6  7\n" +
                      "10 11 14 15\n" +
                      "18 19 22 23\n" +
                      "26 27 30 31";

        String set3 = " 4  5  6  7\n" +
                     "12 13 14 15\n" +
                     "20 21 22 23\n" +
                     "28 29 30 31";

        String set4 = " 8  9 10 11\n" +
                      "12 13 14 15\n" +
                      "24 25 26 27\n" +
                      "28 29 30 31";

        String set5 = "16 17 18 19\n" +
                      "20 21 22 23\n" +
                      "24 25 26 27\n" +
                      "28 29 30 31\n";

        int age = 0;
        String answer;
        char yesOrNo;

        // 2. Prompt the user for the answers

        System.out.print("Is your birthday in Set1?\n" + set1 + "\n\nEnter N for NO and Y for YES: ");
        answer = input.next();
        yesOrNo = Character.toUpperCase(answer.charAt(0));

        // Handle exceptions and check whether this set is valid.
        if (answer.length() != 1 || yesOrNo != 'N' && yesOrNo != 'Y') {
            System.out.println("Invalid answer! Please enter N or Y.");
            System.exit(1);
        } else if (yesOrNo == 'Y') {
            age += Integer.parseInt((set1.trim()).substring(0, 1));
        }


        System.out.print("\nIs your birthday in Set2?\n" + set2 + "\n\nEnter N for NO and Y for YES: ");
        answer = input.next();
        yesOrNo = Character.toUpperCase(answer.charAt(0));

        // Handle exceptions and check whether this set is valid.
        if (answer.length() != 1 || yesOrNo != 'N' && yesOrNo != 'Y') {
            System.out.println("Invalid answer! Please enter N or Y.");
            System.exit(1);
        } else if (yesOrNo == 'Y') {
            age += Integer.parseInt((set2.trim()).substring(0, 1));
        }


        System.out.print("\nIs your birthday in Set3?\n" + set3 + "\n\nEnter N for NO and Y for YES: ");
        answer = input.next();
        yesOrNo = Character.toUpperCase(answer.charAt(0));

        // Handle exceptions and check whether this set is valid.
        if (answer.length() != 1 || yesOrNo != 'N' && yesOrNo != 'Y') {
            System.out.println("Invalid answer! Please enter N or Y.");
            System.exit(1);
        } else if (yesOrNo == 'Y') {
            age += Integer.parseInt((set3.trim()).substring(0, 1));
        }


        System.out.print("\nIs your birthday in Set4?\n" + set4 + "\n\nEnter N for NO and Y for YES: ");
        answer = input.next();
        yesOrNo = Character.toUpperCase(answer.charAt(0));

        // Handle exceptions and check whether this set is valid.
        if (answer.length() != 1 || yesOrNo != 'N' && yesOrNo != 'Y') {
            System.out.println("Invalid answer! Please enter N or Y.");
            System.exit(1);
        } else if (yesOrNo == 'Y') {
            age += Integer.parseInt((set4.trim()).substring(0, 1));
        }


        System.out.print("\nIs your birthday in Set5?\n" + set5 + "\n\nEnter N for NO and Y for YES: ");
        answer = input.next();
        yesOrNo = Character.toUpperCase(answer.charAt(0));

        // Handle exceptions and check whether this set is valid.
        if (answer.length() != 1 || yesOrNo != 'N' && yesOrNo != 'Y') {
            System.out.println("Invalid answer! Please enter N or Y.");
            System.exit(1);
        } else if (yesOrNo == 'Y') {
            age += Integer.parseInt(set5.substring(0, 2));
        }

        // 3. Display the result to the user
        System.out.println("Your birthday is " + age + "!");


    }

}

