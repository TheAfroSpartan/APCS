
class tesasdat {

	tesasdat(){
		
	}
	
	public static int recur(int n) {
		
		 if (n < 4)
	     {
			 System.out.println(n + " < 4, therefore ... f(" + n + ") = 2");
	          return 2;
	     }else {
	     System.out.println(n + " > 4, therefore ... f(" + n + ") = f(" + n + " / 4) + 2 = f(" + (n / 4) + ") + 2"); 
	     return recur(n / 4) + 2;
	}
	}
}

public class test {
	
	public static void main(String[] args) {
	
		tesasdat yeet = new tesasdat();
	int n;
	 n = 100;
	 
	 System.out.println(" this " + yeet.recur(n));
	System.out.println(25/4);
	 
	 
}
	}