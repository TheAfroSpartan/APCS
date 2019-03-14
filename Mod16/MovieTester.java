/**
 * Purpose: To test the Movie Class
 * 
 * 
 * @author Andrew Owens
 *
 */
public class MovieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie[] movies = new Movie[11];
		Movie[] dest = new Movie[11];
		
		movies[0] = new Movie("Iron Man", 2008, "Marvel");
		movies[1] = new Movie("Captain America Civil War", 2016, "Marvel");
		movies[2] = new Movie("Shrek", 2001, "DreamWorks");
		movies[3] = new Movie("Brave", 2012, "Pixar Animations Studio");
		movies[4] = new Movie("Remember The Titans", 2000, "Walt Disney Pictures");
		movies[5] = new Movie("Iron Giant", 1999, "Warner Bros");
		movies[6] = new Movie("Space Jam", 1996, "Warner Bros");
		movies[7] = new Movie("Star Wars: A New Hope", 1977, " Lucasfilm Ltd");
		movies[8] = new Movie("The Prince of Egypt", 1998, "DreamWorks");
		movies[9] = new Movie("Fantastic Mr Fox", 2009, "20th Century Fox");
		movies[10] = new Movie("Princess Mononoke", 1997, "‎Studio Ghibli");

		
		printArray(movies);
		insertionTitle(movies);
	}
	
	public static void printArray(Movie[] movies) {
		
		for(int i = 0; i < movies.length; i++)
			System.out.println(movies[i].toString());
		
	}
	
	public static Movie[] insertionTitle(Movie[] movies)
    {
        Movie[] dest = new Movie[ movies.length ];

        for( int i = 0 ; i < movies.length ; i++ )
        {
            Movie next = movies[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getTitle().compareTo( dest[k-1].getTitle() ) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;
            
            //Debugging Statements 
            //uncomment to print the listings after each pass through the sort
            //System.out.println("\nPass # " + i);
            //for(Movie h : dest)  
                //if( h != null) System.out.printf("%-15s \n", h.getTitle() );
        } // end of for
        return dest;
    }

}
