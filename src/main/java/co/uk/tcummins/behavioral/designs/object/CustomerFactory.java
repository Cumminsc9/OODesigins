package co.uk.tcummins.behavioral.designs.object;

/**
 * Created by Tom on 20/09/2016.
 */
public class CustomerFactory
{

    public static final String[] names = { "Rob", "Joe", "Julie" };


    public static AbstractCustomer getCustomer( String name )
    {

        for( int i = 0; i < names.length; i++ )
        {
            if( names[i].equalsIgnoreCase( name ) )
            {
                return new RealCustomer( name );
            }
        }
        return new NullCustomer();
    }
}