package co.uk.tcummins.behavioral.designs.observer;

/**
 * Created by Tom on 20/09/2016.
 */
public class OctalObserver extends Observer
{

    public OctalObserver( Subject subject )
    {
        this.subject = subject;
        this.subject.attach( this );
    }


    @Override
    public void update()
    {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
