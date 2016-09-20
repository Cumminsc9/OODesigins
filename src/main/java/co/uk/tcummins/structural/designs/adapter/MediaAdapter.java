package co.uk.tcummins.structural.designs.adapter;

/**
 * Created by Tom on 20/09/2016.
 */
public class MediaAdapter implements MediaPlayer
{
    AdvancedMediaPlayer advancedMediaPlayer;


    public MediaAdapter( String audioType )
    {
        if( audioType.equalsIgnoreCase( "VLC" ) )
        {
            advancedMediaPlayer = new VLCPlayer();
        }
        else if( audioType.equalsIgnoreCase( "MP4" ) )
        {
            advancedMediaPlayer = new MP4Player();
        }
    }


    public void play( String audioType, String fileName )
    {
        if( audioType.equalsIgnoreCase( "VLC" ) )
        {
            advancedMediaPlayer.playVLC( fileName );
        }
        else if( audioType.equalsIgnoreCase( "MP4" ) )
        {
            advancedMediaPlayer.playMP4( fileName );
        }
    }
}
