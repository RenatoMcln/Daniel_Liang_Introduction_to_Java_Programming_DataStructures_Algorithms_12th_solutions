package Chapter02;

public class Exercise2_18 {

    //Print a table
    public static void main(String[] args) {

        //Define the variables
        int a = 0;
        int b = 1;

        //Display the result to the user
        System.out.println("a   b   pow(a, b)");
        System.out.println(++a + "   " + ++b + "   " + (int) Math.pow(a, b));
        System.out.println(++a + "   " + ++b + "   " + (int) Math.pow(a, b));
        System.out.println(++a + "   " + ++b + "   " + (int) Math.pow(a, b));
        System.out.println(++a + "   " + ++b + "   " + (int) Math.pow(a, b));
        System.out.println(++a + "   " + ++b + "   " + (int) Math.pow(a, b));

    }
}
