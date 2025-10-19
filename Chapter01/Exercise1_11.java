package Chapter1;
//seconds per day = 86.400
//One deaths every 13 seconds
//One births every 7 seconds
//One new immigrant every 45 seconds
//In this problem, I didn't use fractional division because it doesn't make sense to use fractional data when referring to people.
public class Exercise1_11 {
    public static void main(String[] args) {
        System.out.println("The current population is = 312,032,486");
        System.out.println("Next year's population = " + ( ( ( ((86400) / 7) - ((86400) / 13) + ((86400) / 45) ) * 365 ) + 312032486 ) );
        System.out.println("The population two years from now = " + ( ( ( ((86400) / 7) - ((86400) / 13) + ((86400) / 45) ) * 365 * 2) + 312032486 ) );
        System.out.println("The population three years from now = " + ( ( ( ((86400) / 7) - ((86400) / 13) + ((86400) / 45) ) * 365 * 3 ) + 312032486 ) );
        System.out.println("The population four years from now = " + ( ( ( ((86400) / 7) - ((86400) / 13) + ((86400) / 45) ) * 365 * 4 ) + 312032486 ) );
        System.out.println("The population five years from now = " + ( ( ( ((86400) / 7) - ((86400) / 13) + ((86400) / 45) ) * 365 * 5 ) + 312032486 ) );
    }
}
