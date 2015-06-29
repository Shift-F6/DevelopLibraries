package com.example.t___t.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ViewFlipper;

/**
 * Created by t(-_-t) on 26/06/2015.
 */
public class SplashActivity extends Activity {

    // used to know if the back button was pressed in the splash screen activity and avoid opening the next activity
    private boolean mIsBackButtonPressed;
    private static final int SPLASH_DURATION = 6000; //6 seconds total splash screen duration
    private static final int SPLASHIMAGE_DURATION = 3000; //2 seconds for every image

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activitysplash);
        final ViewFlipper view = (ViewFlipper) findViewById(R.id.switcher);

        Handler handler = new Handler();


        // run a thread after 3 seconds to change the splash screen image
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                view.showNext();//show next ImageView from ViewFlipper
            }
        }, SPLASHIMAGE_DURATION); // time in milliseconds (1 second = 1000 milliseconds) until the run() method will be called






        // run a thread after 3 seconds to start the home screen
        handler.postDelayed(new Runnable(){

            @Override
            public void run() {

                // make sure we close the splash screen so the user won't come back when it presses back key

                finish();

                if (!mIsBackButtonPressed) {
                    // start the home screen if the back button wasn't pressed already
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    SplashActivity.this.startActivity(intent);
                }

            }

        }, SPLASH_DURATION); // time in milliseconds (1 second = 1000 milliseconds) until the run() method will be called
    }

    @Override
    public void onBackPressed() {
        // set the flag to true so the next activity won't start up
        mIsBackButtonPressed = true;
        super.onBackPressed();
    }
}
