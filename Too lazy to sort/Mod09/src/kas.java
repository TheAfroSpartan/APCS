
public class kas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]studentScores;
		studentScores = new int[2][6];
		
		studentScores[0][0] = 96;
		studentScores[0][1] = 72;
		studentScores[0][2] = 84;
		studentScores[0][3] = 65;
		studentScores[0][4] = 89;
		studentScores[0][5] = 60;
		studentScores[1][0] = 78;
		studentScores[2][1] = 86;
		studentScores[3][2] = 75;
		studentScores[4][3] = 61;
		studentScores[5][4] = 85;
		studentScores[6][5] = 73;
		
		
		int total = 0;
    	
    	for(int i = 0; i < studentScores.length; i++) {
    		for(int j = 0; j < studentScores.length; j++) {
    			total += studentScores[i][j];
    		}
    	}
    	
    	System.out.println(total);
		
	}

}
