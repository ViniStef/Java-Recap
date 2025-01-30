package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest02 {
    private String name = "Midoriya";

    void print(final String param) {
        String lastName = "Izuku"; // this variable is effectively final (no changes anywhere),
        // all variables inside this context must be final, also goes for parameters

        class LocalClass {
            public void printName() {
                System.out.println(name + " " + lastName+param);
            }
        }
        new LocalClass().printName();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("");
    }
}
