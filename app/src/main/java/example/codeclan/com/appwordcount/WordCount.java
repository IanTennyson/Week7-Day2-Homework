package example.codeclan.com.appwordcount;


import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 18/04/2017.
 */

public class WordCount {

    private WordCount[] sentence;

    public int getWordCount(String sentence){
        String[] splited = sentence.split(" ");
        return splited.length;
    }

}











