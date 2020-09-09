package com.example.hirunews.ui.newsview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.hirunews.R;
import com.example.hirunews.ui.videoview.VideoViewActivity;
import com.google.android.material.snackbar.Snackbar;

public class newsViewActivity extends AppCompatActivity {

    ImageView playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_view);

        playButton = findViewById(R.id.playBtn);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newsViewActivity.this, VideoViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
