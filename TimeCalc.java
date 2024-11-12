public class TimeCalc {
    public static void main(String[] args) {
        Integer hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        Integer minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        Integer minutes_to_add = Integer.parseInt(args[1]);

        Integer total_minutes = (hours * 60) + minutes + minutes_to_add;
        Integer total_hours = total_minutes / 60;

        Integer new_hours = total_hours % 24;
        Integer new_minutes = total_minutes - (total_hours * 60);

        String new_hours_str = "" + new_hours;
        String new_minutes_str = "" + new_minutes;

        if (new_hours < 10) {
            new_hours_str = "0" + new_hours;
        }
        if (new_minutes < 10) {
            new_minutes_str = "0" + new_minutes;
        }
        System.out.println(new_hours_str + ":" + new_minutes_str);
    }
}
