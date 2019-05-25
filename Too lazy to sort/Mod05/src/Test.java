import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String args[]) throws IOException {

        Scanner file = new Scanner(new File("input.txt"));

        String line = null;
        int sum = 0;
        int count = 0;
        while ((line = file.nextLine()) != null) {
            String[] vals = line.split(" ");
            for(int i = 0; i < vals.length; i++) {
                sum += Integer.valueOf(vals[i].trim());
                count++;
            }
        }
        System.out.println("the average is = " + ((double) sum / count));

    }

}