public class Task5 {
    public static void main(String[] args) {
        final int T = 3540;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;
        int hours = T / SECONDS_PER_HOUR;
        int secondsInHours = hours * SECONDS_PER_HOUR;
        int minutes = (T - secondsInHours) / SECONDS_PER_MINUTE;
        int remainSeconds = T - minutes * SECONDS_PER_MINUTE - secondsInHours;
        String hoursBuffer = hours / 10 == 0 ? "0" : "";
        String minuterBuffer = minutes / 10 == 0 ? "0" : "";
        String remainSecondsBuffer = remainSeconds / 10 == 0 ? "0" : "";
        System.out.println(hoursBuffer + hours + "ч " + minuterBuffer + minutes + "мин " + remainSecondsBuffer + remainSeconds + "с");
    }
}
