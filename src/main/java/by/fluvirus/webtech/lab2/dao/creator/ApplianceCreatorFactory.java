package by.fluvirus.webtech.lab2.dao.creator;

import by.fluvirus.webtech.lab2.beans.Appliance;
import by.fluvirus.webtech.lab2.dao.creator.creators.*;
import org.w3c.dom.Node;
import java.util.HashMap;
import java.util.Map;

/**
 * Factory of appliance creators
 */
public final class  ApplianceCreatorFactory {
    private static final ApplianceCreatorFactory instance = new ApplianceCreatorFactory();
    private final Map<String, ApplianceCreator> creators = new HashMap<>();

    private ApplianceCreatorFactory() {
        creators.put("Laptop", new LaptopCreator());
        creators.put("Oven", new OvenCreator());
        creators.put("Refrigerator", new RefrigeratorCreator());
        creators.put("Speakers", new SpeakersCreator());
        creators.put("TabletPC", new TabletPCCreator());
        creators.put("Cleaner", new CleanerCreator());
    }

    /**
     * Gets the instance of the factory
     * @return factory instance
     */
    public static ApplianceCreatorFactory getInstance() {
        return instance;
    }

    /**
     * Creates the appliance from its node
     * @param node appliance node
     * @return specific type of the appliance
     */
    public Appliance create(Node node) {
        ApplianceCreator creator = creators.get(node.getNodeName());
        return creator.create(node);
    }
}
