package com.quangnguyen.androidblueprint.mainscreen;

import com.quangnguyen.androidblueprint.BasePresenter;
import com.quangnguyen.androidblueprint.BaseView;
import com.quangnguyen.androidblueprint.data.message.Message;

/**
 * Created by Quang Nguyen on 3/16/17.
 */

public interface MainScreenContract {

  interface View extends BaseView<Presenter> {
    void showMessage(Message message);
  }

  interface Presenter extends BasePresenter {
    void loadMessage();
  }
}
