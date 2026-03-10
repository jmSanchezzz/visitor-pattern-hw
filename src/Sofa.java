public class Sofa implements Furniture {
    private String type = "Sofa";
    private double distanceInKm;
    private double volumeInCubicMeters;

    public Sofa(double distanceInKm, double volumeInCubicMeters) {
        this.distanceInKm = distanceInKm;
        this.volumeInCubicMeters = volumeInCubicMeters;
    }

    @Override
    public double accept(ShippingCalculator calculator) {
        return calculator.calculateSofaShipping(this.type, this.distanceInKm, this.volumeInCubicMeters);
    }
}