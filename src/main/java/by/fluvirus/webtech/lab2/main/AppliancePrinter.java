package by.fluvirus.webtech.lab2.main;


import by.fluvirus.webtech.lab2.beans.Appliance;

/**
 * Class that prints appliance information in System.out
 */
public class AppliancePrinter {
	/**
	 * Prints information about all appliances in array
	 * @param appliances array of appliances
	 */
	public static void print(Appliance[] appliances) {
		if (appliances == null) {
			System.out.println("No appliances found");
			return;
		}
		for (Appliance appliance : appliances) {
			if (appliance == null) {
				System.out.println("Invalid appliance");
			}
			else {
				System.out.println(appliance);
			}
		}
	}
}
