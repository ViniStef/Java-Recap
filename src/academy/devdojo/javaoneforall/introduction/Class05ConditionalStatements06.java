package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements06 {
    // Using switch, print if the day is business day or weekend
    // Giving the numbers 1 to 7, 1 being Sunday
    public static void main(String[] args) {
        byte day = 4;
        String typeOfDay;
//        String typeOfDay = switch (day) {
//            case 1, 7 -> "Weekend";
//            case 2, 3, 4, 5, 6 -> "Business Day";
//            default -> "Invalid";
//        };
        switch(day) {
            case 1, 7:
                typeOfDay = "Weekend";
                break;
            case 2, 3, 4, 5, 6:
                typeOfDay = "Business Day";
                break;

            default:
                typeOfDay = "Invalid";
                break;
        }

        System.out.println("It is a " + typeOfDay);
    }
}
