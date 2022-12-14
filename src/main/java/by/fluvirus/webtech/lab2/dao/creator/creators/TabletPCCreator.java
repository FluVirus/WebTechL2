package by.fluvirus.webtech.lab2.dao.creator.creators;

import by.fluvirus.webtech.lab2.beans.Appliance;
import by.fluvirus.webtech.lab2.beans.TabletPC;
import by.fluvirus.webtech.lab2.beans.enums.Color;
import by.fluvirus.webtech.lab2.dao.creator.ApplianceCreator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of tablet PC appliance
 */
public class TabletPCCreator implements ApplianceCreator {
    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(Node node) {
        TabletPC tabletPC = new TabletPC();
        NodeList nodes = node.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "batteryCapacity" -> tabletPC.batteryCapacity = Integer.parseInt(value);
                    case "displayInches" -> tabletPC.displayInches = Integer.parseInt(value);
                    case "memoryRom" -> tabletPC.memoryRom = Integer.parseInt(value);
                    case "flashMemoryCapacity" -> tabletPC.flashMemoryCapacity = Integer.parseInt(value);
                    case "color" -> tabletPC.color = Color.valueOf(value.toUpperCase());
                    default -> throw new IllegalArgumentException("Illegal field name");
                }
            }
        }
        return tabletPC;
    }
}
