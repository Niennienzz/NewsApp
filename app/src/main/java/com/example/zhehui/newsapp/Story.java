package com.example.zhehui.newsapp;

public class Story {

    /**
     * Story information member fields.
     */
    private String mTitle;
    private String mSection;
    private String mWebURL;

    /**
     * Constructor.
     */
    public Story(String title, String section, String url) {
        mTitle = title;
        mSection = section;
        mWebURL = url;
    }

    /**
     * Getters.
     */
    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getWebURL() {
        return mWebURL;
    }

}
