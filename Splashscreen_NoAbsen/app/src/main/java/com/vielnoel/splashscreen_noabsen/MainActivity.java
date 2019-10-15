package com.vielnoel.splashscreen_noabsen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private int waktu_loading = 4000; //4000=4 detik

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent home = new Intent(MainActivity.this, Home.class);
                    startActivity(home);
                    finish();
                }
            }, waktu_loading);

            TextView myText = (TextView) findViewById(R.id.textView );

            Animation anim = new AlphaAnimation(0.0f, 1.0f);
            anim.setDuration(800); //You can manage the blinking time with this parameter
            anim.setStartOffset(20);
            anim.setRepeatMode(Animation.REVERSE);
            anim.setRepeatCount(Animation.INFINITE);
            myText.startAnimation(anim);
        }

}



