import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Koelling
 *
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Track> tracks;
    // A player for the music files.
    public MusicPlayer player;
    Scanner scan = new Scanner(System.in);
    
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
    	tracks = new ArrayList<Track>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * filename The file to be added.
     */
    public void addTrack(Track myTrack)
    {
    	tracks.add(myTrack);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return tracks.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < tracks.size()) {
            String filename = tracks.get(index).getFilename();
            System.out.println(filename);
        }
    }
    
    
    //TODO: implement a listAllFiles method (task 2) use a for-each loop or lambda
    
    public void listAllFiles() {
    	tracks.forEach( (Track n) -> { System.out.println(n.getTitle());} );	
    }
    
    //TODO: implement a listMatching method (task 3)
    public void listMatching(String Eingabe) {
    	
    	tracks.forEach( (n) ->{
    		if (tracks.contains(Eingabe)) {
    			System.out.println("Match");  
    		}
    		else {
    			System.out.println("Match not found");
    		}
    	});
  	
    }
    
    public void playTracks() {
    	
    	   {
    	        for (Track t : tracks)
    	        {
    	              player.playSample(t.getFilename());
    	        }
    	    }
  	
    }
    
    

    /**
     * Find the index of the first file matching the given
     * search string.
     * @param searchString The string to match.
     * @return The index of the first occurrence, or -1 if
     *         no match is found.
     */
    public int findFirst(String searchString)
    {
        int index = 0;
        // Record that we will be searching until a match is found.
        boolean searching = true;
    
        while(searching && index < tracks.size()) {
            String filename = tracks.get(index).getFilename();
            if(filename.contains(searchString)) {
                // A match. We can stop searching.
                searching = false;
            }
            else {
                // Move on.
                index++;
            }
        }
        if(searching) {
            // We didn�t find it.
            return -1;
        }
        else {
            // Return where it was found.
            return index;
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < tracks.size()) {
        	tracks.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = tracks.get(index).getFilename();
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }
}
