import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

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
    System.out.println("annsDaySet");
    annsDaySet.forEach(System.out::println);
    System.out.println("---------------------------------------------");

    var allDaysSet = EnumSet.allOf(WeekDay.class);
    System.out.println("EnumSet.allOf(WeekDay.class)");
    allDaysSet.forEach(e -> System.out.println(e.ordinal() + ": " + e));
    System.out.println("---------------------------------------------");

    Set<WeekDay> newPersonDays = EnumSet.complementOf(annsDaySet);
    System.out.println("EnumSet.complementOf(annsDaySet)");
    newPersonDays.forEach(e -> System.out.println(e.ordinal() + ": " + e));
    System.out.println("---------------------------------------------");

    Set<WeekDay> anotherWay = EnumSet.copyOf(allDaysSet);
    anotherWay.removeAll(annsDaySet);
    System.out.println("Another way");
    anotherWay.forEach(e -> System.out.println(e.ordinal() + ": " + e));
    System.out.println("---------------------------------------------");

    Set<WeekDay> businessDays = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
    businessDays.forEach(e -> System.out.println(e.ordinal() + ": " + e));


  }
}
