import java.util.HashMap;
import java.util.Map;

public class StandardShippingCalculator implements ShippingCalculator {

    private static final Map<String, Double> ratesMap = new HashMap<>();

    static {
        ratesMap.put("Chair", 15.00);

        ratesMap.put("Table", 2.50);

        ratesMap.put("Sofa_Distance", 1.50);
        ratesMap.put("Sofa_Volume", 20.00);
    }

    @Override
    public double calculateChairShipping(String furnitureType) {
        return ratesMap.getOrDefault(furnitureType, 0.0);
    }

    @Override
    public double calculateTableShipping(String furnitureType, double weightInKg) {
        double rate = ratesMap.getOrDefault(furnitureType, 0.0);
        return weightInKg * rate;
    }

    @Override
    public double calculateSofaShipping(String furnitureType, double distanceInKm, double volumeInCubicMeters) {
        double distanceRate = ratesMap.getOrDefault(furnitureType + "_Distance", 0.0);
        double volumeRate = ratesMap.getOrDefault(furnitureType + "_Volume", 0.0);

        return (distanceInKm * distanceRate) + (volumeInCubicMeters * volumeRate);
    }
}