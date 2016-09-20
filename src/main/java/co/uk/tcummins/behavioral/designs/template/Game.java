package co.uk.tcummins.behavioral.designs.template;

/**
 * Created by Tom on 20/09/2016.
 */
public abstract class Game
{
    abstract void initialize();


    abstract void startPlay();


    abstract void endPlay();


    //template method
    public final void play()
    {

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}