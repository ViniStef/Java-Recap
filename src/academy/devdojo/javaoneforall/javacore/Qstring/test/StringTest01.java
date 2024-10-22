package academy.devdojo.javaoneforall.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        // Pool of Strings and Objects live inside the 'Heap'
        String name = "Vinicius";
        String name2 = "Vinicius";
        name = name.concat(" Steflitsch");
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("Vinicius2");
        String name4 = "Vinicius2";
        System.out.println(name3.intern() == name4); // 1 creating reference variable, 2 a String object, 3 Create in the pool of Strings.
    }
}
