package com.itdyn.andrewapp;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.webkit.WebResourceResponse;

import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkResourceClient;
import org.xwalk.core.XWalkUIClient;
import org.xwalk.core.XWalkView;


public class MainActivity extends Activity {

    private XWalkView mXwalkView;

    class MyResourceClient extends XWalkResourceClient {
        MyResourceClient(XWalkView view) {
            super(view);
        }

        @Override
        public boolean shouldOverrideUrlLoading(XWalkView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

        @Override
        public void onLoadFinished(XWalkView view, String url) {
            super.onLoadFinished(view, url);
            //view.evaluateJavascript("");
        }

        @Override
        public WebResourceResponse shouldInterceptLoadRequest(XWalkView view, String url) {
         return super.shouldInterceptLoadRequest(view,url);
        }
    }

    class MyUIClient extends XWalkUIClient {
        MyUIClient(XWalkView view) {
            super(view);
        }



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("test","oncreate chafa");
        XWalkPreferences.setValue(XWalkPreferences.ANIMATABLE_XWALK_VIEW,true);
        setContentView(R.layout.activity_main);
        mXwalkView = (XWalkView) findViewById(R.id.xwalkView);
        //(SurfaceView)mXwalkView.setZOrderOnTop(true);    // necessary
        //SurfaceHolder sfhTrackHolder = mXwalkView.getHolder();
        //sfhTrackHolder.setFormat(PixelFormat.TRANSPARENT);
        mXwalkView.setBackgroundColor(Color.TRANSPARENT);
        mXwalkView.setResourceClient(new MyResourceClient(mXwalkView));
        mXwalkView.setUIClient(new MyUIClient(mXwalkView));
        if (savedInstanceState == null){
            //mXwalkView.load("file:///android_asset/www/index.html#/signup/step1", null);
            mXwalkView.load("https://crosswalk-project.org/", null);

        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mXwalkView.restoreState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mXwalkView.saveState(outState);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent=new Intent(this,MainActivity2.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (mXwalkView != null) {
            mXwalkView.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        if (mXwalkView != null) {
            mXwalkView.onNewIntent(intent);
        }
    }
}
