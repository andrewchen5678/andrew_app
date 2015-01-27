package com.itdyn.andrewapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class TestFragment extends AndrewFragment {

    public TestFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(Constants.LOG_TAG,"TestFragment:onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_main_activity2, container, false);
        return rootView;
    }
}
