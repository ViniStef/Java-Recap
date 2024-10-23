package academy.devdojo.javaoneforall.javacore.Sformatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE); // format: this object to a string. parse: this string to an object.
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("20241023", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-10-23+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-10-23", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2024-10-23T12:37:30.0209264");
        System.out.println(parse4);
        // dd/MM/yyyy, MM/dd/yyyy, yyyy/MM/dd
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("23/10/2024", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterIT = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.ITALY);
        String formatIT = LocalDate.now().format(formatterIT);
        System.out.println(formatIT);
        LocalDate parseIT = LocalDate.parse("23.ottobre.2024", formatterIT);
        System.out.println(parseIT);
    }
}
