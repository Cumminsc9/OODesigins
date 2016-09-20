package co.uk.tcummins.creational.designs.builder;

/**
 * Created by Tom on 20/09/2016.
 */
public abstract class Burger implements Item
{
    public Packing packing()
    {
        return new Wrapper();
    }


    public abstract float price();
}
