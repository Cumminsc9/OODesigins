package co.uk.tcummins.behavioral.designs.observer;

/**
 * Created by Tom on 20/09/2016.
 */
public class HexaObserver extends Observer
{

    public HexaObserver( Subject subject )
    {
        this.subject = subject;
        this.subject.attach( this );
    }


    @Override
    public void update()
    {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
