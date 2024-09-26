package academy.devdojo.javaoneforall.introduction;

public class Class02PrimitiveTypes {
    public static void main(String[] args) {
        //int , double, float, boolean, char, byte, short, long

        // Um bit é um valor que pode ser 1 ou 0, um byte é uma sequência de bits que pode ter o tamanho máximo de 8 dígitos.

        // ASCII - American Standard Code for International Exchange

        //cast
        int age = (int) 10000000000L; // 4 bytes

        long bigNumber = (long) 155.25; // 8 bytes
        float salaryFloat = (float) 2500.0D;  // 4 bytes Used for decimal values
        double salaryDouble = 5000.0; // 8 bytes Used for decimal values
        boolean trueValue = true; // 1 bit
        boolean falseValue = false; // 1 bit
        short ageShort = 29; // 2 bytes
        byte ageByte = 39; // 1 byte
        char characterNumberASCII = 87; // 2 bytes
        char characterLetter = 'V'; // 2 bytes
        char characterLetterUNICODE = '\u0041'; // 2 bytes
        String name = "Goku";

        System.out.println("The age is " + age + " years old");
        System.out.println(salaryFloat);
        System.out.println(characterNumberASCII);
        System.out.println(characterLetterUNICODE);
        System.out.println(bigNumber);
        System.out.println("Hi, i am " + name);
    }
}
