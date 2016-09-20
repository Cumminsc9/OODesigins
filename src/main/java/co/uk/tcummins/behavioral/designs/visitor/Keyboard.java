package co.uk.tcummins.behavioral.designs.visitor;

/**
 * Created by Tom on 20/09/2016.
 */
public class Keyboard implements ComputerPart
{

    @Override
    public void accept( ComputerPartVisitor computerPartVisitor )
    {
        computerPartVisitor.visit( this );
    }
}