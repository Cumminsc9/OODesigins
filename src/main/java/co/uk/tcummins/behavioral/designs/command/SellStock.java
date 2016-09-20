package co.uk.tcummins.behavioral.designs.command;

/**
 * Created by Tom on 20/09/2016.
 */
public class SellStock implements Order
{
    private Stock abcStock;


    public SellStock( Stock abcStock )
    {
        this.abcStock = abcStock;
    }


    public void execute()
    {
        abcStock.sell();
    }
}
