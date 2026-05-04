public class PriceCalculator {

    public double calc(double[] prices, int[] qty, String code, String type) {

        double subtotal = 0;

        for (int i = 0; i < prices.length; i++) {
            subtotal += prices[i] * qty[i];
        }

        double discount = 0;

        if (code.equals("SAVE10")) discount = subtotal * 0.10;
        if (code.equals("SAVE20")) discount = subtotal * 0.20;

        if (type.equals("VIP")) discount += subtotal * 0.05;

        double afterDiscount = subtotal - discount;

        double tax = afterDiscount * 0.19;

        return afterDiscount + tax;
    }
}