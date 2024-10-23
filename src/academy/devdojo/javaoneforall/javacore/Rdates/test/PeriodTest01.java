package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(9);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58); // Returns the amount in days
        Period p4 = Period.ofMonths(6);
        Period p5 = Period.ofYears(3);
        System.out.println("Period between now and now after two years " + p1);
        System.out.println("Period of Days " + p2);
        System.out.println("Period of Weeks " + p3);
        System.out.println("Period of Months " + p4);
        System.out.println("Period of Years " + p5);
        System.out.println(Period.between(now, now.plusDays(p3.getDays())));
    }
}
