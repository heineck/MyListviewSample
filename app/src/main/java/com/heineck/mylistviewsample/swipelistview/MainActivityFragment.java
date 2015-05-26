package com.heineck.mylistviewsample.swipelistview;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.heineck.mylistviewsample.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ListView listView;
    String[] names={"User 1","User 2","User 3","User 4","User 5","User 6","User 1","User 2","User 3","User 4","User 5","User 6","User 1","User 2","User 3","User 4","User 5","User 6","User 1","User 2","User 3","User 4","User 5","User 6"};

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        listView = (ListView) rootView.findViewById(R.id.listView1);
        MyListAdapter adapter = new MyListAdapter(getActivity(),names);
        listView.setAdapter(adapter);

        return rootView;
    }
}
