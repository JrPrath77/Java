package paymentProcessing;

public class PaymentGateway {
    public void processPayment(double amount, double totalCost) {
        // Implementation of payment processing logic
        if (amount == totalCost) {
            System.out.println("Paid Successfully");
        }
        else{

            System.out.println("Enter valid amount");
        }
    }

    public void handlePaymentResponse(boolean isSuccess) {
        // Implementation to handle payment response
        if (isSuccess) {
            System.out.println("Payment Received");
        }
    }
}
