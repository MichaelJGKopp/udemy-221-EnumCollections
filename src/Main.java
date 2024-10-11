import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Main {

  enum WeekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

  public static void main(String[] args) {

    List<WeekDay> annsWorkDays = new ArrayList<>(List.of(WeekDay.MONDAY, WeekDay.TUESDAY,
      WeekDay.WEDNESDAY, WeekDay.THURSDAY, WeekDay.FRIDAY));

    // creational method, general term for factory method, constructor or method that returns a new instance
    // EnumSet is an abstract class!
    // fast using bit vectors and naturally ordered
    var annsDaySet = EnumSet.copyOf(annsWorkDays);
    System.out.println(annsDaySet.getClass().getSimpleName());
    annsDaySet.forEach(System.out::println);
    System.out.println("---------------------------------------------");

    var allDaySet = EnumSet.allOf(WeekDay.class);
    allDaySet.forEach(e -> System.out.println(e.ordinal() + ": " + e));
    System.out.println("---------------------------------------------");



  }
}
