package com.itdyn.andrewapp;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class TestActivityWithFragment extends AndrewActivity {
    public static final String TAG="frag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        if (savedInstanceState == null) {
            Log.d("andrew","save instance state  null");
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new TestFragment(), TAG)
                    .commit();
        }else{
            Log.d("andrew","save instance state NOT null");
            Fragment chafa=getFragmentManager().findFragmentByTag(TAG);
            Log.d(Constants.LOG_TAG, "" + chafa);
            Log.d(Constants.LOG_TAG,"isAdded"+chafa.isAdded());
            Log.d(Constants.LOG_TAG,"isDetached"+chafa.isDetached());
            Log.d(Constants.LOG_TAG,"isHidden"+chafa.isHidden());
            Log.d(Constants.LOG_TAG,"isInLayout"+chafa.isInLayout());
            Log.d(Constants.LOG_TAG,"isRemoving"+chafa.isRemoving());
            Log.d(Constants.LOG_TAG,"isResumed"+chafa.isResumed());
            Log.d(Constants.LOG_TAG,"isVisible"+chafa.isVisible());
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

}
