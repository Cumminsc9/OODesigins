package co.uk.tcummins.structural.designs.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 20/09/2016.
 */
public class CareTaker
{
    private List<Memento> mementoList = new ArrayList<Memento>();


    public void add( Memento state )
    {
        mementoList.add( state );
    }


    public Memento get( int index )
    {
        return mementoList.get( index );
    }
}
