package co.uk.tcummins.behavioral.designs.strategy;

/**
 * Created by Tom on 20/09/2016.
 */
public class OperationSubtract implements Strategy
{
    @Override
    public int doOperation( int num1, int num2 )
    {
        return num1 - num2;
    }
}
