package co.uk.tcummins.structural.designs.adapter;


/**
 * Created by Tom on 20/09/2016.
 */
public class AudioPlayer implements MediaPlayer
{
    MediaAdapter mediaAdapter;


    public void play( String audioType, String fileName )
    {
        // Inbuilt support to play MP3 files
        if( audioType.equalsIgnoreCase( "MP3" ) )
        {
            System.out.println( "Playing MP3 file. Name: " + fileName );
        }
        else if( audioType.equalsIgnoreCase( "VLC" ) || audioType.equalsIgnoreCase( "MP4" ) )
        {
            mediaAdapter = new MediaAdapter( audioType );
            mediaAdapter.play( audioType, fileName );
        }
        else
        {
            System.out.println( "Invalid media. " + audioType + " format not supported." );
        }
    }
}
