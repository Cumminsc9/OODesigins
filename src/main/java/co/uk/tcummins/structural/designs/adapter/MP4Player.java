package co.uk.tcummins.structural.designs.adapter;

/**
 * Created by Tom on 20/09/2016.
 */
public class MP4Player implements AdvancedMediaPlayer
{
    public void playVLC( String fileName )
    {
        // Do nothing.
    }


    public void playMP4( String fileName )
    {
        System.out.println( "Playing MP4 file. Name: " + fileName );
    }
}
