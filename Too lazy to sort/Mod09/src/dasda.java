import java.util.ArrayList;

public class dasda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String[] newWords = {"one","two","three"};
	  
	  ArrayList<String> wordList = new ArrayList<String>();
	  wordList.add("Mary");
  	  wordList.add("had");
  	  wordList.add("a");
  	  wordList.add("little");
  	  wordList.add("lamb");
  	  
  	int count = 0;
	 
	 for(String string : wordList) {
		 count += string.length();
	 }
	 
	 int count1 = 0;
	  for(String string : newWords) {
		  count1 += string.length();
	  }
	  int spaces = newWords.length - 1;
	  System.out.println(count1);
	  System.out.print(spaces);
	 
	 wordList.add(0, newWords[0]);
	 wordList.add(2, newWords[1]);
	 wordList.add(4, newWords[2]);
	 System.out.println(wordList);
	}

}
