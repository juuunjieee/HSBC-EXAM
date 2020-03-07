package com.exam.hjj.utils;

import com.exam.hjj.entity.Dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author haojunjie
 * @date 2020-03-07 18:47
 * @decription Dictionary function
 */
public class DictionaryUtils {


    /**
     * 判断匹配类型
     * @param dictionary    字典对象entity
     * @param sentence  字符串句子
     * @return
     */
    public static List matcherWord(Dictionary dictionary,String sentence){
        List<String> result = new ArrayList<>();
        List<String> wordList = null;
        sentence = sentence.replaceAll(" ","");
        Integer type = dictionary.getType();
        switch (type){
            case 1:
                wordList = handleWordDictionary(dictionary.getDefaultDictionary());
                result = getWordsBySentence(wordList,sentence);
                break;
            case 2:
                wordList = handleWordDictionary(dictionary.getNewDictionary());
                result = getWordsBySentence(wordList,sentence);
                break;
            case 3:
                wordList = handleWordDictionaryAll(dictionary.getDefaultDictionary(),dictionary.getNewDictionary());
                result = getWordsBySentence(wordList,sentence);
                break;
        }
        return result;
    }


    /**
     * 根据默认的字典匹配单词
     * @param wordList  词典
     * @param sentence  句子
     * @return
     */
    public static List getWordsBySentence(List<String> wordList,String sentence){
        return wordList.stream().filter(w -> sentence.contains(w)).distinct().collect(Collectors.<String>toList());
    }

    /**
     * 字符串字典转List
     * @param dictionary    字符串字典
     * @return
     */
    private static List<String> handleWordDictionary(String dictionary){
        return stringToList(dictionary);
    }

    /**
     * 将两个字典合并
     * @param defaultDictionary 默认字典
     * @param newDictionary 新自定义的字典
     * @return
     */
    private static List<String> handleWordDictionaryAll(String defaultDictionary,String newDictionary){
        List<String> defaultWordList = stringToList(defaultDictionary);
        List<String> newWordList = stringToList(newDictionary);
        newWordList.addAll(defaultWordList);
        return newWordList.stream().distinct().collect(Collectors.toList());
    }

    /**
     * String字符串转List
     * @param str   字符串
     * @return
     */
    private static List<String> stringToList(String str){
        return new ArrayList(Arrays.asList(str.replaceAll("\\{", "").
                replaceAll("}", "").replaceAll(" ", "").split(",")));
    }

}
