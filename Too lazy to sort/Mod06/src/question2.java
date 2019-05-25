
public class question2 {

	public static void main(String[] args) {
		double [] array1 = {1.2, 2.3, 3.4, 4.5, 5.6};
		double[] array2 = {1.0,2.0, 3.0, 4.0, 5.0};
		double[] array3 = new double[5];
		
		double value = 0;
		
		for (int i = 0 ; i < array1.length ; i++)
	    {
	        value = array1[i] * array2 [i];
	        array3[i] = value;
	        System.out.println(array3[i]);
	    }
		
		
	}

}
