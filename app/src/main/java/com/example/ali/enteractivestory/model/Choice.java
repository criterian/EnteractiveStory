package com.example.ali.enteractivestory.model;

/**
 * Created by Ali on 23.07.2015.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice (String text, int nextPage){
        mText= text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        this.mNextPage = nextPage;
    }
}
