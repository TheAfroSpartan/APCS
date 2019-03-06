/**
 * Purpose:  This class tests the Candidate class by initializing it with names and number of votes.
 * 	         It also changes elements within the candidate ArrayList
 *
 * @author < Andrew Owens >
 * @version < 3/5/2019 >
 */
import java.util.ArrayList;

public class ElectionTesterV6 {

	private static int total;
	
	public static void main(String[] args) {
		
		ArrayList<Candidate> candidates = new ArrayList<Candidate>();
		
		Candidate David = new Candidate("David Ige", 244934);
		candidates.add(David);
		
		Candidate Andria = new Candidate("Andria Tupola", 131719);
		candidates.add(Andria);
		
		Candidate Terrence = new Candidate("Terrence Teruya", 4067);
		candidates.add(Terrence);
		
		Candidate Jim = new Candidate ("Jim Brewer", 10123);
		candidates.add(Jim);
		
		Candidate Andrew = new Candidate ("Andrew Owens", 543712);
		candidates.add(Andrew);
		
		System.out.println("Original Results:");
		System.out.println();
		
		formatResults(candidates);
		
		System.out.println();
		System.out.println();
		
		insertCandidate(candidates, 2, "Cam Cavasso", 42480);
		System.out.println("<< In position 3, add Cam Cavasso, 42480 votes >>");
        System.out.println();
		
		formatResults(candidates);
		
		System.out.println();
		System.out.println();
		
		insertCandidate2(candidates, "David Ige", "Tulsi Gabbard", 153132);
		System.out.println("<< Before David Ige, add Tulsi Gabbard, 153132 votes >>");
        System.out.println();
        
        formatResults(candidates);
		
	}
	
	//Method to Print out the array elements
	public static void printResults(ArrayList<Candidate> candidates) {
		
		for(Candidate candidate : candidates) 	
			System.out.println(candidate);
			
	}
	
	//method to count the total number of votes
	public static int countTotal(ArrayList<Candidate> candidates) {
		total = 0;
		
		for(int i = 0; i < candidates.size(); i++) {
			total += candidates.get(i).getVotes();
		}
		
		return total;
	}
	
	/**
	 * Method to print results in formatted output
	 * @param candidates
	 */
	public static void formatResults(ArrayList<Candidate> candidates) {
		
		countTotal(candidates);
		
		double percent;
		
		System.out.printf("%26s%21s%n", "Votes", "% of Total");
		System.out.print("Candidate");
		System.out.printf("%19s%17s%n", "Recieved", "Votes");
		System.out.println("------------------------------------------------");
		
		for(int i = 0; i < candidates.size(); i++) {
		
			percent = ((double)candidates.get(i).getVotes() / total) * 100;
			System.out.printf("%-21s",candidates.get(i).getName());
			System.out.printf("%5d%18.2f%n", candidates.get(i).getVotes(), percent);
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
	public static void changeCandidate(ArrayList<Candidate> candidates, String find, String replace){
		  
	       for(int index = 0; index < candidates.size(); index++)
	          if(candidates.get(index).getName().equals(find))
	               candidates.get(index).setName(replace);
	    }
		
	/**
	 * Method to change candidate's votes.
	 * @param candidates
	 * @param find
	 * @param replace
	 */
		public static void changeVote(ArrayList<Candidate> candidates, int find, int replace){
			  
		       for(int index = 0; index < candidates.size(); index++)
		          if(candidates.get(index).getVotes() == find)
		               candidates.get(index).setVotes(replace);
		    }
		
		/**
		 * Method to change candidate's name and votes
		 * @param candidates
		 * @param find
		 * @param replace
		 * @param findNum
		 * @param replaceNum
		 */
		public static void changeEverything(ArrayList<Candidate> candidates, String find, String replace, int findNum, int replaceNum) {
			
			for(int index = 0; index < candidates.size(); index++)
		          if(candidates.get(index).getName().equals(find))
		               candidates.get(index).setName(replace);
			
			for(int index = 0; index < candidates.size(); index++)
		          if(candidates.get(index).getVotes() == findNum)
		               candidates.get(index).setVotes(replaceNum);
		}
		
		public static void insertCandidate(ArrayList<Candidate> candidates, int location, String name, int votes) {
			
			// insert item into ArrayList
	        candidates.add(location, new Candidate(name, votes));
			
		}
		
		public static void insertCandidate2(ArrayList<Candidate> candidates, String find, String name, int votes) {
			
			int location = 0;

	        // find location of item you want to insert before
	        for(int index = 0; index < candidates.size(); index++)
	            if(candidates.get(index).getName().equals(find))
	                location = index;

	        // insert item into ArrayList
	        candidates.add(location, new Candidate(name, votes));
			
		}
	
}