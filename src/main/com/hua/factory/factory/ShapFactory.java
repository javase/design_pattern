package com.hua.factory.factory;

/**
 * Created by lerry on 2017/7/18.
 *
 * @author lerry
 */
public class ShapFactory {

    public Shape getSharpe(String sharpType) {
        switch (sharpType) {
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
}
