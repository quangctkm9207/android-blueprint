package com.quangnguyen.androidblueprint.mainscreen;

import android.support.annotation.NonNull;

import com.quangnguyen.androidblueprint.data.Message;
import com.quangnguyen.androidblueprint.data.source.MessageDataSource;
import com.quangnguyen.androidblueprint.data.source.MessageRepository;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Quang Nguyen on 3/16/17.
 *
 */

public class MainScreenPresenter implements MainScreenContract.Presenter {

    private MessageRepository mRepository;
    private MainScreenContract.View mView;

    public MainScreenPresenter(@NonNull MessageRepository repository, @NonNull MainScreenContract.View view) {
        mRepository = checkNotNull(repository);
        mView = checkNotNull(view);

        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void loadMessage() {
        mRepository.getMessage(new MessageDataSource.LoadMessageCallback() {
            @Override
            public void onMessageLoaded(Message message) {
                mView.showMessage(message);
            }
        });
    }
}
