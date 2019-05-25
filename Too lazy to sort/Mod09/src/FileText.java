import java.util.ArrayList;

public class FileText
  {

      private String fileName;
      private int fileBytes;
      private ArrayList<String> wordList; // the contents of the text file
      
      // constructors not shown
      public FileText() {
    	  wordList = new ArrayList<String>();
    	  
    	  wordList.add("Mary");
    	  wordList.add("had");
    	  wordList.add("a");
    	  wordList.add("little");
    	  wordList.add("lamb");
    	  fileBytes = 0;            
      }

      // postcondition: calculates the number of bytes in this file and updates
      // the instance variable fileBytes
      public void fileSize()
      {
    	 int count = 0;
    	 
    	 for(String string : wordList) {
    		 count += string.length();
    	 }
    	 
    	 int spaces = wordList.size() - 1;
    	 
    	 fileBytes = count + spaces;
      }

      // precondition: 0 < newWords.length < wordList.size ()
      // postcondition: elements from the newWords array are placed into consecutive
      // even index positions, including 0, of the wordlist ArrayList
      // postcondition: the value of fileBytes is updated
      public void mergeWords(String[] newWords)
      {
    	  int count = 0;
    	  for(String string : newWords) {
    		  count += string.length();
    	  }
    	  int spaces = newWords.length - 1;
    	  
    	  int sum = spaces + count;
    	  fileBytes = fileBytes + sum;
    	  
    	  wordList.add(0, newWords[0]);
    	  wordList.add(2, newWords[1]);
    	  wordList.add(4, newWords[2]);
      }

      // other methods not shown

  }