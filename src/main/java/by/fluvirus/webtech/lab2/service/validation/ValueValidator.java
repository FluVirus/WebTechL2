package by.fluvirus.webtech.lab2.service.validation;

/**
 * Represents interface of a simple value validator
 */
public interface ValueValidator {
    /**
     * Validates the value
     * @param obj value to validate
     * @return is value valid
     */
    boolean validate(Object obj);
}
