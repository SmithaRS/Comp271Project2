import java.util.Scanner;
import java.io.*;
import java.util.*;




public class WordFinder{

//    A class that finds the words
//    Create an interface for this class? - one of the requirements
////    Create a method that sorts the final output of words
private List<Set<String>> words = new ArrayList<>();
    Scanner dict = null;
//private List<Set<String>> words = new ArrayList<>();
//    Scanner dict = null;
public void WordSorter(String filename){
    filename = "testWord.txt";
    String line = null;

    try {
        // FileReader reads text files in the default encoding.
        FileReader fileReader =
                new FileReader(filename);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader =
                new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) {
            line = line.toUpperCase();
            putWord(line);
        }

        // Always close files.
        bufferedReader.close();
    }
    catch(FileNotFoundException ex) {
        System.out.println(
                "Unable to open file '" +
                        filename + "'");
    }
    catch(IOException ex) {
        System.out.println(
                "Error reading file '"
                        + filename + "'");
        // Or we could just do this:
        // ex.printStackTrace();
    }
}

    private void putWord(String word) {
        //go through word letter by letter and put it into the array ASCII - 65
        for(int i = 0; i < word.length(); i++ ){
            char letter =  word.charAt(i);
            int ascii = (int) letter;
            int index = ascii - 65;
            words.get(index).add(word);
        }
    }


}




