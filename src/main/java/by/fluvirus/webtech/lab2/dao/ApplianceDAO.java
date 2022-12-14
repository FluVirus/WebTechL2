package by.fluvirus.webtech.lab2.dao;


import by.fluvirus.webtech.lab2.beans.Appliance;
import by.fluvirus.webtech.lab2.beans.criteria.Criteria;

/**
 * Represents appliance DAO
 */
public interface ApplianceDAO {
	/**
	 * Finds all appliances by given search criteria
	 * @param criteria search criteria
	 * @return array of appliances that satisfy search criteria
	 */
	Appliance[] select(Criteria criteria);
}
