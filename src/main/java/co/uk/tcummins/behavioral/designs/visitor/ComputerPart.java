package co.uk.tcummins.behavioral.designs.visitor;

/**
 * Created by Tom on 20/09/2016.
 */
public interface ComputerPart
{
    public void accept( ComputerPartVisitor computerPartVisitor );
}
