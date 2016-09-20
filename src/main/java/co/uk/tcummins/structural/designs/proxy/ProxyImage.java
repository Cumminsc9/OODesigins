package co.uk.tcummins.structural.designs.proxy;


/**
 * Created by Tom on 20/09/2016.
 */
public class ProxyImage implements Image
{
    private RealImage realImage;
    private String fileName;


    public ProxyImage( String fileName )
    {
        this.fileName = fileName;
    }


    public void display()
    {
        if( realImage == null )
        {
            realImage = new RealImage( fileName );
        }
        realImage.display();
    }
}
