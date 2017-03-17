package com.quangnguyen.androidblueprint.data.source;

import android.support.annotation.NonNull;

import com.quangnguyen.androidblueprint.data.Message;

/**
 * Created by Quang Nguyen on 3/17/17.
 * A concrete implementation of the model layer in MVP
 */

public class MessageRepository implements MessageDataSource{
    // Mock data
    private static final String DEFAULT_MESSAGE = "Hello Android Blueprint";
    private Message mMessage;

    private static MessageRepository INSTANCE = null;

    private MessageRepository() {
        mMessage = new Message(DEFAULT_MESSAGE);
    }

    /**
     * Returns the single instance of this class, creating it if necessary.
     * @return the {@link MessageRepository} instance
     */
    public static MessageRepository getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MessageRepository();
        }

        return INSTANCE;
    }

    @Override
    public void getMessage(@NonNull LoadMessageCallback callback) {
        callback.onMessageLoaded(mMessage);
    }

    @Override
    public void saveMessage(Message message) {
        mMessage = message;
    }
}
