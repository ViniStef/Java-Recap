package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
    }

    public static String openConnection() {
        try {
            System.out.println("Opening connection");
            System.out.println("Writing to the database");
            if (true) {
                throw new RuntimeException();
            }
            return "connected";
        } catch (Exception e) {
            e.printStackTrace();

        // finally is always executed, good for closing resources like in databases or a code that must be executed
        // regardless of exceptions
        } finally {
            System.out.println("Close");
        }
        return "not connected";
    }
}
