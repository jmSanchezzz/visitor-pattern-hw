public class Chair implements Furniture {
    private String type = "Chair";

    public Chair() {
    }

    @Override
    public double accept(ShippingCalculator calculator) {
        return calculator.calculateChairShipping(this.type);
    }
}