package Chapter04;

public class Exercise4_16 {

    public static void main(String[] args) {

        // Generate a random uppercase letter
        char letter = (char) ('A' + (int) (Math.random() * ('Z' + 1 - 'A')));

        // Display the letter to the user
        System.out.println(letter);

    }
}