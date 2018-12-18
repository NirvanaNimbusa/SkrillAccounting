package data;

import java.util.List;

public class PaymentHelper {

    public void showProfit(String fileName, String sender) {
        FileHelper fileHelper = new FileHelper();
        List<Payment> paymentList = fileHelper.getPayments(fileName);
        double profit = 0;
        for (Payment payment : paymentList) {
            if (payment.getTransactionDetails().contains(sender)) {
                profit += payment.getPlusPln();
            }
        }
        System.out.println(profit + " from " + sender);
    }
}
