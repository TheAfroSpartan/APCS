
public class mod6Test {

	public static void main(String[] args) {
		double[] weights = {59.3, 48.3, 51.6, 43.1, 61.1, 67.0, 103.3, 80.9, 90.2, 72.7}; 
			double sum = 0;
			
			for(double s : weights) {
				sum +=s;
			}
			
		double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
       
        int finder = 0;
        int finder1 = 0;
      
        for(int i = 0; i < weights.length; i++)
        {
            if (weights[i] < min)
                min = weights[i];
            if (weights[i] > max)
                max = weights[i];
        }
        
        
        for (int f = 0; f < weights.length; f++) {
        	
        	if(min == weights[f]) {
        		finder = f;
        	}
   
        }
        
        for (int f = 0; f < weights.length; f++) {
        	
        	if(max == weights[f]) {
        		finder1 = f;
        	}
   
        }
       
        System.out.println("Minimum value is " + min);
        System.out.println("Maximum value is " + max);
        double sumExclusion = (sum - max) - min;
        double average = sumExclusion / 8;
        double trueAverage = sum / 10;
        
        
        System.out.println("Averege weight of bamboo eaten excluding maximum and minimum weights: ");
        
        for(int counter = 0; counter < weights.length; counter++) {
        	
        	if(!(counter == finder) && !(counter == finder1)) {
        		System.out.println(weights[counter]);
        	}
	}
        System.out.println("Average weight excluding max and min: " + average);	
        System.out.println("Average weight including max and min: " + trueAverage);	
        
	}
}
