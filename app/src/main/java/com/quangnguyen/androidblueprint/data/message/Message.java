package com.quangnguyen.androidblueprint.data.message;

/**
 * Created by Quang Nguyen on 3/17/17.
 */

public class Message {
  private String content;

  public Message(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
