package by.fluvirus.webtech.lab2.beans.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents search criteria for specified appliance
 */
public class Criteria {

	private final String groupSearchName;
	private final Map<String, Object> criteria = new HashMap<>();

	/**
	 * Instantiates object of the type Criteria
	 * @param groupSearchName name of appliance search type
	 */
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	/**
	 * Gets the search appliance type name
	 * @return search appliance type name
	 */
	public String getGroupSearchName() {
		return groupSearchName;
	}

	/**
	 * Add new search criteria
 	 * @param searchCriteria field to search
	 * @param value value of search criteria
	 */
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	/**
	 * Gets the search criteria
	 * @return search criteria
	 */
	public Map<String, Object> getSearchCriteria() {
		return criteria;
	}

}
