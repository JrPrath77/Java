import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your taxable income: $");
        double taxableIncome = sc.nextDouble();

        double tax = calculateIncomeTax(taxableIncome);

        System.out.println("Your income tax is: $" + tax);

    }

    public static double calculateIncomeTax(double income) {
        double tax = 0;

        if (income <= 20000) {
            tax = 0.1 * income;
        } else if (income <= 40000) {
            tax = 0.1 * 20000 + 0.2 * (income - 20000);
        } else if (income <= 60000) {
            tax = 0.1 * 20000 + 0.2 * 20000 + 0.3 * (income - 40000);
        } else {
            // Assuming a 30% tax rate for income beyond $60,000
            tax = 0.1 * 20000 + 0.2 * 20000 + 0.3 * 20000 + 0.3 * (income - 60000);
        }

        return tax;
    }
}
