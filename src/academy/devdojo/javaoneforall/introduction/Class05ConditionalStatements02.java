package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements02 {
    public static void main(String[] args) {
        // age < 15 category junior
        // age >= 15 && age < 18 category senior
        // age >= 18 category master
        int age = 12;
        String category;
        if (age < 15) {
            category = "Category Junior";
        } else if (age >= 15 && age < 18) {
            category = "Category Senior";
        } else {
            category = "Category Master";
        }
        // Just for testing but not recommended to do it
        category = age < 15 ? "Category Junior" : age >= 15 && age < 18 ? "Category Senior" : "Category Master";
        System.out.println(category);
    }
}
