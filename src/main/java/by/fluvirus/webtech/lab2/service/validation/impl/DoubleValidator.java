package by.fluvirus.webtech.lab2.service.validation.impl;


import by.fluvirus.webtech.lab2.service.validation.ValueValidator;

/**
 * Represents value validator for doubles
 */
public class DoubleValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            return Double.parseDouble(String.valueOf(obj)) > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
