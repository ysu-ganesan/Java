import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time.plusMinutes(20));
        LocalDate date = LocalDate.now();
        System.out.println(date.plusDays(30));
    }
} 