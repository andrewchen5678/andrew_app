package com.itdyn.andrewapp;

import android.animation.Animator;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by andrewchen2 on 1/27/15.
 */
public class AndrewFragment extends Fragment {
    private static final boolean DEBUG_LIFECYCLE=true;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onAttach");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onCreate");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onCreateView");
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onViewCreated");
        }
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onActivityCreated");
        }
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onStart");
        }
        super.onStart();
    }

    @Override
    public void onResume() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onResume");
        }
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onSaveInstanceState");
        }
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onPause() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onPause");
        }
        super.onPause();
    }

    @Override
    public void onStop() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onStop");
        }
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onDestroyView");
        }
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onDestroy");
        }
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onDetach");
        }
        super.onDetach();
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onActivityResult");
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onInflate");
        }
        super.onInflate(activity, attrs, savedInstanceState);
    }

    @Override
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onCreateAnimator");
        }
        return super.onCreateAnimator(transit, enter, nextAnim);
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onConfigurationChanged");
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onCreateOptionsMenu");
        }
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onPrepareOptionsMenu");
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onDestroyOptionsMenu() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onDestroyOptionsMenu");
        }
        super.onDestroyOptionsMenu();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onOptionsItemSelected");
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onOptionsMenuClosed");
        }
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onCreateContextMenu");
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onHiddenChanged");
        }
        super.onHiddenChanged(hidden);
    }

}
