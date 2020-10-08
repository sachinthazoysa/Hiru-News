package com.example.hirunews.ui.newsview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Xml;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hirunews.R;
import com.example.hirunews.ui.videoview.VideoViewActivity;
import com.google.android.material.snackbar.Snackbar;

public class newsViewActivity extends AppCompatActivity {

    ImageView playButton, newsImage;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_view);

        playButton = findViewById(R.id.playBtn);
        newsImage = findViewById(R.id.imageViewNews);
        title = findViewById(R.id.title1HotNewsView);

        String imageName=getIntent().getExtras().get("imageName").toString();
        String titlex= getIntent().getExtras().get("title").toString();
        String page= getIntent().getExtras().get("page").toString();

        if (page.equals( "myNews" )){ // for my news

            if(imageName.equals("accident")){
                newsImage.setImageResource(R.drawable.accident1);
                title.setText(titlex);

            }else if(imageName.equals("bookfair")){
                newsImage.setImageResource(R.drawable.bookfair1);
                title.setText(titlex);

            }else if(imageName.equals("opening")){
                newsImage.setImageResource(R.drawable.opening1);
                title.setText(titlex);
            }

        }else if (page.equals( "breakingNews" )){ //for breaking news

            if(imageName.equals("accident")){
                newsImage.setImageResource(R.drawable.accident1);
                title.setText(titlex);

            }else if(imageName.equals("opposition")){
                newsImage.setImageResource(R.drawable.oposition);
                title.setText(titlex);

            }else if(imageName.equals("brandix")){
                newsImage.setImageResource(R.drawable.brandix);
                title.setText(titlex);

            }else if(imageName.equals("police")){
                newsImage.setImageResource(R.drawable.police1);
                title.setText(titlex);
            }

        }else if (page.equals( "foreignNews" )){ //for Foreign news

            if(imageName.equals("trumpt")){
                newsImage.setImageResource(R.drawable.trumpt);
                title.setText(titlex);

            }else if(imageName.equals("Greece")){
                newsImage.setImageResource(R.drawable.gree);
                title.setText(titlex);

            }else if(imageName.equals("fire")){
                newsImage.setImageResource(R.drawable.fire);
                title.setText(titlex);

            }else if(imageName.equals("modhi")){
                newsImage.setImageResource(R.drawable.modhi);
                title.setText(titlex);
            }


        }else if (page.equals( "hotNews" )){//zoysa condtion eka damma adow

            if(imageName.equals("brandix")){
                newsImage.setImageResource(R.drawable.brandix);
                title.setText(titlex);
            }
//
            if(imageName.equals("brandix")){
                newsImage.setImageResource(R.drawable.brandix);
                title.setText(titlex);
            }
            if(imageName.equals("stds")){
                newsImage.setImageResource(R.drawable.stds);
                title.setText(titlex);
            }
            if(imageName.equals("police")){
                newsImage.setImageResource(R.mipmap.police);
                title.setText(titlex);
            }
            if(imageName.equals("sha")){
                newsImage.setImageResource(R.drawable.sha);
                title.setText(titlex);
            }
        }




        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newsViewActivity.this, VideoViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
