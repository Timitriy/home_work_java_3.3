public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit1 = service.calculate(1000000,9.99,12);
        double credit2 = service.calculate(1000000,9.99,24);
        double credit3 = service.calculate(1000000,9.99,36);
        System.out.println("Ежемесячный платеж" + " " + credit1 + " " + "руб.");
        System.out.println("Ежемесячный платеж" + " " + credit2 + " " + "руб.");
        System.out.println("Ежемесячный платеж" + " " + credit3 + " " + "руб.");
    }
}
