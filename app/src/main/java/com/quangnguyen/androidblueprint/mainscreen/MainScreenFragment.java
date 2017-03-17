package com.quangnguyen.androidblueprint.mainscreen;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.quangnguyen.androidblueprint.BaseFragment;
import com.quangnguyen.androidblueprint.R;

/**
 * Created by Quang Nguyen on 3/16/17.
 *
 */

public class MainScreenFragment extends BaseFragment implements MainScrenContract.View {

    public MainScreenFragment() {

    }

    public static MainScreenFragment newInstance() {
        return new MainScreenFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_screen_fragment, container, false);

        return rootView;
    }


    @Override
    public void setPresenter(MainScrenContract.Presenter presenter) {

    }
}
