package co.uk.tcummins.behavioral.designs.mediator;

/**
 * Created by Tom on 20/09/2016.
 */
public class User
{
    private String name;


    public String getName()
    {
        return name;
    }


    public void setName( String name )
    {
        this.name = name;
    }


    public User( String name )
    {
        this.name = name;
    }


    public void sendMessage( String message )
    {
        ChatRoom.showMessage( this, message );
    }
}