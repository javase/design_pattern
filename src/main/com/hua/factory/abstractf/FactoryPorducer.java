package com.hua.factory.abstractf;

/**
 * Created by lerry on 2017/7/18.
 *
 * @author lerry
 */
public class FactoryPorducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
