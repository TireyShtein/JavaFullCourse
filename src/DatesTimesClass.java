import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DatesTimesClass {

    public static void main(String[] args) {

        // DATES & TIMES in Java
        // (LocalDate, LocalTime, LocalDateTime, UTC Timestamps)

        LocalDate date = LocalDate.now(); // Current Date
        LocalTime time = LocalTime.now(); // Current Time
        LocalDateTime dateTime = LocalDateTime.now(); // Current Date + Time

        Instant instant = Instant.now(); // UTC Date + Time


        // Custom format for date time
        LocalDateTime dateTime1 = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // day-month-year
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // day-month-year  hours:minutes:seconds

        String newDateTime = dateTime1.format(dateTimeFormatter1);
        System.out.println(newDateTime);


        // Write date
        LocalDate date1 = LocalDate.of(2024, 6, 25);
        LocalTime time1 = LocalTime.of(14, 33);
        LocalDateTime localDateTime1 = LocalDateTime.of(date1, time1);
        LocalDateTime localDateTime2 = LocalDateTime.of(2024, 6, 11, 15, 29, 44);
        System.out.println(date1 + " " + time1);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);

        if (localDateTime1.isBefore(localDateTime2))
            System.out.println(localDateTime1 + " is before " + localDateTime2);
        else
            System.out.println(localDateTime2 + " is before " + localDateTime1);
    }
}
