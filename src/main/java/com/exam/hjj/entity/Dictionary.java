package com.exam.hjj.entity;

/**
 * @author haojunjie
 * @date 2020-03-07 18:47
 * @decription Dictionary entity
 */
public class Dictionary {

    /**
     * 匹配方式：
     *      1-默认匹配，
     *      2-自定义一个新的dictionary，根据新的匹配单词，
     *      3-自定义一个新的dictionary，根据新的和默认的词典同时匹配单词
     */
    private Integer type;

    /**
     * 默认词典
     */
    private String defaultDictionary = "{ i, like, sam, sung, samsung, mobile, ice, cream, man go}";

    /**
     * 新词典
     */
    private String newDictionary;


    public String getDefaultDictionary() {
        return defaultDictionary;
    }

    public void setDefaultDictionary(String defaultDictionary) {
        this.defaultDictionary = defaultDictionary;
    }

    public String getNewDictionary() {
        return newDictionary;
    }

    public void setNewDictionary(String newDictionary) {
        this.newDictionary = newDictionary;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}
