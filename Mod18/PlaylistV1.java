
public class PlaylistV1 {

	public static void main(String[] args) {
		
		Music[] myPlaylist = new Music[10];
		
		myPlaylist[0] = new Music("Cold", 2018, "Rich Brian");
		myPlaylist[1] = new Music ("Dancing in the Dark", 2018, "Joji");
		myPlaylist[2] = new Music ("SICKO MODE", 2018, "Travis Scott");
		myPlaylist[3] = new Music ("What Have I Done", 2008, "Cursive");
		myPlaylist[4] = new Music ("Remembering", 2018, "Yutaka Yamada");
		myPlaylist[5] = new Music ("September", 1979, "Earth, Wind & Fire");
		myPlaylist[6] = new Music ("Plastic Love",1984, "Mariya Takeuchi");
		myPlaylist[7] = new Music ("Jesus Walks", 2004, "Kanye West");
		myPlaylist[8] = new Music ("Hallelujah", 1994, "Jeff Buckley");
		myPlaylist[9] = new Music ("Hurry Up, We're Dreaming", 2011, "M83");
		
		printPlaylist(myPlaylist);
        
        System.out.println("\n\nSearching for songs by Yutaka Yamada: ");
        findArtist(myPlaylist, "Yutaka Yamada");
        
        System.out.println("\n\nSearching for songs by xxxTentacion: ");
        findArtist(myPlaylist, "xxxTentacion");
        
        System.out.println("\n\nSearching for Plastic Love: ");
        findSong(myPlaylist, "Plastic Love");
        
        System.out.println("\n\nSearching for Mo Bamba: ");
        findSong(myPlaylist, "Mo Bamba");
        
        System.out.println("\n\nSearching for songs in 2018: ");
        findYear(myPlaylist, 2018);
        
        System.out.println("\n\nSearching for songs in 1873: ");
        findYear(myPlaylist, 1873);
	}
	
	public static void printPlaylist(Music[] songs)
    {
        System.out.println("Song                      Year        Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < songs.length; i++)
            System.out.println(songs[i]);
    }
   
    public static void findArtist(Music[] songs, String toFind)
    {
        int found = -1;

        for(int i = 0; i < songs.length; i++)
        {
            if(songs[i].getArtist().compareTo(toFind) == 0)
            {
                found = i;
                break;   //terminates the for loop 
            }
        }
        
        if(found != -1)
        {  // we have found the person
            System.out.println("We found " + toFind + " in the playlist: ");
            System.out.println(songs[found]);
        }
        else
            System.out.println(toFind + " is not in the playlist.");
    }
   
    public static void findSong(Music[] songs, String toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < songs.length; i++)
        {
            if(songs[i].getTitle().compareTo(toFind) == 0)
            {
                System.out.println(songs[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the playlist.");
        }
    }
    
    public static void findYear(Music[] songs, int toFind) {
    	
    	int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < songs.length; i++)
        {
            if(songs[i].getYear() == toFind)
            {
                System.out.println(songs[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the location
            System.out.println("There are no songs from " + toFind + " in the playlist.");
        }
    }
}
