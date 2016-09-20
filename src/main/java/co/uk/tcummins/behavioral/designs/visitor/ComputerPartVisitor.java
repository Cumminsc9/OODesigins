package co.uk.tcummins.behavioral.designs.visitor;

/**
 * Created by Tom on 20/09/2016.
 */
public interface ComputerPartVisitor
{
    public void visit( Computer computer );


    public void visit( Mouse mouse );


    public void visit( Keyboard keyboard );


    public void visit( Monitor monitor );
}