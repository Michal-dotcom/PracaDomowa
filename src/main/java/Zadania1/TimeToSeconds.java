package Zadania1;

public class TimeToSeconds {

    public String time(int seconds) {
        String time = "";

        int hours = seconds - seconds % 3600;
        int minutes = seconds - seconds % 3600 - seconds % 60;

        return time;
    }


}
