package Chapter04;

public class Exercise4_06 {

    public static void main(String[] args) {

        // Define the required variables
        double randomAngle1 = Math.toRadians((int) (Math.random() * 361));
        double randomAngle2 = Math.toRadians((int) (Math.random() * 361));
        double randomAngle3 = Math.toRadians((int) (Math.random() * 361));
        final byte radius = 40;

        // Define coordinates of the three points
        double x1 = radius * Math.cos(randomAngle1);
        double y1 = radius * Math.sin(randomAngle1);

        double x2 = radius * Math.cos(randomAngle2);
        double y2 = radius * Math.sin(randomAngle2);

        double x3 = radius * Math.cos(randomAngle3);
        double y3 = radius * Math.sin(randomAngle3);

        // Calculate sides
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double c = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

        // Calculate angles
        double angleA = Math.toDegrees(Math.acos((b * b - c * c - a * a) / (-2 * c * a)));
        double angleB = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * b * a)));
        double angleC = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));

        // Display the three angles
        System.out.printf("The three angles are: A = %.2f, B = %.2f, and C = %.2f .", angleA, angleB, angleC);

    }
}

