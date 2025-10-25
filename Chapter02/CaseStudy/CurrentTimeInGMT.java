package Chapter2.CaseStudy

public class CurrentTimeInGMT {

    public static void main(String[] args) {
/* My version solves the formatting problem, displaying the time in the format (00:00:00), using only logic and no functions.
 At that time, I hadn’t learned about functions and methods yet. */
 
        public static void main(String[] args) {

            // 1. Defining the variables for the total time.
            long milli = System.currentTimeMillis();
            long seconds = milli / 1000;
            long minutes = seconds / 60;
            long hours = minutes / 60;

            // 2. Getting the current time
            long currentHour = hours % 24;
            long currentMinutes = minutes % 60;
            long currentSeconds = seconds % 60;

            // 3. Checking if we need leading zeros
            boolean C1 = currentHour < 10;
            boolean C2 = currentMinutes < 10;
            boolean C3 = currentSeconds < 10;

            //Printing the current time
            if (C1 && C2 && C3) {
                System.out.println("The current time is: 0" + currentHour + ":0" + currentMinutes + ":0" + currentSeconds);
            } else if (C1 && C2) {
                System.out.println("The current time is: 0" + currentHour + ":0" + currentMinutes + ":" + currentSeconds);
            } else if (C2 && C3) {
                System.out.println("The current time is: " + currentHour + ":0" + currentMinutes + ":0" + currentSeconds);
            } else if (C1 && C3) {
                System.out.println("The current time is: 0" + currentHour + ":" + currentMinutes + ":0" + currentSeconds);
            } else if (C2) {
                System.out.println("The current time is: " + currentHour + ":0" + currentMinutes + ":" + currentSeconds);
            } else if (C1) {
                System.out.println("The current time is: 0" + currentHour + ":" + currentMinutes + ":" + currentSeconds);
            } else if (C3) {
                System.out.println("The current time is: " + currentHour + ":" + currentMinutes + ":0" + currentSeconds);
            } else {
                System.out.println("The current time is: " + currentHour + ":" + currentMinutes + ":" + currentSeconds);
            }

        }

    }

}