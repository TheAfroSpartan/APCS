/**
 * Purpose: To test the Movie Class
 * 
 * 
 * @author Andrew Owens
 * @version 3/25/2019
 */
public class MovieTesterV3 {

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
		movies[7] = new Movie("Star Wars: A New Hope", 1977, "Lucasfilm Ltd");
		movies[8] = new Movie("The Prince of Egypt", 1998, "DreamWorks");
		movies[9] = new Movie("Fantastic Mr Fox", 2009, "20th Century Fox");
		movies[10] = new Movie("Princess Mononoke", 1997, "Studio Ghibli");

		System.out.println("<<Sorting movies by Title >>");
		System.out.println("<< Ascending Order >>");
		
	      sortByTitle(movies);
	      for(int i = 0; i < movies.length; i++)
	           System.out.println(movies[i] );
	      
	      System.out.println();
	      System.out.println("<< Descending Order >>");
	      System.out.println();
	      sortByTitleDesc(movies);
	      for(int i = 0; i < movies.length; i++)
	           System.out.println(movies[i] );
	      
	      
	      System.out.println("_______________________________________________");
	      System.out.println();
	      
	      System.out.println("<<Sorting movies by Year >>");
		  System.out.println("<< Ascending Order >>");
		  
	      sortByYear(movies);
	      for(int i = 0; i < movies.length; i++)
		         System.out.println(movies[i] );
	      
	      System.out.println();
	      System.out.println("<< Descending Order >>");
	      System.out.println();
	      sortByYearDesc(movies);
	      for(int i = 0; i < movies.length; i++)
		         System.out.println(movies[i] );
	     
	      
	      System.out.println("_______________________________________________");
	      System.out.println();
	      
	      System.out.println("<<Sorting movies by Studio >>");
		  System.out.println("<< Ascending Order >>");
	      sortByStudio(movies);
	      for(int i = 0; i < movies.length; i++)
		         System.out.println(movies[i] );
	      
	      System.out.println();
	      System.out.println("<< Descending Order >>");
	      System.out.println();
	      sortByStudioDesc(movies);
	      for(int i = 0; i < movies.length; i++)
		         System.out.println(movies[i] );
	}
	
	/**
	 * Prints array elements
	 * @param movies
	 */
	public static void printArray(Movie[] movies) {
		
		for(int i = 0; i < movies.length; i++)
			System.out.println(movies[i].toString());
		
	}
	
	/**
	 * Purpose: Creates new empty array, compares the title of one element to the one before it,
	 * places elements of one array into the empty one in alphabetical order
	 * @param movies
	 * @return position of movies in sorted order
	 */
	public static void sortByTitle(Movie[] movies) {
		
		int posmax, i, k;
		
		for ( i = movies.length - 1 ; i >= 0 ; i-- )
		{
		  posmax = 0;

		  for ( k = 0 ; k <= i ; k++ )
		  {
		    if ( movies[k].getTitle().compareTo(movies[posmax].getTitle()) > 0 )
		      posmax = k;
		  }

		  Movie temp = movies[ i ];
		  movies[ i ] = movies[ posmax ];
		  movies[ posmax ] = temp;
		}
	}
	
	
	public static void sortByTitleDesc(Movie[] movies) {
		
		int posmax, i, k;
		
		for ( i = 0 ; i < movies.length - 1; i++ )
		{
		  posmax = movies.length - 1;

		  for ( k = movies.length - 1 ; k >= i ; k-- )
		  {
		    if ( movies[k].getTitle().compareTo(movies[posmax].getTitle()) > 0 )
		      posmax = k;
		  }

		  Movie temp = movies[ i ];
		  movies[ i ] = movies[ posmax ];
		  movies[ posmax ] = temp;
		}
	}
	/**
	 * Sorting method that sorts the movies y the year in which they were produced
	 * Uses sorting algorithm.
	 * @param movies
	 */
	public static void sortByYear(Movie[] movies)
    {
		int i,posmax,k;
		
		for ( i = movies.length - 1 ; i >= 0 ; i-- )
		{
		  posmax = 0;

		  for ( k = 0 ; k <= i ; k++ )
		  {
		    if ( movies[k].getYear() > movies[posmax].getYear() )
		      posmax = k;
		  }

		  Movie temp = movies[ i ];
		  movies[ i ] = movies[ posmax ];
		  movies[ posmax ] = temp;
		}
    }
	
	public static void sortByYearDesc(Movie[] movies)
    {
		int posmax, i, k;
		
		for ( i = 0 ; i < movies.length - 1; i++ )
		{
		  posmax = movies.length - 1;

		  for ( k = movies.length - 1 ; k >= i ; k-- )
		  {
		    if ( movies[k].getYear() > movies[posmax].getYear())
		      posmax = k;
		  }

		  Movie temp = movies[ i ];
		  movies[ i ] = movies[ posmax ];
		  movies[ posmax ] = temp;
		}
    }
	
	public static void sortByStudio(Movie[] movies) {
		
		int posmax, i, k;
		
		for ( i = movies.length - 1 ; i >= 0 ; i-- )
		{
		  posmax = 0;

		  for ( k = 0 ; k <= i ; k++ )
		  {
		    if ( movies[k].getStudio().compareTo(movies[posmax].getStudio()) > 0 )
		      posmax = k;
		  }

		  Movie temp = movies[ i ];
		  movies[ i ] = movies[ posmax ];
		  movies[ posmax ] = temp;
		}
	}
	
	public static void sortByStudioDesc(Movie[] movies) {
		
		int posmax, i, k;
		
		for ( i = 0 ; i < movies.length - 1; i++ )
		{
		  posmax = movies.length - 1;

		  for ( k = movies.length - 1 ; k >= i ; k-- )
		  {
		    if ( movies[k].getStudio().compareTo(movies[posmax].getStudio()) > 0 )
		      posmax = k;
		  }

		  Movie temp = movies[ i ];
		  movies[ i ] = movies[ posmax ];
		  movies[ posmax ] = temp;
		}
	}
}
