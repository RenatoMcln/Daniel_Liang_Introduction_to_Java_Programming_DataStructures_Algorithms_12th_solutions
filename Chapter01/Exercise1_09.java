package Chapter1;

/* The area appears on the console with too many decimal digits.
   To fix this, it is necessary to use printf to manage the formatting, instead of println or print. */
public class Exercise1_09 {
    public static void main(String[] args) {
        System.out.println("Area is = " + (4.5 * 7.9));
        System.out.println("Perimeter is = " + (2 * (4.5 + 7.9)));
    }
}
