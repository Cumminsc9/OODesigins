package co.uk.tcummins.structural.designs.memento;

/**
 * Created by Tom on 20/09/2016.
 */
public class Memento
{
    private String state;


    public Memento( String state )
    {
        this.state = state;
    }


    public String getState()
    {
        return state;
    }
}
