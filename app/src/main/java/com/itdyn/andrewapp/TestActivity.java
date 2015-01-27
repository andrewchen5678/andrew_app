package com.itdyn.andrewapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


/**
 * Created by andrew on 1/25/15.
 */
public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid);
        WebView webview=(WebView)findViewById(R.id.webView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://google-developers.appspot.com/maps/documentation/javascript/examples/full/map-simple");
    }


}
