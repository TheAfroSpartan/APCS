import java.util.Random;

public class array {
	
	public static void main(String[] args) {
	        Random randnum = new Random((10 - 1) + 1);
	        
	        
	        int[] ar1 = new int[10];
	        for(int c = 0; c <  ar1.length; c++) {
	            ar1[c] = (int)(Math.random() * 10) + 1;
	            
	            int count = 0;
	            int val = ar1[c];
	            
	            for (int j = 0; j < ar1.length; j++) {
	                
	            	if (val == ar1[j]) {
	                    count += 1;    
	        }
	            }
	            System.out.println(val + " occurs" + " " + count);
	            
	    
/*
	        int[] array = {5, 6, 2, 5, 2, 2, 0, 1, 6};
	        
	        for (int i = 0; i < array.length; i++) {
	            int count = 0;
	            int val = array[i];
	            for (int j = 0; j < array.length; j++) {
	                if (val == array[j]) {
	                    count += 1;
	                }
	            }
	            System.out.println(val + " occurs" + " " + count);
*/
	        }
	    }
}
