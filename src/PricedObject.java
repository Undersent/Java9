public interface PricedObject {

    double getPrice();

    default double getPriceWithTax() {
        return getTaxedPriceInternal();
    }

    default double getOfferPrice(double discount) {
        return getTaxedPriceInternal() * discount;
    }

    private double getTaxedPriceInternal() {
        return getPrice() * getTax();
    }

    private static double getTax() {
        return 1.21;
    }

    //shared logic had to be etracted into new method, now we have private interface methods :)
}
