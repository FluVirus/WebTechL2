package by.fluvirus.webtech.lab2.beans;

/**
 * Abstract appliance, the root of the hierarchy
 */
public abstract class Appliance {
    /**
     * Returns if appliance satisfies the given search criteria
     * @param key field to satisfy for
     * @param value value of field
     * @return if appliance satisfies the given criteria
     */
    public abstract boolean satisfies(String key, Object value);
}
