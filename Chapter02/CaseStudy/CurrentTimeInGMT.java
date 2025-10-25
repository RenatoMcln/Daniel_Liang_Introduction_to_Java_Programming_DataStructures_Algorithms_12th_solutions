package Chapter2.CaseStudy

public class CurrentTimeInGMT {


    public static void main(String[] args) {

        //Defining the variables for the total time.
        long milli = System.currentTimeMillis();
        long seconds = milli / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;

        //defining the current time
        long currentHour = hours % 24;
        long currentMinutes = minutes % 60;
        long currentSeconds = seconds % 60;

        //Printing the current time
        System.out.println("The current time is: " + currentHour + ":" + currentMinutes + ":" + currentSeconds);

    }

}
