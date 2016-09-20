package co.uk.tcummins.behavioral.designs.command;

/**
 * Created by Tom on 20/09/2016.
 */
public class BuyStock implements Order
{
    private Stock abcStock;


    public BuyStock( Stock abcStock )
    {
        this.abcStock = abcStock;
    }


    public void execute()
    {
        abcStock.buy();
    }
}
