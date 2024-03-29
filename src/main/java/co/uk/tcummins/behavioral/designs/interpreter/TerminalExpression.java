package co.uk.tcummins.behavioral.designs.interpreter;

/**
 * Created by Tom on 20/09/2016.
 */
public class TerminalExpression implements Expression
{

    private String data;


    public TerminalExpression( String data )
    {
        this.data = data;
    }


    @Override
    public boolean interpret( String context )
    {

        if( context.contains( data ) )
        {
            return true;
        }
        return false;
    }
}
