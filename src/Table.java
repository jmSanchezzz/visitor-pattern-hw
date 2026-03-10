public class Table implements Furniture {
    private String type = "Table";
    private double weightInKg;

    public Table(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    @Override
    public double accept(ShippingCalculator calculator) {
        return calculator.calculateTableShipping(this.type, this.weightInKg);
    }
}