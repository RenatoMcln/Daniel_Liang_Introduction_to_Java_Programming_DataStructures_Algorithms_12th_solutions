package Chapter1;

/* Use 1.0 instead of 1;
   Given n = any number;
   In a division, at least one number must have a fractional part — it can be written as n.0 or n.n.
   If we use just n (an integer), the JVM will ignore the fractional part of the result. */
public class Exercise1_07 {
    public static void main(String[] args) {
        System.out.println( 4 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) );
        System.out.println( 4 * ( 1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13) ) );
    }
}
