package co.uk.tcummins.structural.designs.bridge;

/**
 * Created by Tom on 20/09/2016.
 */
public abstract class Shape
{
    protected DrawAPI drawAPI;

    protected Shape( DrawAPI drawAPI )
    {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
