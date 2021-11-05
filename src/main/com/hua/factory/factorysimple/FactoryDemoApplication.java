package com.hua.factory.factorysimple;

/**
 * <pre>
 * 工厂模式-属于创建型模式
 * 我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。<br/>
 * 优点： 1、一个调用者想创建一个对象，只要知道其名称就可以了。
 * 2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
 * 3、屏蔽产品的具体实现，调用者只关心产品的接口。<br/>
 * 自我理解: 工厂,顾名思义,是生产产品的.而工厂模式中的工厂类,是用来创建对象实例的
 * </pre>
 * Created by lerry on 2017/7/18.
 * @author lerry
 */
public class FactoryDemoApplication {
    public static void main(String[] args) {
        ShapFactory shapFactory = new ShapFactory();
        Shape circle = shapFactory.createSharpe("CIRCLE");
        circle.draw();
        Shape rectangle = shapFactory.createSharpe("RECTANGLE");
        rectangle.draw();
        Shape square = shapFactory.createSharpe("SQUARE");
        square.draw();
    }
}
