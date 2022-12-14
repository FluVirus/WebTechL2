package by.fluvirus.webtech.lab2.service.validation.impl;

import by.fluvirus.webtech.lab2.beans.enums.FilterType;
import by.fluvirus.webtech.lab2.service.validation.ValueValidator;

/**
 * Represent value validator for filters
 */
public class FilterTypeValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            FilterType.valueOf((String) obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
