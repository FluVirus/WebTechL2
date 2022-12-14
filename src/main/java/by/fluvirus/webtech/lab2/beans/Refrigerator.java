package by.fluvirus.webtech.lab2.beans;

import by.fluvirus.webtech.lab2.beans.criteria.SearchCriteria;

/**
 * Represents a refrigerator
 */
public class Refrigerator extends Appliance{
	public int powerConsumption;
    public double weight;
    public int freezerCapacity;
    public int overallCapacity;
    public double height;
    public double width;

    @Override
    public String toString() {
        return String.format("Refrigerator: POWER_CONSUMPTION=%d, WEIGHT=%.1f, FREEZER_CAPACITY=%d, OVERALL_CAPACITY=%d, HEIGHT=%.1f, WIDTH=%.1f",
                powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean satisfies(String key, Object value) {
        return switch (SearchCriteria.Refrigerator.valueOf(key)) {
            case POWER_CONSUMPTION -> powerConsumption <= (Integer) value;
            case WEIGHT -> weight <= Double.parseDouble(String.valueOf(value));
            case FREEZER_CAPACITY -> freezerCapacity <= (Integer) value;
            case OVERALL_CAPACITY -> overallCapacity <= (Integer) value;
            case HEIGHT -> height <= Double.parseDouble(String.valueOf(value));
            case WIDTH -> width <= Double.parseDouble(String.valueOf(value));
        };
    }
}
