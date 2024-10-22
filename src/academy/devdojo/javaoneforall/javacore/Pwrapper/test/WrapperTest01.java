package academy.devdojo.javaoneforall.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // autoboxing: java will convert the primitive type into the wrapper
        // unboxing: java will convert the wrapper into its primitive type
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer.parseInt("2000");
        Byte.parseByte("1");
        boolean booleanValue = Boolean.parseBoolean("TruE"); // would still work
        System.out.println(booleanValue);
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isLetterOrDigit('9'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('!'));
        System.out.println(Character.isLowerCase('9'));
        System.out.println(Character.toLowerCase('9'));
        System.out.println(Character.isAlphabetic('9'));
    }
}
