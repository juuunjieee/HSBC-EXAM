package com.exam.hjj;

import com.exam.hjj.entity.Dictionary;
import com.exam.hjj.utils.DictionaryUtils;
import org.junit.Test;

import java.util.List;

/**
 * @author haojunjie
 * @date 2020-03-07 18:50
 * @decription Dictionary test
 */
public class DictionaryTest {

    /**
     * first peoblem
     */
    @Test
    public void test1(){
        String sentence = "ilikesamsungmobile";
        Dictionary dictionary = new Dictionary();
        dictionary.setType(1);
        List result = DictionaryUtils.matcherWord(dictionary, sentence);
        System.out.println(result);
    }

    /**
     * second peoblem
     */
    @Test
    public void test2(){
        String sentence = "ilikesamsungmobileman mangoogle";
        Dictionary dictionary = new Dictionary();
        dictionary.setType(2);
        dictionary.setNewDictionary("{ i, like, sam, sung, mobile, icecream, man go, mango, google}");
        List result = DictionaryUtils.matcherWord(dictionary, sentence);
        System.out.println(result);
    }

    /**
     * third peoblem
     */
    @Test
    public void test3(){
        String sentence = "youillolhikesamsungmobileman mango";
        Dictionary dictionary = new Dictionary();
        dictionary.setType(3);
        dictionary.setNewDictionary("{ hello, You, you, man, go, samsung}");
        List result = DictionaryUtils.matcherWord(dictionary, sentence);
        System.out.println(result);
    }
}
