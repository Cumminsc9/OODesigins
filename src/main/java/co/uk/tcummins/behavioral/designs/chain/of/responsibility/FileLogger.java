package co.uk.tcummins.behavioral.designs.chain.of.responsibility;

/**
 * Created by Tom on 20/09/2016.
 */
public class FileLogger extends AbstractLogger
{

    public FileLogger( int level )
    {
        this.level = level;
    }


    @Override
    protected void write( String message )
    {
        System.out.println( "File::Logger: " + message );
    }
}
