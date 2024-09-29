package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements04 {
    public static void main(String[] args) {
        // Calculate how much to pay in taxes in netherlands 2020 based on the annual salary.

        double annualSalary = 70000;
        double firstTaxPercentageBracket = 9.7 / 100;
        double secondTaxPercentageBracket = 37.35 / 100;
        double thirdTaxPercentageBracket = 49.50 / 100;
        double amountToBePaid;

        if (annualSalary > 0 && annualSalary <= 34712) {
            amountToBePaid = annualSalary * (firstTaxPercentageBracket);
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            amountToBePaid = annualSalary * (secondTaxPercentageBracket);
        } else {
            amountToBePaid = annualSalary * (thirdTaxPercentageBracket);
        }
        System.out.println("Amount to be paid in Euro is " + amountToBePaid);
    }
}
