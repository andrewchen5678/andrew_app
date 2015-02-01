package com.itdyn.andrewapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        TextView taskInfoTextView = (TextView) rootView.findViewById(R.id.taskInfoTextView);
        taskInfoTextView.setText("task id"+getActivity().getTaskId());
        View singleTaskBtn =  rootView.findViewById(R.id.button4);
        singleTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSingleTask3(v);
            }
        });

        View mapBtn =  rootView.findViewById(R.id.button);
        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMap(v);
            }
        });
        return rootView;
    }


    public void startSingleTask3(View v){
        Intent intent=new Intent(getActivity(),SingleTaskActivity.class);
        startActivity(intent);
    }


    public void startMap(View v){
        Intent intent=new Intent(getActivity(),MapActivity.class);
        startActivity(intent);
    }
}
