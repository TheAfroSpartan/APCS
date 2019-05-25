public class practice 
{
   private int a, b;
   public practice(int aValue, int bValue) 
   {
     a = aValue;
     b = bValue;
   }
   public void swap () 
   {
     a = b;
     b = a;
   }
   public void print () 
   {
     System.out.println("a = " + a + ", and b = " + b);
   }


   public static void main(String[] args) 
   {
     practice swapObj = new practice(20, 10);
     swapObj.swap();
     swapObj.print();
   }
}