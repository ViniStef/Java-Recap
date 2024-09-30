package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {
        // Reference variables are variables that have methods and properties attached to them,
        // like an array has the .length property

        // Default values
        // byte, short, double, float, long, int = 0
        // char = '\u0000' '' (blank space)
        // boolean = false
        // String, Objects = null
        String[] names = new String[3];
        names[0] = "Goku";
        names[1] = "Hinata";
        names[2] = "Luffy";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
