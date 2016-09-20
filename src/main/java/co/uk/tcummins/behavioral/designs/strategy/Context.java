package co.uk.tcummins.behavioral.designs.strategy;

/**
 * Created by Tom on 20/09/2016.
 */
public class Context
{
    private Strategy strategy;


    public Context( Strategy strategy )
    {
        this.strategy = strategy;
    }


    public int executeStrategy( int num1, int num2 )
    {
        return strategy.doOperation( num1, num2 );
    }
}
