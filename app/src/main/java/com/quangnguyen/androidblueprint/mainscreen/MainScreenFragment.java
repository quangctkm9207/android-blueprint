package com.quangnguyen.androidblueprint.mainscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.quangnguyen.androidblueprint.BaseFragment;
import com.quangnguyen.androidblueprint.R;
import com.quangnguyen.androidblueprint.data.message.Message;

/**
 * Created by Quang Nguyen on 3/16/17.
 */

public class MainScreenFragment extends BaseFragment implements MainScreenContract.View {

  private MainScreenContract.Presenter presenter;
  private TextView messageView;

  public MainScreenFragment() {

  }

  public static MainScreenFragment newInstance() {
    return new MainScreenFragment();
  }

  @Override
  public void setPresenter(MainScreenContract.Presenter presenter) {
    this.presenter = presenter;
  }

  @Override
  public void showMessage(Message message) {
    messageView.setText(message.getContent());
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.main_screen_fragment, container, false);

    setUpViews(rootView);

    return rootView;
  }

  private void setUpViews(View rootView) {
    messageView = (TextView) rootView.findViewById(R.id.message);
    Button showMessageButton = (Button) rootView.findViewById(R.id.showMessage);
    showMessageButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        presenter.loadMessage();
      }
    });
  }
}
