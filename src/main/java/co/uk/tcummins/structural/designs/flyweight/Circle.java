package co.uk.tcummins.structural.designs.flyweight;

/**
 * Created by Tom on 20/09/2016.
 */
public class Circle implements Shape
{
    private String colour;
    private int x;
    private int y;
    private int radius;


    public Circle( String color )
    {
        this.colour = color;
    }


    public void setX( int x )
    {
        this.x = x;
    }


    public void setY( int y )
    {
        this.y = y;
    }


    public void setRadius( int radius )
    {
        this.radius = radius;
    }


    public void draw()
    {
        System.out.println( "Circle: Draw() [Colour : " + colour + ", x : " + x + ", y :" + y + ", radius :" + radius );
    }
}
