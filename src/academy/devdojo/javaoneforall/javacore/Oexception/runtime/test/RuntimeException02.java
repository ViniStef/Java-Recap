package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

public class RuntimeException02 {
    public static void main(String[] args) {
        System.out.println(division(1, 0));
        System.out.println("Finished the program successfully");
    }

    public static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("The second parameter can't be zero");
        }

        return a / b;
    }
}
