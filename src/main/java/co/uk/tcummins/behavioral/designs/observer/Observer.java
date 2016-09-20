package co.uk.tcummins.behavioral.designs.observer;

/**
 * Created by Tom on 20/09/2016.
 */
public abstract class Observer
{
    protected Subject subject;


    public abstract void update();
}