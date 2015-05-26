package com.heineck.mylistviewsample.buttoninsidelistview;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.heineck.mylistviewsample.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ButtonInsideListViewActivityFragment extends Fragment {

    public ButtonInsideListViewActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_button_inside_list_view, container, false);
    }
}
