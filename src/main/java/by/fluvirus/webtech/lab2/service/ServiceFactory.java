package by.fluvirus.webtech.lab2.service;

import by.fluvirus.webtech.lab2.service.impl.ApplianceServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final ApplianceService applianceService = new ApplianceServiceImpl();
	
	private ServiceFactory() {}

	/**
	 * Gets the appliance service
	 * @return appliance service
	 */
	public ApplianceService getApplianceService() {

		return applianceService;
	}

	/**
	 * Gets the instance of the service factory
	 * @return instance of service factory
	 */
	public static ServiceFactory getInstance() {
		return instance;
	}

}
