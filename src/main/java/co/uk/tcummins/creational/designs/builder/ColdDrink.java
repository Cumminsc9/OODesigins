package co.uk.tcummins.creational.designs.builder;

/**
 * Created by Tom on 20/09/2016.
 */
public abstract class ColdDrink implements Item
{
    public Packing packing()
    {
        return new Bottle();
    }


    public abstract float price();
}
