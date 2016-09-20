package co.uk.tcummins.structural.designs.proxy;

/**
 * Created by Tom on 20/09/2016.
 *
 * https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm
 */
public class ProxyPatternDemo
{
    public static void main(String[] args)
    {
        Image image = new ProxyImage( "test_10mb.jpeg" );

        //Image loaded from disk
        image.display();
        System.out.println( "" );

        //Image not loaded from disk
        image.display();
    }
}

//    In proxy pattern, a class represents functionality of another class. This type of design pattern comes
//    under structural pattern.

//    In proxy pattern, we create object having original object to interface its functionality to outer world.

//    Implementation
//    We are going to create an Image interface and concrete classes implementing the Image interface. ProxyImage is
//    a proxy class to reduce memory footprint of RealImage object loading.

//    ProxyPatternDemo, our demo class, will use ProxyImage to get an Image object to load and display as it needs.