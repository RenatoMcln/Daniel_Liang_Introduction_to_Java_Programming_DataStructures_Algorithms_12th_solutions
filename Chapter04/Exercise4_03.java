package Chapter04;

public class Exercise4_03 {

    public static void main(String[] args) {

        // Atlanta
        double x1 = Math.toRadians(33.7489954);
        double y1 = Math.toRadians(-84.3879824);

        // Charlotte
        double x2 = Math.toRadians(35.227086);
        double y2 = Math.toRadians(-80.8431267);

        // Savannah
        double x3 = Math.toRadians(32.0835407);
        double y3 = Math.toRadians(-81.0998342);

        // Orlando
        double x4 = Math.toRadians(28.5383355);
        double y4 = Math.toRadians(-81.3792365);

        // Earth's radius
        final double radiusEarth = 6371.01;

        // Calculate the distance between the points
        double d1 = radiusEarth * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        double d2 = radiusEarth * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
        double d3 = radiusEarth * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));
        double d4 = radiusEarth * Math.acos(Math.sin(x4) * Math.sin(x1) + Math.cos(x4) * Math.cos(x1) * Math.cos(y4 - y1));
        double d5Middle = radiusEarth * Math.acos(Math.sin(x2) * Math.sin(x4) + Math.cos(x2) * Math.cos(x4) * Math.cos(y2 - y4));

        // Calculate area
        double half1 = (d1 + d4 + d5Middle) / 2;
        double half2 = (d2 + d3 + d5Middle) / 2;
        double area = Math.sqrt(half1 * (half1 - d1) * (half1 - d4) * (half1 - d5Middle)) +
                      Math.sqrt(half2 * (half2 - d2) * (half2 - d3) * (half2 - d5Middle));

        // Display the result
        System.out.println("The estimated area enclosed by these four cities is " + area);

    }
}


