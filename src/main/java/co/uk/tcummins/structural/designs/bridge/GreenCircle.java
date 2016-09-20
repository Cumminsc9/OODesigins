package co.uk.tcummins.structural.designs.bridge;

/**
 * Created by Tom on 20/09/2016.
 */
public class GreenCircle implements DrawAPI
{
    public void drawCircle( int radius, int x, int y )
    {
        System.out.println( "Drawing Circle [ colour: green, radius: "+radius+", x: "+x+", y "+y+"]" );
    }
}
