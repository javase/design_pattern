package com.hua.factory.abstractf;

/**
 * Created by lerry on 2017/7/18.
 *
 * @author lerry
 */
public class ShapFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();

            case "RECTANGLE":
                return new Rectangle();

            case "SQUARE":
                return new Square();

            default:
                return null;

        }// end switch

    }

    @Override
    Color getColor(String color) {
        return null;
    }

}
