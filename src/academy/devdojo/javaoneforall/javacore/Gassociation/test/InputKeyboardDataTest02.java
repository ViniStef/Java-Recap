package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import java.util.Scanner;

public class InputKeyboardDataTest02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the most advanced AI system MIA");
        System.out.println("Ask any question and I shall reply with Yes or No");
        String question = in.nextLine();
        if (question.charAt(0) == ' ') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
