package academy.devdojo.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d - All the digits 0-9
        // \D - Everything that is not \d
        // \s - All the blank spaces \t \r \f \n
        // \S - Everything that is not \s
        // \w - All the letters a-zA-Z, 0-9, _
        // \W - Everything that is not \w
        // [] - Range
        // ? - Zero or one
        // * - Zero or more
        // + - One or more
        // {n, m} - from n to m
        // () - Group
        // | - person(a|s) persons or persona
        // $
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text:  "+text);
        System.out.println("index: 0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Positions found");
        while(matcher.find()) {
            System.out.println(matcher.start() + " " +matcher.group());
        }

    }
}
