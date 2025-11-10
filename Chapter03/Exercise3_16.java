package Chapter03;

public class Exercise3_16 {

    public static void main(String[] args) {

        // Random values to width <= 100 and height <= 200
        int x = (int) (Math.random() * 101);
        int y = (int) (Math.random() * 201);

        // Display the coordinates to the user
        System.out.print("Random coordinate inside a rectangle\nwith width 100 and height 200: ");
        System.out.println("(" + x + ", " + y + ")");


    }
}
