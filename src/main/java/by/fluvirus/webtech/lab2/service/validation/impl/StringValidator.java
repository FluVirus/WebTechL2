package by.fluvirus.webtech.lab2.service.validation.impl;


import by.fluvirus.webtech.lab2.service.validation.ValueValidator;

/**
 * Represents value validator for strings
 */
public class StringValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            return ((String) obj).length() != 0;
        } catch (Exception e) {
            return false;
        }
    }
}
