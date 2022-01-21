import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Stream2 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);

        LocalDate ld=LocalDate.now();
        System.out.println(LocalDate.of(2016,02,29).minusDays(25).isLeapYear());
        System.out.println(ld.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        System.out.println(ld.getYear());
        System.out.println(ld.getDayOfYear());
        OffsetTime offset = OffsetTime.now();
        int s = offset.getSecond();
        System.out.println(s+ " second");

        System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Kolkata")).format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));//:);)

        System.out.println(Period.between(LocalDate.of(2000,1,8),LocalDate.now()));

        System.out.println(Duration.between(LocalDateTime.of(2001,8,20,0,0),LocalDateTime.now()).toDays());
        System.out.println(LocalTime.now().minusHours(9).minusMinutes(30));

//        Arrays.stream(TimeZone.getAvailableIDs()).forEach(x-> System.out.println(x));

//        Duration d1 = Duration.between(LocalTime.NOON,LocalTime.MAX);
//        System.out.println(d1.getSeconds());
//        Duration d2 = d1.plus(d1);
//        System.out.println(d2.getSeconds());
    }
}
