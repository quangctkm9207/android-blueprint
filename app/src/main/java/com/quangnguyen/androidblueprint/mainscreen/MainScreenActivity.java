package com.quangnguyen.androidblueprint.mainscreen;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.quangnguyen.androidblueprint.BaseActivity;
import com.quangnguyen.androidblueprint.R;
import com.quangnguyen.androidblueprint.data.source.MessageRepository;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Quang Nguyen on 3/16/17.
 *
 */

public class MainScreenActivity extends BaseActivity {

    private MainScreenPresenter mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen_activity);

        MainScreenFragment fragment = MainScreenFragment.newInstance();
        startFragment(fragment, R.id.container);

        // Creates the presenter
        mPresenter = new MainScreenPresenter(MessageRepository.getInstance(), fragment);
    }
}
