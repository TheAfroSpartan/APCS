
public class StoreTester {

	public static void main(String[] args) {
		
		Store[] items = new Store [11];
		Store[] dest = new Store [11];
		
		items[0] = new Store ("Beach Towel", 50451098, 12.50, 20);
		items[1] = new Store ("Coffee Maker", 51077471, 19.99, 15);
		items[2] = new Store ("Frozen Pizza", 13428574, 6.50, 44);
		items[3] = new Store ("Oreo Cookies", 12959727, 2.99, 38);
		items[4] = new Store ("Staw Hat", 54158723, 16.99, 6);
		items[5] = new Store ("20Pc Cook Set", 23967971, 75.00, 8);
		items[6] = new Store ("Hawaiian Sun 6pk", 47101294, 2.99, 25);
		items[7] = new Store ("Instant Ramen", 14568314, 0.39, 25);
		items[8] = new Store ("Haagen Dazs", 50246562, 5.00, 18);
		items[9] = new Store ("Men's Razor", 51150426, 9.00, 40);
		items[10] = new Store ("Apple AirPods", 52106337, 159.99, 30);
		
		
		System.out.println("<<Sorting items by Item Name >>");
		System.out.println("<< Ascending Order >>");
		
	      items = sortByName(items);
	      for(int i = 0; i < items.length; i++)
	           System.out.println(items[i] );
	      
	      System.out.println();
		
	      System.out.println("_______________________________________________");
	      System.out.println();
	      
	      System.out.println("<<Sorting Items by Price >>");
		  System.out.println("<< Ascending Order >>");
		  
	      sortByPrice(items);
	      for(int i = 0; i < items.length; i++)
		         System.out.println(items[i] );
	      
	      System.out.println();
	      
	      System.out.println("_______________________________________________");
	      System.out.println();
	      mergeSortProductNum(items, 0, items.length-1);
	      System.out.println("<<Sorting items by product number >>");
		  System.out.println("<< Ascending Order >>");
		  
	      for(int i = 0; i < items.length; i++)
		        System.out.println(items[i] );
	     
	      
	      System.out.println("_______________________________________________");
	      System.out.println();
	}
	
	/**
	 * Insertion Method
	 * Purpose: Creates new empty array, compares the title of one element to the one before it,
	 * places elements of one array into the empty one in alphabetical order
	 * @param items
	 * @return position of items in sorted order
	 */
	public static Store[] sortByName(Store[] items)
    {
        Store[] dest = new Store[ items.length ];

        for( int i = 0 ; i < items.length ; i++ )
        {
            Store next = items[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getName().compareTo( dest[k-1].getName() ) > 0 )
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
            
        } 
        return dest;
    }
	
	/**
	 * Sorting method that sorts the items y the year in which they were produced
	 * Uses sorting algorithm.
	 * @param items
	 */
	public static void sortByPrice(Store[] items)
    {
		int i,posmax,k;
		
		for ( i = items.length - 1 ; i >= 0 ; i-- )
		{
		  posmax = 0;

		  for ( k = 0 ; k <= i ; k++ )
		  {
		    if ( items[k].getPrice() > items[posmax].getPrice() )
		      posmax = k;
		  }

		  Store temp = items[ i ];
		  items[ i ] = items[ posmax ];
		  items[ posmax ] = temp;
		}
    }
	
	/**
	 * Purpose: Divides array into smaller segments until there is only a single element per array
	 * Divide and Conquer
	 * @param movies
	 * @param low
	 * @param high
	 */
	public static void mergeSortProductNum(Store[] items, int low, int high) {
		
		if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortProductNum( items, low, mid );       // recursive call
        mergeSortProductNum( items, mid + 1, high);   // recursive call
                
        mergeProductNum( items, low, mid, high);
	}
	
	/**
	 * Purpose: Merge function that combines the arrays from mergeSortYear
	 * @param movies
	 * @param low
	 * @param mid
	 * @param high
	 */
	public static void mergeProductNum(Store[] items, int low, int mid, int high ) {
		
		 Store[] temp = new Store[ high - low + 1 ];

	        int i = low, j = mid + 1, n = 0;

	        while( i <= mid || j <= high )
	        {
	            if( i > mid )
	            {
	                temp[ n ] = items[ j ];
	                j++;
	            }
	            else if( j > high )
	            {
	                temp[ n ] = items[ i ];
	                i++;
	            }
	            else if( items[ i ].getProductNum() < items[ j ].getProductNum() )
	            {
	                temp[ n ] = items[ i ];
	                i++;
	            }
	            else
	            {
	                temp[ n ] = items[ j ];
	                j++;
	            }
	            n++;
	        }

	        for( int k = low ; k <= high ; k++ )
	            items[ k ] = temp[ k - low ];
	}
}
