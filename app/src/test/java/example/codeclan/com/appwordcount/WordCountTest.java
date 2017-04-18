package example.codeclan.com.appwordcount;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 18/04/2017.
 */

public class WordCountTest {

    @Test
    public void testWordCount(){
        WordCount wordCount = new WordCount();
        assertEquals(3, wordCount.getWordCount("I am code"));
    }
}

