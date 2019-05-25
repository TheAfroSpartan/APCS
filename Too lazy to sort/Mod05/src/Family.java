/*
 * PROJECT TITLE: 5.03  Primitive Reading TExt Files  /Family.java
 * PURPOSE OF PROJECT: Learn how to scan through .txt files 
 * @version: 09/26/18
 * @author: ANDREW OWENS
 * 
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class Family {

	public static void main(String[] args) throws IOException {
		
		String token = "";
        File maleFemale = new File("maleFemaleInFamily.txt");
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        Scanner inFile = new Scanner(maleFemale);
        
        int bg = 0;
        int gg = 0;
        int bb = 0;
        int family = 0;
        double percentbb;
        double percentgg;
        double percentbg;
        
         int bg1 = 0;
        int gg1 = 0;
        int bb1 = 0;
        int family1 = 0;
        double percentbb1;
        double percentgg1;
        double percentbg1;
        
        int bg2 = 0;
        int gg2 = 0;
        int bb2 = 0;
        int family2 = 0;
        double percentbb2;
        double percentgg2;
        double percentbg2;
        
        
        System.out.println("Compoition statisitics for families with two children.");
        System.out.println();
        
        //while loop will continue while inFile has a next token to read
        while( inFile.hasNext() )
        {
            token = inFile.next( );      //read next token from file
            //System.out.println(token);   //print value of token
            family++;
            
            while(token.equals("BG") || token.equals("GB")) { //nested while
            	
            	bg++;
            	break;
            }
            
            while(token.equals("BB")) { //nested while
            	
            	bb++;
            	break;
            }
            
            while(token.equals("GG")) {  //nested while
            	
            	gg++;
            	break;
            }
            
            
            
        }//end main while
        
        percentbb = ((double)bb / (double)family) * 100;
        percentgg = ((double)gg / (double)family) * 100;
        percentbg = ((double)bg / (double)family) * 100;
        
        System.out.println("Total number of families: " + family);
        System.out.println();
        
        System.out.println("Number of families with:");
        System.out.println("2 boys: " + bb + " represents " + numberFormat.format(percentbb) + "%");
        System.out.println("2 girls: " + gg + " represents " + numberFormat.format(percentgg) + "%");
        System.out.println("1 boy and 1 girl: " + bg + " represents " + numberFormat.format(percentbg) + "%");
        System.out.println();
       
        inFile.close();                 //close input file
        
        
        
        
        //next loop
        String token1 = "";
        File test1 = new File ("test1.txt");
        Scanner inFile1 = new Scanner(test1);
        
        while( inFile1.hasNext() )
        {
            token1 = inFile1.next( );      //read next token from file
            //System.out.println(token);   //print value of token
            family1++;
            
            while(token1.equals("BG") || token1.equals("GB")) { //nested while
            	
            	bg1++;
            	break;
            }
            
            while(token1.equals("BB")) { //nested while
            	
            	bb1++;
            	break;
            }
            
            while(token1.equals("GG")) {  //nested while
            	
            	gg1++;
            	break;
            }
        
            
        }//end main while1
        
        percentbb1 = ((double)bb1 / (double)family1) * 100;
        percentgg1 = ((double)gg1 / (double)family1) * 100;
        percentbg1 = ((double)bg1 / (double)family1) * 100;
        
        System.out.println("Next Data Set");
        System.out.println();
        
        System.out.println("Total number of families: " + family1);
        System.out.println();
        
        System.out.println("Number of families with:");
        System.out.println("2 boys: " + bb1 + " represents " + numberFormat.format(percentbb1) + "%");
        System.out.println("2 girls: " + gg1 + " represents " + numberFormat.format(percentgg1) + "%");
        System.out.println("1 boy and 1 girl: " + bg1 + " represents " + numberFormat.format(percentbg1) + "%");
        System.out.println();
        
        inFile1.close();
        
        
        
        //next data set
        String token2 = "";
        File test2 = new File ("test2.txt");
        Scanner inFile2 = new Scanner(test2);
        
        while( inFile2.hasNext() )
        {
            token2 = inFile2.next( );      //read next token from file
            //System.out.println(token);   //print value of token
            family2++;
            
            while(token2.equals("BG") || token2.equals("GB")) { //nested while
            	
            	bg2++;
            	break;
            }
            
            while(token2.equals("BB")) { //nested while
            	
            	bb2++;
            	break;
            }
            
            while(token2.equals("GG")) {  //nested while
            	
            	gg2++;
            	break;
            }
        
            
        }//end main while1
        
        percentbb2 = ((double)bb2 / (double)family2) * 100;
        percentgg2 = ((double)gg2 / (double)family2) * 100;
        percentbg2 = ((double)bg2 / (double)family2) * 100;
        
        System.out.println("Next Data Set");
        System.out.println();
        
        System.out.println("Total number of families: " + family2);
        System.out.println();
        
        System.out.println("Number of families with:");
        System.out.println("2 boys: " + bb2 + " represents " + numberFormat.format(percentbb2) + "%");
        System.out.println("2 girls: " + gg2 + " represents " + numberFormat.format(percentgg2) + "%");
        System.out.println("1 boy and 1 girl: " + bg2 + " represents " + numberFormat.format(percentbg2) + "%");
        
        inFile2.close();
        
        
        

	}

}
