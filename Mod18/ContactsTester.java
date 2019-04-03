
public class ContactsTester {

	public static void main(String[] args) {
		
		Contacts[] list = new Contacts[10];
		
		list[0] = new Contacts("John Doe", "Co-worker", "Jan 1", "1234567890", "johnDoe@gmail");
		list[1] = new Contacts("Ryan Smith", "Classmate", "Dec 5", "4596724132", "coolDude7123@gmail");
		list[2] = new Contacts("Jasmine Lackie", "Friend", "May 12", "8089275554", "LackieJ1482@yahoo");
		list[3] = new Contacts("Timmothy Brown", "Uncle", "Aug 22", "2167775621", "goBrowns2@aol");
		list[4] = new Contacts("Lee Miller", "Friend", "Feb 20", "8084379912", "OfficialLee@gmail");
		list[5] = new Contacts("Domino's Pizza", "Restaurant", "Dec 9", "8082546433", "customerService@dominos");
		list[6] = new Contacts("Katy Brown", "Aunt", "Mar 30", "2163190482", "KBrownie@gmail");
		list[7] = new Contacts("Ashley Washington", "Co-worker", "Apr 3", "1231249871", "VeganPower6221@outlook");
		list[8] = new Contacts("Alex King", "Friend", "Dec 28", "8084428761", "theTrueKingA2@gmail");
		list[9] = new Contacts("Alexa Queens", "Friend", "Jul 19", "8080917761", "QueenAlexaGirl@gmail");
		
		mergeSortRelation(list, 0, list.length - 1);
		
		for(int i = 0; i < list.length - 1; i++) {
		System.out.println(list[i].toString());
		}
		System.out.println("__________________________________________________________");
		binarySearchRelation(list, "Friend");
		
		System.out.println("__________________________________________________________");
		findBirthday(list, "Jan");
	
	}
	
	public static int binarySearchName(Contacts[] contacts, String toFind) {
		
		int high = contacts.length - 1;
		int low = -1;
		int middle;
		
		while( high - low > 1 )
        {
            middle = ( high + low ) / 2;
            if( contacts[middle].getName().compareTo(toFind) > 0)
                high = middle;
            else
                low = middle;
        }
        
        if( (low >= 0) && (contacts[low].getName().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
	}
	
	public static void binarySearchRelation(Contacts[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(r[probe].getRelation().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( r[probe].getRelation().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (r[low].getRelation().compareTo(toFind) == 0 ))
        {
            linearPrintRelation(r, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
    
    // Prints all elements before and after the found element 
    // that match the search criteria for location.
    public static void linearPrintRelation(Contacts[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getRelation().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getRelation().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }
	
    /**
	 * Purpose: Sequential Searching method to find Artist
	 * @param songs
	 * @param toFind
	 */
    public static void findBirthday(Contacts[] contacts, String toFind)
    {
        int found = 0;

        for(int i = 0; i < contacts.length; i++)
        {
            if(contacts[i].getBirthday().substring(0, 3).compareTo(toFind) == 0)
            {
            	System.out.println(contacts[i]);
                found++;   
            }
        }
        
        if(found == 0)
            System.out.println("Nobody in your contacts was born in this month.");
    }
	
	
	/**
	 * Purpose: Divides array into smaller segments until there is only a single element per array
	 * Divide and Conquer
	 * @param movies
	 * @param low
	 * @param high
	 */
    public static void mergeSortName(Contacts[] contacts, int low, int high){
		
		if(low == high)
            return;

        int mid = ( low + high ) / 2;

        mergeSortName(contacts, low, mid );       // recursive call
        mergeSortName(contacts, mid + 1, high);   // recursive call
                
        mergeName( contacts, low, mid, high);
	}
	
	/**
	 * Purpose: Merge function that combines the arrays from mergeSortSong
	 * @param myPlaylist
	 * @param low
	 * @param mid
	 * @param high
	 */
	public static void mergeName(Contacts[] contacts, int low, int mid, int high) {
		
		 Contacts[] temp = new Contacts[high - low + 1];

	        int i = low, j = mid + 1, n = 0;

	        while( i <= mid || j <= high )
	        {
	            if( i > mid )
	            {
	                temp[n] = contacts[j];
	                j++;
	            }
	            else if( j > high )
	            {
	                temp[n] = contacts[i];
	                i++;
	            }
	            else if( contacts[i].getName().compareTo(contacts[j].getName()) < 0 )
	            {
	                temp[n] = contacts[i];
	                i++;
	            }
	            else
	            {
	                temp[n] = contacts[j];
	                j++;
	            }
	            n++;
	        }

	        for( int k = low ; k <= high ; k++ )
	            contacts[k] = temp[k - low];
	}
	
	/**
	 * Purpose: Divides array into smaller segments until there is only a single element per array
	 * Divide and Conquer
	 * @param movies
	 * @param low
	 * @param high
	 */
    public static void mergeSortRelation(Contacts[] contacts, int low, int high){
		
		if(low == high)
            return;

        int mid = ( low + high ) / 2;

        mergeSortRelation(contacts, low, mid );       // recursive call
        mergeSortRelation(contacts, mid + 1, high);   // recursive call
                
        mergeRelation( contacts, low, mid, high);
	}
	
	/**
	 * Purpose: Merge function that combines the arrays from mergeSortSong
	 * @param myPlaylist
	 * @param low
	 * @param mid
	 * @param high
	 */
	public static void mergeRelation(Contacts[] contacts, int low, int mid, int high) {
		
		 Contacts[] temp = new Contacts[high - low + 1];

	        int i = low, j = mid + 1, n = 0;

	        while( i <= mid || j <= high )
	        {
	            if( i > mid )
	            {
	                temp[n] = contacts[j];
	                j++;
	            }
	            else if( j > high )
	            {
	                temp[n] = contacts[i];
	                i++;
	            }
	            else if( contacts[i].getRelation().compareTo(contacts[j].getRelation()) < 0 )
	            {
	                temp[n] = contacts[i];
	                i++;
	            }
	            else
	            {
	                temp[n] = contacts[j];
	                j++;
	            }
	            n++;
	        }

	        for( int k = low ; k <= high ; k++ )
	            contacts[k] = temp[k - low];
	}
}
