
public class Student {

	private String name;
	private int score1, score2, score3, score4, score5;
	
	public Student(String name, int score1, int score2, int score3, int score4, int score5) {
		
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.score4 = score4;
		this.score5 = score5;

	}
	
	public int getScores(int testNum) {
		
		if(testNum == 1)
			return this.score1;
		if(testNum == 2)
			return this.score2;
		if(testNum == 3)
			return this.score3;
		if(testNum == 4)
			return this.score4;
		if(testNum == 5)
			return this.score5;
		else
			return 0;
	}
	
	public void setScores(int testNum, int score) {
		
		if(testNum == 1)
			this.score1 = score;
		if(testNum == 2)
			this.score2 = score;
		if(testNum == 3)
			this.score3 = score;
		if(testNum == 4)
			this.score4 = score;
		if(testNum == 5)
			this.score5 = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name)
    {
        this.name = name;
    }
	
	public String toString()
    {
        return name + " " + score1 + " " + score2 + " " + score3 + " " + score4 + " " + score5;
    }
}
