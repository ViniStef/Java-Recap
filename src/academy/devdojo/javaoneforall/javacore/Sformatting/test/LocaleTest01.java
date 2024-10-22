package academy.devdojo.javaoneforall.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // ISO 639, ISO 3166
        // pt-BR, pt-PT
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSwitzerland = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeNetherlands = new Locale("nl", "NL");
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat dateFormat5 = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);
        System.out.println(dateFormat1.format(calendar.getTime()));
        System.out.println(dateFormat2.format(calendar.getTime()));
        System.out.println(dateFormat3.format(calendar.getTime()));
        System.out.println(dateFormat4.format(calendar.getTime()));
        System.out.println(dateFormat5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeJapan));
        System.out.println(localeItaly.getDisplayLanguage(localeJapan));
    }
}
