package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements04 {
    // Given a car's total price, for example 20000, I want to find how much and for how long I'll have to pay monthly.
    // Condition: The monthly payment cannot be lower than 1000.
    public static void main(String[] args) {
        double totalCarPrice = 20000;
        double minimumMonthlyPayment = 1000;
        for (int i = 1; i < totalCarPrice; i++) {
            double monthlyPayment = totalCarPrice / i;
            if (monthlyPayment < minimumMonthlyPayment) {
                continue;
                //break;
            }
            System.out.println("Monthly payment of " + monthlyPayment + " During " + i + " Months.");
        }

    }
}
