package com.quangnguyen.androidblueprint;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


/**
 * Created by Quang Nguyen on 3/17/17.
 *
 */
public class BaseActivity extends AppCompatActivity {

    /**
     * Setups the fragment
     */
    public void startFragment(@NonNull Fragment fragment, int containerId) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(containerId, fragment);
        fragmentTransaction.commit();
    }

    /**
     * Setups tool bar
     */
    public void setupToolbar(@NonNull Toolbar toolbar) {
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
    }
}
