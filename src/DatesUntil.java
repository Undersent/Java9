import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.stream.Stream;

public class DatesUntil {

    public static void main(String... args) {
        LocalDate start = LocalDate.of(2018, 12, 1);
        Stream<LocalDate> dates = start.datesUntil(start.plusDays(7));
        dates.forEach(System.out::println);


        LocalDate birthday = LocalDate.of(1996, 7, 8);

        long leapYears = birthday
                .datesUntil(LocalDate.now(), Period.ofYears(1))
                .map(d -> Year.of(d.getYear()))
                .filter(Year::isLeap)
                .count();

        System.out.printf("%d lat przestepnych %s", leapYears, birthday);
    }
}
