package co.uk.tcummins.structural.designs.adapter;

/**
 * Created by Tom on 20/09/2016.
 */
public class VLCPlayer implements AdvancedMediaPlayer
{
    public void playVLC( String fileName )
    {
        System.out.println( "Playing VLC file. Name: " + fileName );
    }


    public void playMP4( String fileName )
    {
        // Do nothing.
    }
}
