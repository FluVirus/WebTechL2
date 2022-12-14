package by.fluvirus.webtech.lab2.service.validation.impl;

import by.fluvirus.webtech.lab2.service.validation.ValueValidator;

/**
 * Represents value validator for ranges
 */
public class RangeValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
         try {
             String range = (String) obj;
             String[] bounds = range.split("-");
             if (bounds.length != 2) {
                 return false;
             }
             for (String bound : bounds) {
                 if (Double.parseDouble(bound) < 0) {
                     return false;
                 }
             }
             return true;
         } catch (Exception e) {
             return false;
         }
    }
}
