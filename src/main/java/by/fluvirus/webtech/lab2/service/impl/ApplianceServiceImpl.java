package by.fluvirus.webtech.lab2.service.impl;

import by.fluvirus.webtech.lab2.beans.Appliance;
import by.fluvirus.webtech.lab2.beans.criteria.Criteria;
import by.fluvirus.webtech.lab2.dao.ApplianceDAO;
import by.fluvirus.webtech.lab2.dao.DAOFactory;
import by.fluvirus.webtech.lab2.service.ApplianceService;
import by.fluvirus.webtech.lab2.service.validation.Validator;

/**
 * Represents appliance service that works with appliance DAO
 */
public class ApplianceServiceImpl implements ApplianceService {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Appliance[] select(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		return applianceDAO.select(criteria);
	}
}
