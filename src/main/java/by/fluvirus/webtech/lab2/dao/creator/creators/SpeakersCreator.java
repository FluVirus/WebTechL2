package by.fluvirus.webtech.lab2.dao.creator.creators;

import by.fluvirus.webtech.lab2.beans.Appliance;
import by.fluvirus.webtech.lab2.beans.Speakers;
import by.fluvirus.webtech.lab2.dao.creator.ApplianceCreator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of speakers appliance
 */
public class SpeakersCreator implements ApplianceCreator {
    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(Node node){
        Speakers speakers = new Speakers();
        NodeList nodes = node.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "powerConsumption" -> speakers.powerConsumption = Integer.parseInt(value);
                    case "numberOfSpeakers" -> speakers.numberOfSpeakers = Integer.parseInt(value);
                    case "frequencyRange" -> speakers.frequencyRange = String.valueOf(value);
                    case "cordLength" -> speakers.cordLength = Integer.parseInt(value);
                    default -> throw new IllegalArgumentException("Illegal field name");
                }
            }
        }
        return speakers;
    }
}
