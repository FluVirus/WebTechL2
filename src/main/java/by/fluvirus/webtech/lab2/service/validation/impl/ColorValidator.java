package by.fluvirus.webtech.lab2.service.validation.impl;


import by.fluvirus.webtech.lab2.beans.enums.Color;
import by.fluvirus.webtech.lab2.service.validation.ValueValidator;

/**
 * Represent validator for colors
 */
public class ColorValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            Color.valueOf((String) obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
