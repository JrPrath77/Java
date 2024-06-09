package paymentProcessing;

public class CreditCard {
    private String cardNumber;
    private String expirationDate;
    private String cardholderName;
    private int cvv;

    public CreditCard(String cardNumber, String expirationDate, String cardholderName, int cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cardholderName = cardholderName;
        this.cvv = cvv;
    }

    public boolean validateCardNumber(String cardNumber) {
        // Check if card number is not null and has 16 digits
        if (cardNumber == null || cardNumber.length() != 16) {
            return false;
        }
    
        // Convert card number to array of digits
        char[] digits = cardNumber.toCharArray();
    
        // Use Luhn algorithm to validate the credit card number
        int sum = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(digits[i]);
            if ((digits.length - i) % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
        }
        return sum % 10 == 0;
    }
    

    public boolean authorizePayment(double amount) {
        // Basic authorization: if the amount is less than 1000, authorize the payment
        return amount <= 1000;
    }

    public boolean processRefund(double amount) {
        // Basic refund processing: if the amount is positive, process the refund
        return amount > 0;
    }
}
