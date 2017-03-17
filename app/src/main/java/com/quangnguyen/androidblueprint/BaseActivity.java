package com.quangnguyen.androidblueprint;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import static android.os.Build.VERSION_CODES.N;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Quang Nguyen on 3/17/17.
 * //TODO: Declare the role of this class/interface
 */

public class BaseActivity extends AppCompatActivity {

    /**
     * Setups the fragment
     */
    public void startFragment(@NonNull Fragment fragment, int containerId) {
        checkNotNull(fragment);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(containerId, fragment);
        fragmentTransaction.commit();
    }

    /**
     * Setups tool bar
     */
    public void setUpToolbar(@NonNull Toolbar toolbar) {
        checkNotNull(toolbar);
        setUpToolbar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
    }
}
