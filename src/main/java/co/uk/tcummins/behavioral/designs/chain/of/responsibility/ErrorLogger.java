package co.uk.tcummins.behavioral.designs.chain.of.responsibility;

/**
 * Created by Tom on 20/09/2016.
 */
public class ErrorLogger extends AbstractLogger
{

    public ErrorLogger( int level )
    {
        this.level = level;
    }


    @Override
    protected void write( String message )
    {
        System.out.println( "Error Console::Logger: " + message );
    }
}
