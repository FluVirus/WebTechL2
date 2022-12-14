package by.fluvirus.webtech.lab2.dao.creator.creators;

import by.fluvirus.webtech.lab2.beans.Appliance;
import by.fluvirus.webtech.lab2.beans.Refrigerator;
import by.fluvirus.webtech.lab2.dao.creator.ApplianceCreator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of refrigerator appliance
 */
public class RefrigeratorCreator implements ApplianceCreator {
    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(Node node) {
        Refrigerator refrigerator = new Refrigerator();
        NodeList nodes = node.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "powerConsumption" -> refrigerator.powerConsumption = Integer.parseInt(value);
                    case "weight" -> refrigerator.weight = Double.parseDouble(value);
                    case "freezerCapacity" -> refrigerator.freezerCapacity = Integer.parseInt(value);
                    case "overallCapacity" -> refrigerator.overallCapacity = Integer.parseInt(value);
                    case "height" -> refrigerator.height = Double.parseDouble(value);
                    case "width" -> refrigerator.width = Double.parseDouble(value);
                    default -> throw new IllegalArgumentException("Illegal field name");
                }
            }
        }
        return refrigerator;
    }
}
