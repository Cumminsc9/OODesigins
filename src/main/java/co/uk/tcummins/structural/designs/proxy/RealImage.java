package co.uk.tcummins.structural.designs.proxy;

/**
 * Created by Tom on 20/09/2016.
 */
public class RealImage implements Image
{
    private String fileName;


    public RealImage( String fileName )
    {
        this.fileName = fileName;
        loadFromDisk( fileName );
    }


    private void loadFromDisk( String fileName )
    {
        System.out.println( "Loading... " + fileName );
    }


    public void display()
    {
        System.out.println( "Displaying : " + fileName );
    }
}
