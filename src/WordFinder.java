import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class WordFinder{


    private Set<String> answers;

    public WordFinder(String word, String fileName){
        findWords(word.toUpperCase(),fileName);
    }

    public Set<String> getAnswers(){
        return answers;
    }

    private void findWords(String word, String fileName) {
        WordSorter wordSort = new WordSorter(fileName);
        List<Set<String>> allWords=wordSort.getArray();
        answers=allWords.get(((int) word.charAt(0))-65);
        ListIterator<Set<String>> iter = allWords.listIterator();

        for(int i=1;i<word.length();i++){

            answers.retainAll(allWords.get(((int) word.charAt(i))-65));

        }


        
    }


}



