package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements03 {
    public static void main(String[] args) {
        // Given a total number, for example 50, print the first 25.
        int totalNumber = 50;
        int limitOfWantedNumbers = 25;
        for (int i = 0; i <= totalNumber; i++) {
            if (i > limitOfWantedNumbers) {
                break;
            }
            System.out.println(i);
        }
    }
}
