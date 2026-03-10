public interface ShippingCalculator {
    double calculateChairShipping(String furnitureType);
    double calculateTableShipping(String furnitureType, double weightInKg);
    double calculateSofaShipping(String furnitureType, double distanceInKm, double volumeInCubicMeters);
}