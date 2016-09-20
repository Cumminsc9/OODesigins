package co.uk.tcummins.behavioral.designs.visitor;

/**
 * Created by Tom on 20/09/2016.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor
{

    @Override
    public void visit( Computer computer )
    {
        System.out.println( "Displaying Computer." );
    }


    @Override
    public void visit( Mouse mouse )
    {
        System.out.println( "Displaying Mouse." );
    }


    @Override
    public void visit( Keyboard keyboard )
    {
        System.out.println( "Displaying Keyboard." );
    }


    @Override
    public void visit( Monitor monitor )
    {
        System.out.println( "Displaying Monitor." );
    }
}