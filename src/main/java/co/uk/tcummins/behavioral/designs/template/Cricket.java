package co.uk.tcummins.behavioral.designs.template;

/**
 * Created by Tom on 20/09/2016.
 */
public class Cricket extends Game
{

    @Override
    void endPlay()
    {
        System.out.println( "Cricket Game Finished!" );
    }


    @Override
    void initialize()
    {
        System.out.println( "Cricket Game Initialized! Start playing." );
    }


    @Override
    void startPlay()
    {
        System.out.println( "Cricket Game Started. Enjoy the game!" );
    }
}
