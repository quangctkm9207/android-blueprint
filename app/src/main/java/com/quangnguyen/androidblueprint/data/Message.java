package com.quangnguyen.androidblueprint.data;

/**
 * Created by Quang Nguyen on 3/17/17.
 *
 */

public class Message {
    private String mContent;

    public Message(String content) {
        mContent = content;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }
}
