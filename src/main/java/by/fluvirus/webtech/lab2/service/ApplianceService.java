package by.fluvirus.webtech.lab2.service;

import by.fluvirus.webtech.lab2.beans.Appliance;
import by.fluvirus.webtech.lab2.beans.criteria.Criteria;

/**
 * Represents interface of an appliance service
 */
public interface ApplianceService {
	/**
	 * Validates criteria and finds all appliances
	 * tha satisfy given criteria
	 * @param criteria criteria to satisfy for
	 * @return appliance array that satisfy the given criteria or null if criteria is invalid
	 */
	Appliance[] select(Criteria criteria);
}
