/**
 * Purpose:  This class tests the Candidate class by initializing it with names and number of votes.
 * 			 It also changes the elements within the candidate array.
 *
 * @author < Andrew Owens >
 * @version < 3/5/2019 >
 */
public class ElectionTesterV7 {

	private static int total;
	
	public static void main(String[] args) {
		
		Candidate[] candidates = new Candidate[5];
		
		candidates[0] = new Candidate("David Ige", 244934);
		candidates[1] = new Candidate("Andria Tupola", 131719);
		candidates[2] = new Candidate("Jim Brewer", 10123);
		candidates[3] = new Candidate("Terrence Teruya", 4067);
		candidates[4] = new Candidate("Andrew Owens", 543712);
		
		System.out.println("Original Results:");
		System.out.println();
		
		formatResults(candidates);
		
		System.out.println();
		System.out.println();
		
		insertCandidate(candidates, 2, "Cam Cavasso", 42480);
		System.out.println("<< Remove candidate at position 3 >>");
        System.out.println();
		
		formatResults(candidates);
		
		System.out.println();
		System.out.println();
		
		insertCandidate2(candidates, "David Ige", "Tulsi Gabbard", 153132);
		System.out.println("<< Remove Andrew Owens >>");
        System.out.println();
        
        formatResults(candidates);
	}
	//Method to Print out the array elements
	public static void printResults(Candidate[] candidates) {
		
		for(int i = 0; i < candidates.length; i++) {	
			System.out.println(candidates[i]);
			
		}
	}
	//method to count the total number of votes
	public static int countTotal(Candidate[] candidates) {
		total = 0;
		
		for(int i = 0; i < candidates.length; i++) {
			total += candidates[i].getVotes();
		}
		
		return total;
	}
	/**
	 * Method to print results in formatted output
	 * @param candidates
	 */
	public static void formatResults(Candidate[] candidates) {
		
		countTotal(candidates);
		
		double percent;
		
		
		System.out.printf("%26s%21s%n", "Votes", "% of Total");
		System.out.print("Candidate");
		System.out.printf("%19s%17s%n", "Recieved", "Votes");
		System.out.println("------------------------------------------------");
		
		for(int i = 0; i < candidates.length; i++) {
		
			percent = ((double)candidates[i].getVotes() / total) * 100;
			System.out.printf("%-21s",candidates[i].getName());
			System.out.printf("%5d%18.2f%n", candidates[i].getVotes(), percent);
		}
		System.out.println();
		
		System.out.println("Total number of votes cast in election: " + total);
	}
	/**
	 * Method to change candidate name
	 * @param candidates
	 * @param find
	 * @param replace
	 */
	public static void changeCandidate(Candidate[] candidates, String find, String replace){
		  
       for(int index = 0; index < candidates.length; index++)
          if(candidates[index].getName().equals(find))
               candidates[index].setName(replace);
    }
	/**
	 * Method to change candidate's votes.
	 * @param candidates
	 * @param find
	 * @param replace
	 */
	public static void changeVote(Candidate[] candidates, int find, int replace){
		  
	       for(int index = 0; index < candidates.length; index++)
	          if(candidates[index].getVotes() == find)
	               candidates[index].setVotes(replace);
	    }
	/**
	 * Method to change candidate's name and votes
	 * @param candidates
	 * @param find
	 * @param replace
	 * @param findNum
	 * @param replaceNum
	 */
	public static void changeEverything(Candidate[] candidates, String find, String replace, int findNum, int replaceNum) {
		
		for(int index = 0; index < candidates.length; index++)
	          if(candidates[index].getName().equals(find))
	               candidates[index].setName(replace);
		
		for(int index = 0; index < candidates.length; index++)
	          if(candidates[index].getVotes() == findNum)
	               candidates[index].setVotes(replaceNum);
	}
	
	public static void insertCandidate(Candidate[] candidates, int location, String name, int votes) {
		
		  for(int index = candidates.length - 1; index > location; index--)
           
			  candidates[index] = candidates[index-1];
		  	  candidates[location] = new Candidate(name, votes);
		
	}
	
	public static void insertCandidate2(Candidate[] candidates, String find, String name, int votes) {
		
		int location = 0;

        // find location of item you want to insert before
        for(int index = 0; index < candidates.length; index++)
            if(candidates[index].getName().equals(find))
                location = index;

        //move items down in the array - last item is lost
        for(int index = candidates.length - 1; index > location; index--)
            candidates[index] = candidates[index-1];

        candidates[location] = new Candidate(name, votes);
		
	}
    
    public static void deleteByLoc(Candidate[] candidates, int location){
        
        if((location > 0) && (location < candidates.length)){
            
            for(int index = location; index < candidates.length - 1; index++)
                candidates[index] = candidates[index + 1];
            
                candidates[candidates.length - 1] = null;
        }
    }
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
	 
}
