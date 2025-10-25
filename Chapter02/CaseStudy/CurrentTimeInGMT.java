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

        //Printing the current time as 05:09:08 instead of 5:9:8 (5 hours, 9 minutes and 8 seconds).
        //Hours
        if (currentHour < 10) {
            System.out.println("The current time is: 0" + currentHour + ":" + currentMinutes + ":" + currentSeconds);
        }
        else {
            System.out.println("The current time is: " + currentHour + ":" + currentMinutes + ":" + currentSeconds);
        }
        //Minutes
        if (currentMinutes < 10) {
            System.out.println("The current time is: " + currentHour + ":0" + currentMinutes + ":" + currentSeconds);
        }
        else {
            System.out.println("The current time is: " + currentHour + ":" + currentMinutes + ":" + currentSeconds);
        }
        //Seconds
        if (currentSeconds < 10) {
            System.out.println("The current time is: " + currentHour + ":" + currentMinutes + ":0" + currentSeconds);
        }
        else {
            System.out.println("The current time is: " + currentHour + ":" + currentMinutes + ":" + currentSeconds);
        }

    }

}
