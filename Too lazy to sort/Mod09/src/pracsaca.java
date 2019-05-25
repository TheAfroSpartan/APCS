
public class pracsaca {

	public static void main(String[] args) {
		
		int[][]studentScores = {{96, 72, 84, 65, 89, 60},
							    {78, 86, 96, 61, 96, 73}};
		
		double yes = 0;
		int total = 0;
    	for(int i = 0; i < studentScores.length; i++) {
    		
    		
    		for(int j = 0; j < studentScores[0].length; j++) {
    			
    			total += studentScores[i][j];
    			
    		}
    	}
    	
    	System.out.println(total);
    	//System.out.println(studentScores.length);
    	double average = total / (double)(studentScores[0].length * studentScores.length);
    	System.out.println(average);
    	
    	
    	
    	System.out.println("Test");
    	int count = 0;

        for (int row = 0; row < studentScores.length; row++) {
            for (int col = 0; col < studentScores[0].length; col++) {
                if (studentScores[row][col] == 2) {
                    System.out.printf("Instance found at [%d, %d]\n", row, col);
                    yes += studentScores[row][col];
                    count++;
                
                }else if(studentScores[row][col] != 2) {
                	System.out.println(-1.0);
                	break;
                	
                }
            }
        }
        System.out.println(yes/count);
	}

}
