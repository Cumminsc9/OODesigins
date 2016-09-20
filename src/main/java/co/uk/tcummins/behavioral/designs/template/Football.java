package co.uk.tcummins.behavioral.designs.template;

/**
 * Created by Tom on 20/09/2016.
 */
public class Football extends Game
{

    @Override
    void endPlay()
    {
        System.out.println( "Football Game Finished!" );
    }


    @Override
    void initialize()
    {
        System.out.println( "Football Game Initialized! Start playing." );
    }


    @Override
    void startPlay()
    {
        System.out.println( "Football Game Started. Enjoy the game!" );
    }
}