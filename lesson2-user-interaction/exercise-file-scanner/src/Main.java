import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       File file = new File("text");
       Scanner scanner = new Scanner(file);

       int wordCount = 0;
       while(scanner.hasNextLine()) {
           String currentLine = scanner.nextLine();

           wordCount += currentLine.split(" ").length;
       }

       System.out.println("Number of words in the file is " + wordCount);
    }
}