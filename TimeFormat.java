public class TimeFormat {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        String period = "AM";

        if (hours >= 12) {
            period = "PM";
            if (hours > 12) {
                hours -= 12;
            }
        } else if (hours == 0) {
            hours = 0;
            period = "AM";
        }

        String formattedMinutes = (minutes < 10) ? "0" + minutes : "" + minutes;
        System.out.println(hours + ":" + formattedMinutes + " " + period);
    }
}
