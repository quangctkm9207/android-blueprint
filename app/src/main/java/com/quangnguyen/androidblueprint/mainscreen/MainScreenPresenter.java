package com.quangnguyen.androidblueprint.mainscreen;

import android.support.annotation.NonNull;

import com.quangnguyen.androidblueprint.data.message.Message;
import com.quangnguyen.androidblueprint.data.message.MessageDataSource;
import com.quangnguyen.androidblueprint.data.message.MessageRepository;

/**
 * Created by Quang Nguyen on 3/16/17.
 */

public class MainScreenPresenter implements MainScreenContract.Presenter {

  private MessageRepository repository;
  private MainScreenContract.View view;

  public MainScreenPresenter(@NonNull MessageRepository repository,
      @NonNull MainScreenContract.View view) {
    this.repository = repository;
    this.view = view;
    // Attaches presenter to view
    view.setPresenter(this);
  }

  @Override
  public void start() {
  }

  @Override
  public void loadMessage() {
    repository.getMessage(new MessageDataSource.LoadMessageCallback() {
      @Override
      public void onMessageLoaded(Message message) {
        view.showMessage(message);
      }
    });
  }
}
