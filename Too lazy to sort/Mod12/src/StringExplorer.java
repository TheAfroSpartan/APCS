/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author (Andrew Owens)
 * @version (1/28/19)
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        
        //    trim()
        String sample2 = "            What are these whitespaces doing here!    ";
        System.out.println(sample2);
        System.out.println();
        
        System.out.println("Sample2 trimmed = " + sample2.trim());
        System.out.println();
        
        //    length()
        System.out.println("The length of sample2 = " + sample2.length());
        System.out.println("The length without white space = " + sample2.trim().length());
        System.out.println();
        //    indexOf with one and two parameters
        
        int position = sample2.indexOf("a");
        System.out.println("sample2.indexOf\"a\" = " + position);
        position = sample2.indexOf("a", position + 4);
        System.out.println("sample2.indexOf\"a\", position + 4 = " + position);
        System.out.println();
        
        //    substring() with one and two parameters
        
        System.out.println(sample2.substring(20));
        System.out.println(sample2.substring(21, 42));
        System.out.println();
        //    compareTo()
        
        String s1 = "Eclipse";
        String s2 = "Eclipse";
        String s3 = " What am I doing?";
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println();
        
        //    .replaceAll()
        
        System.out.println(sample2.trim().replaceAll("e", "o"));

    }

}