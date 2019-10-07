



package edu.cnm.deepdive.blackjack.controller;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import edu.cnm.deepdive.blackjack.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HandFragment extends Fragment {


  public HandFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_hand, container, false);
  }

}
