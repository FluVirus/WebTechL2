package by.fluvirus.webtech.lab2.dao.creator.creators;

import by.fluvirus.webtech.lab2.beans.Appliance;
import by.fluvirus.webtech.lab2.beans.Cleaner;
import by.fluvirus.webtech.lab2.beans.enums.FilterType;
import by.fluvirus.webtech.lab2.dao.creator.ApplianceCreator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of cleaner appliance
 */
public class CleanerCreator implements ApplianceCreator {
    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(Node node) {
        Cleaner vacuumCleaner = new Cleaner();
        NodeList nodes = node.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "powerConsumption" -> vacuumCleaner.powerConsumption = Integer.parseInt(value);
                    case "filterType" -> vacuumCleaner.filterType = FilterType.valueOf(value.toUpperCase());
                    case "bagType" -> vacuumCleaner.bagType = String.valueOf(value);
                    case "wandType" -> vacuumCleaner.wandType = String.valueOf(value);
                    case "motorSpeedRegulation" -> vacuumCleaner.motorSpeedRegulation = Integer.parseInt(value);
                    case "cleaningWidth" -> vacuumCleaner.cleaningWidth = Integer.parseInt(value);
                    default -> throw new IllegalArgumentException("Illegal field name");
                }
            }
        }
        return vacuumCleaner;
    }
}
