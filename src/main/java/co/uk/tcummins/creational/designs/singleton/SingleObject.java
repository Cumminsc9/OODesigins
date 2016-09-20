package co.uk.tcummins.creational.designs.singleton;

/**
 * Created by Tom on 20/09/2016.
 */
public class SingleObject
{
    private static SingleObject INSTANCE = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return INSTANCE;
    }

    public void showMessage()
    {
        System.out.println( "Hello World" );
    }
}
