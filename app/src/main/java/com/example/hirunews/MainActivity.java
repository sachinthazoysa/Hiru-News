package com.example.hirunews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView=findViewById(R.id.imageView);

        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce_animation);

        imageView.setAnimation(animation2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mySuperIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(mySuperIntent);

                finish();

            }
        }, SPLASH_TIME_OUT);

    }
}
