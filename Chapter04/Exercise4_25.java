package Chapter04;

public class Exercise4_25 {

    public static void main(String[] args) {

        // Generate random letters
        char l1 = (char) ('A' + (Math.random() * ('Z' + 1 - 'A')));
        char l2 = (char) ('A' + (Math.random() * ('Z' + 1 - 'A')));
        char l3 = (char) ('A' + (Math.random() * ('Z' + 1 - 'A')));

        // Generate random number
        int number = (int) (Math.random() * 10000);

        // Display the vehicle plate to the user
        System.out.printf("The vehicle plate is %c%c%c-%04d", l1, l2, l3, number);

    }
}
