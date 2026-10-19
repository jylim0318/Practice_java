package lecture.section03.example;

public class Application {

    public static void main(String[] args) {

        // 결제수단
        BanTransferPaymentProcess bank = new BanTransferPaymentProcess();
        CreditCardPaymentProcess credit = new CreditCardPaymentProcess();


//        OrderService orderService = new OrderService(credit);
//        orderService.checkout(50000);
    }
}
