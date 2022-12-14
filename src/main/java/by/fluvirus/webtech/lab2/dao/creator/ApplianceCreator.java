package by.fluvirus.webtech.lab2.dao.creator;

import by.fluvirus.webtech.lab2.beans.Appliance;
import org.w3c.dom.Node;

/**
 * Represents factory of appliance from nodes list
 */
public interface ApplianceCreator {
    /**
     * Creates the appliance
     * @param nodes list of appliances nodes
     * @return specific type of the appliance
     */
    Appliance create(Node nodes);
}
