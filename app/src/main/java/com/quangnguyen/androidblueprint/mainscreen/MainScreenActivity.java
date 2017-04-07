package com.quangnguyen.androidblueprint.mainscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.quangnguyen.androidblueprint.BaseActivity;
import com.quangnguyen.androidblueprint.R;
import com.quangnguyen.androidblueprint.data.source.MessageRepository;

/**
 * Created by Quang Nguyen on 3/16/17.
 *
 */

public class MainScreenActivity extends BaseActivity {

    private MainScreenPresenter presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen_activity);

        MainScreenFragment fragment = MainScreenFragment.newInstance();
        startFragment(fragment, R.id.container);

        // Creates the presenter
        presenter = new MainScreenPresenter(MessageRepository.getInstance(), fragment);
    }
}
