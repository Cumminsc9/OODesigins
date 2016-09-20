package co.uk.tcummins.behavioral.designs.mediator;

import java.util.Date;

/**
 * Created by Tom on 20/09/2016.
 */
public class ChatRoom
{
    public static void showMessage( User user, String message )
    {
        System.out.println( new Date().toString() + " [" + user.getName() + "] : " + message );
    }
}
