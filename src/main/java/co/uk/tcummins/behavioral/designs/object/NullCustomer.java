package co.uk.tcummins.behavioral.designs.object;

/**
 * Created by Tom on 20/09/2016.
 */
public class NullCustomer extends AbstractCustomer
{

    @Override
    public String getName()
    {
        return "Not Available in Customer Database";
    }


    @Override
    public boolean isNil()
    {
        return true;
    }
}