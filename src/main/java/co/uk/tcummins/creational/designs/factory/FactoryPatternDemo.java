package co.uk.tcummins.creational.designs.factory;

/**
 * Created by Tom on 20/09/2016.
 *
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */
public class FactoryPatternDemo
{
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape0 = shapeFactory.getShape( "CIRCLE" );
        shape0.draw();

        Shape shape1 = shapeFactory.getShape( "RECTANGLE" );
        shape1.draw();

        Shape shape2 = shapeFactory.getShape( "SQUARE" );
        shape2.draw();
    }
}


//    Factory pattern is one of most used design pattern in Java. This type of design pattern comes under creational
//    pattern as this pattern provides one of the best ways to create an object.

//    In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created
//    object using a common interface.

//    Implementation
//    We're going to create a Shape interface and concrete classes implementing the Shape interface. A factory
//    class ShapeFactory is defined as a next step.

//    FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object. It will pass information
//    (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.