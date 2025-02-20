package model.services;

public class PaypalService implements OnlinePaymentService {

    @Override
    public Double PaymentFee(Double amount) {
        return 0.02 * amount;
    }

    @Override
    public Double Interest(double amount, int months) {
        return 0.01 * amount * months;
    }

}
