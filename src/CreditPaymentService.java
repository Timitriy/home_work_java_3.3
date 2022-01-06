public class CreditPaymentService {
    public double calculate(double amountOfCredit,double interestRate,double months) {
        double coefficientRate = (interestRate / 12 / 100);
        double creditRateMoth = Math.pow (1 + coefficientRate,months);
        double ratio = coefficientRate * creditRateMoth / (creditRateMoth - 1);
        double creditPayment = (amountOfCredit * ratio);
        return creditPayment;
    }
}
