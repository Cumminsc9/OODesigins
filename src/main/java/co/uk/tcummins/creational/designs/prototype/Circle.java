package co.uk.tcummins.creational.designs.prototype;

/**
 * Created by Tom on 20/09/2016.
 */
public class Circle extends Shape
{
    public Circle()
    {
        type = "Circle";
    }


    @Override
    void draw()
    {
        System.out.println( "Inside Circle::draw() method." );
    }
}
