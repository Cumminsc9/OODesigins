package co.uk.tcummins.behavioral.designs.object;

/**
 * Created by Tom on 20/09/2016.
 */
public class RealCustomer extends AbstractCustomer
{

    public RealCustomer( String name )
    {
        this.name = name;
    }


    @Override
    public String getName()
    {
        return name;
    }


    @Override
    public boolean isNil()
    {
        return false;
    }
}