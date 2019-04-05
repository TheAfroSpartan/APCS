/**
 * Purpose: This Class tests the Contacts class.
 * 
 * @author Andrew Owens
 * @version 4/3/19
 */
public class ContactsTester {

	public static void main(String[] args) {
		
		Contacts[] list = new Contacts[11];
		
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
		list[10] = new Contacts("Sarah Doe", "Acquaintance", "Jan 3", "1234567890", "sarahDoe@gmail");
		
		
		System.out.println("Original List:");
		System.out.println();
		
		System.out.printf("%-24s%9s%21s%21s%20s%n", "Name","Relationship","Birthday","Phone Number","Email");
		System.out.println("______________________________________________________________________________________________________________");
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].toString());
			}
		System.out.println("______________________________________________________________________________________________________________");
		System.out.println();
		
		mergeSortName(list, 0, list.length - 1);
		
		System.out.println("Organized By Name:");
		System.out.println();
		
		System.out.printf("%-24s%9s%21s%21s%20s%n", "Name","Relationship","Birthday","Phone Number","Email");
		System.out.println("______________________________________________________________________________________________________________");
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].toString());
			}
		
		System.out.println("__________________________________________________________");
		System.out.println("Searching for Lee Miller: ");
		
		int found = binarySearchName(list, "Lee Miller");
		System.out.println();
		if(found != -1){       	
            System.out.println("We found " + list[found].getName() + " in your Contacts: ");
            System.out.println(list[found]);
        }
        else
            System.out.println("This person is not in your contacts.");
		
		System.out.println();
		
		System.out.println("Searching for Jacob Fakes: ");
		
		found = binarySearchName(list, "Jacob Fakes");
		System.out.println();
		if(found != -1){       	
            System.out.println("We found " + list[found].getName() + " in your Contacts: ");
            System.out.println(list[found]);
        }
        else
            System.out.println("This person is not in your contacts.");
		
		
		System.out.println("______________________________________________________________________________________________________________");
		System.out.println();
		
		mergeSortRelation(list, 0, list.length - 1);
		
		System.out.println("Organized By Relationship:");
		System.out.println();
		
		System.out.printf("%-24s%9s%21s%21s%20s%n", "Name","Relationship","Birthday","Phone Number","Email");
		System.out.println("______________________________________________________________________________________________________________");
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].toString());
			}
		
		System.out.println("__________________________________________________________");
		
		System.out.println("Searching for Friends:");
		System.out.println();
		System.out.println("This is what we found: ");
		binarySearchRelation(list,"Friend");
		
		System.out.println();
		
		System.out.println("Searching for Dad:");
		System.out.println();
		System.out.println("This is what we found: ");
		binarySearchRelation(list,"Dad");
		System.out.println("__________________________________________________________");
		
		System.out.println("Searching for Birthdays in December:");
		System.out.println("This is what we found:");
		System.out.println();
		findBirthday(list, "Dec");
		
		System.out.println();
		System.out.println("Searching for Birthdays in June:");
		System.out.println("This is what we found:");
		findBirthday(list, "Jun");
		System.out.println("__________________________________________________________");
		
		System.out.println("Searching for the Phone Number (123)456-7890:");
		System.out.println();
		findPhoneNum(list,"1234567890");
		System.out.println();
		
		System.out.println("Searching for the Phone Number (808)333-3333:");
		findPhoneNum(list,"8083333333");
		System.out.println("__________________________________________________________");
		
		System.out.println("Searching for the Email Address customerService@dominos:");
		System.out.println("This is what we found:");
		System.out.println();
		findEmail(list,"customerService@dominos");
		System.out.println();
		
		System.out.println("Searching for the Email Address superMan@yahoo:");
		findEmail(list,"superMan@yahoo");
		System.out.println("__________________________________________________________");
	}
	/**
	 * Binary Searching method to Find names
	 * @param contacts
	 * @param toFind
	 * @return int
	 */
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
	/**
	 * Binary Searching method to find relationships
	 * @param contacts
	 * @param toFind
	 */
	public static void binarySearchRelation(Contacts[] contacts, String toFind )
    {
        int high = contacts.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(contacts[probe].getRelation().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( contacts[probe].getRelation().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (contacts[low].getRelation().compareTo(toFind) == 0 ))
        {
            linearPrintRelation(contacts, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
    
    // Prints all elements before and after the found element 
    // that match the search criteria for location.
    public static void linearPrintRelation(Contacts[] contacts, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (contacts[i].getRelation().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < contacts.length) && (contacts[i].getRelation().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(contacts[i]);
    }
	
    /**
	 * Purpose: Sequential Searching method to find Birthday month
	 * @param Contacts array
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
	 * Purpose: Sequential Searching method to find phone number
	 * @param Contacts array
	 * @param toFind
	 */
    public static void findPhoneNum(Contacts[] contacts, String toFind)
    {
        int found = 0;

        for(int i = 0; i < contacts.length; i++)
        {
            if(contacts[i].getPhoneNum().compareTo(toFind) == 0)
            {
            	System.out.println(contacts[i]);
                found++;   
            }
        }
        
        if(found == 0)
            System.out.println("This phone number does not exist in your contacts.");
    }
	
    /**
	 * Purpose: Sequential Searching method to find Email
	 * @param Contacts array
	 * @param toFind
	 */
    public static void findEmail(Contacts[] contacts, String toFind)
    {
        int found = 0;

        for(int i = 0; i < contacts.length; i++)
        {
            if(contacts[i].getEmail().compareTo(toFind) == 0)
            {
            	System.out.println(contacts[i]);
                found++;   
            }
        }
        
        if(found == 0)
            System.out.println("This Email does not exist in your contacts.");
    }
    
	/**
	 * Purpose: Divides array into smaller segments until there is only a single element per array
	 * Divide and Conquer
	 * @param contacts
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
	 * Purpose: Merge function that combines the arrays from MergeSortName
	 * @param contacts
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
	 * @param contacts
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
	 * Purpose: Merge function that combines the arrays from mergeSortRelation
	 * @param contacts
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
