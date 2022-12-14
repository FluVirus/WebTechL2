package by.fluvirus.webtech.lab2.main;


import by.fluvirus.webtech.lab2.beans.Appliance;
import by.fluvirus.webtech.lab2.beans.criteria.Criteria;
import by.fluvirus.webtech.lab2.beans.criteria.SearchCriteria;
import by.fluvirus.webtech.lab2.service.ApplianceService;
import by.fluvirus.webtech.lab2.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		Appliance[] appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 32);

		appliances = service.select(criteriaOven);

		System.out.println("Result 1:");
		AppliancePrinter.print(appliances);
		System.out.println();

		criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 45);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);

		appliances = service.select(criteriaOven);

		System.out.println("Result 2:");
		AppliancePrinter.print(appliances);
		System.out.println();
		
		Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName());
		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 8500);

		appliances = service.select(criteriaTabletPC);

		System.out.println("Result 3:");
		AppliancePrinter.print(appliances);
		System.out.println();
	}

}
