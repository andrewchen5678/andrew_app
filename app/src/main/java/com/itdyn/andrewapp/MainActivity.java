package com.itdyn.andrewapp;


import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        TextView taskInfoTextView = (TextView) findViewById(R.id.taskInfoTextView);
        taskInfoTextView.setText("task id"+getTaskId());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


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

        return super.onOptionsItemSelected(item);
    }

    public void startMap(View v){
        Intent intent=new Intent(this,MapActivity.class);
        startActivity(intent);
    }

    public void startTestFragment(View v){
        Intent intent=new Intent(this,TestActivityWithFragment.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void startSingleTask(View v){
        Intent intent=new Intent(this,SingleTaskActivity.class);
        startActivity(intent);
    }

    public void testProgressiveDialog(View v){
        /*
        ProgressDialog dialog = new ProgressDialog(this);
        //dialog.setTitle(title);
        //dialog.setMessage(message);

        dialog.setIndeterminate(true);
        dialog.setCancelable(true);
        //dialog.setOnCancelListener(cancelListener);
        dialog.show();
*/
/*
        Dialog dialog=new Dialog(this);
        dialog.se
        dialog.setContentView(R.layout.test_spinner);
        dialog.show();
*/
        /*
        AlertDialog.Builder builder = new AlertDialog.Builder(this,R.style.TransparentProgressDialog);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.test_spinner, null));
        builder.show();
        */

        TransparentProgressDialog pd = new TransparentProgressDialog(this);
        pd.show();
    }

    private class TransparentProgressDialog extends Dialog {

        private ProgressBar iv;

        public TransparentProgressDialog(Context context) {
            super(context, R.style.TransparentProgressDialog);
            //WindowManager.LayoutParams wlmp = getWindow().getAttributes();
            //wlmp.gravity = Gravity.CENTER_HORIZONTAL;
            //getWindow().setAttributes(wlmp);
            //setTitle(null);
            //setCancelable(false);
            //setOnCancelListener(null);
            LinearLayout layout = new LinearLayout(context);
            layout.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            //iv = new ImageView(context);
            //iv.setImageResource(resourceIdOfImage);

            LayoutInflater inflater = getLayoutInflater();
            iv= (ProgressBar) inflater.inflate(R.layout.test_spinner, null);
            layout.addView(iv, params);
            addContentView(layout, params);
        }
/*
        @Override
        public void show() {
            super.show();
            RotateAnimation anim = new RotateAnimation(0.0f, 360.0f , Animation.RELATIVE_TO_SELF, .5f, Animation.RELATIVE_TO_SELF, .5f);
            anim.setInterpolator(new LinearInterpolator());
            anim.setRepeatCount(Animation.INFINITE);
            anim.setDuration(3000);
            iv.setAnimation(anim);
            iv.startAnimation(anim);
        }
        */
    }


}
