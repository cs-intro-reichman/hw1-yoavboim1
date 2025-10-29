// Represents the hh:mm time format using an AM/PM format.
public class TimeFormat {
    public static void main(String[] args) {
        // Parse the hours and minutes from the input string
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        // Determine AM or PM and adjust the hours for 12-hour format
        String period = "AM";
        
        if (hours >= 12) {
            period = "PM";
            if (hours > 12) {
                hours -= 12; // Convert 24-hour format to 12-hour format
            }
        } else if (hours == 0) {
            hours = 12; // Midnight (00:00) is 12 AM
        }
        
        // Format minutes with a leading zero if necessary
        String formattedMinutes = (minutes < 10) ? "0" + minutes : "" + minutes;
        
        // Print the formatted time in 12-hour AM/PM format
        System.out.println(hours + ":" + formattedMinutes + " " + period);
    }
}
