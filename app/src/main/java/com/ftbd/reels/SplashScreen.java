package com.ftbd.reels;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    ImageView splash_image;
    TextView splash_text;
    Animation up,down;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        up = AnimationUtils.loadAnimation(this,R.anim.up);
        down = AnimationUtils.loadAnimation(this,R.anim.down);

        splash_image = findViewById(R.id.splash_image);
        splash_text = findViewById(R.id.splash_text);

        splash_image.setAnimation(up);
        splash_text.setAnimation(down);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,
                        MainActivity.class);
                startActivity(intent);
            }
        },3000);

    }
}