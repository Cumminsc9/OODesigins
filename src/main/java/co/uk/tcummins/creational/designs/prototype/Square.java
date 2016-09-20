package co.uk.tcummins.creational.designs.prototype;

/**
 * Created by Tom on 20/09/2016.
 */
public class Square extends Shape
{

    public Square()
    {
        type = "Square";
    }


    @Override
    void draw()
    {
        System.out.println( "Inside Square::draw() method." );
    }
}
