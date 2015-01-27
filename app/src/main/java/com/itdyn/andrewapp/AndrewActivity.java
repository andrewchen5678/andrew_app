package com.itdyn.andrewapp;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

/**
 * Created by andrewchen2 on 1/27/15.
 */
public class AndrewActivity extends Activity{
    private static final boolean DEBUG_LIFECYCLE = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onCreate");
        }
    }



    @Override
    protected void onStart() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onStart");
        }
        super.onStart();
    }

    @Override
    protected void onResume() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onResume");
        }
        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onSaveInstanceState");
        }
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onPause() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onPause");
        }
        super.onPause();
    }

    @Override
    protected void onStop() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onStop");
        }
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onDestroy");
        }
        super.onDestroy();
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onRestoreInstanceState");
        }
        super.onRestoreInstanceState(savedInstanceState);
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onPostCreate");
        }
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onRestart");
        }
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onPostResume");
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onNewIntent");
        }
    }



    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onUserLeaveHint");
        }
    }

    @Override
    public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onCreateThumbnail");
        }
        return super.onCreateThumbnail(outBitmap, canvas);

    }

    @Override
    public CharSequence onCreateDescription() {
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onCreateDescription");
        }
        return super.onCreateDescription();
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onConfigurationChanged");
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onLowMemory");
        }
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onTrimMemory");
        }
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onAttachFragment");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(DEBUG_LIFECYCLE) {
            Log.d(Constants.LOG_TAG, getClass().getName() + ": onActivityResult");
        }
    }
}
