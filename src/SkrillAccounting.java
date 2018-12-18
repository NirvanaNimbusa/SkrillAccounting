import data.PaymentHelper;

public class SkrillAccounting {

    public static void main(String[] args) {

        new PaymentHelper().showProfit(
                args[0], args.length > 1 ? args[1] == null ? "" : args[1] : ""
        );
    }
}
