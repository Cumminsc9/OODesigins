package co.uk.tcummins.structural.designs.memento;

/**
 * Created by Tom on 20/09/2016.
 */
public class Originator
{
    private String state;


    public String getState()
    {
        return state;
    }


    public void setState( String state )
    {
        this.state = state;
    }


    public Memento saveStateToMemento()
    {
        return new Memento( state );
    }


    public void getStateFromMemento( Memento memento )
    {
        state = memento.getState();
    }
}
