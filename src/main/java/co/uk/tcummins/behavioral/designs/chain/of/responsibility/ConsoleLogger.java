package co.uk.tcummins.behavioral.designs.chain.of.responsibility;

/**
 * Created by Tom on 20/09/2016.
 */
public class ConsoleLogger extends AbstractLogger
{

    public ConsoleLogger( int level )
    {
        this.level = level;
    }


    @Override
    protected void write( String message )
    {
        System.out.println( "Standard Console::Logger: " + message );
    }
}