package com.quangnguyen.androidblueprint.data.source;

import android.support.annotation.NonNull;

import com.quangnguyen.androidblueprint.data.Message;

/**
 * Created by Quang Nguyen on 3/17/17.
 *
 */

public interface MessageDataSource {

    interface LoadMessageCallback {

        void onMessageLoaded(Message message);
    }

    void getMessage(@NonNull LoadMessageCallback callback);

    void saveMessage(Message message);
}
