public class Gradebook
{

      private int[][] studentScores;
      private String[][] studentLetters;

      // constructors not shown

      // postcondition: returns −1.0 if letterGrade does not appear in studentLetters
      // otherwise, returns the average of all studentScores with corresponding
      // studentLetters values that are equal to the parameter letterGrade
      public double letterAverage(String letterGrade)
      {
    	  	double average = 0;
    		  double count = 0;
    		  double total = 0;
    		  for(int row = 0; row < studentScores.length; row++){
    		  for(int col = 0; col < studentScores[0].length; col++){
    		  if(studentLetters[row][col] == letterGrade){
    		  total += studentScores[row][col];
    		  count++;

    		  }

    		  else if(studentLetters[row][col] != letterGrade){
    		  return -1.0;
    		  }

    		  }

    		  }

    		  average = total / count;
    		  return average;
    		  }

      

      // other methods not shown

}