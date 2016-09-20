package co.uk.tcummins.creational.designs.prototype;

/**
 * Created by Tom on 20/09/2016.
 */
public class Rectangle extends Shape
{
    public Rectangle()
    {
        type = "Rectangle";
    }


    @Override
    void draw()
    {
        System.out.println( "Inside Rectangle::draw() method." );
    }
}
