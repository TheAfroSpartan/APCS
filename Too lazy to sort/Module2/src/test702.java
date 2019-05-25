
public class test702 {

	public static void main(String[] args) { 
	    String[] words = {"helicopter", "supercalicexpialiadsddocious", "Sceptere", "goat", "rooster", "friendly"};
	    int  value = longestString(words);
	    //System.out.println(a);
	}

	public static int longestString(String []words) {
	  //  String animalNames[] =  {"cat","chicken","horse","ooooooooo" };

		int index = 0; 
		int wordLength = words[0].length();
		for(int i=1; i< words.length; i++) {
		    if(words[i].length() > wordLength) {
		        index = i; 
		        wordLength = words[i].length();
		        System.out.println(wordLength);
		    }
		}
		return wordLength;
	    }

	}

