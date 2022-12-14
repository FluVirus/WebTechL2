package by.fluvirus.webtech.lab2.service.validation.impl;

import by.fluvirus.webtech.lab2.service.validation.ValueValidator;

/**
 * Represents value validator for integers
 */
public class IntValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            return (Integer)obj > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
