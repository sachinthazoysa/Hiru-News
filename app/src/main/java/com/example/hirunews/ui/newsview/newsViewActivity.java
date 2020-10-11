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
        }else if (page.equals( "localNews" )){

            if(imageName.equals("quarantine")){
                newsImage.setImageResource(R.drawable.local1);
                title.setText(titlex);
            }
//
            if(imageName.equals("train")){
                newsImage.setImageResource(R.drawable.local2);
                title.setText(titlex);
            }
            if(imageName.equals("posting")){
                newsImage.setImageResource(R.drawable.local3);
                title.setText(titlex);
            }
            if(imageName.equals("race")){
                newsImage.setImageResource(R.drawable.local4);
                title.setText(titlex);
            }
            if(imageName.equals("purchase")){
                newsImage.setImageResource(R.drawable.local5);
                title.setText(titlex);
            }
        }else if (page.equals( "sportNews" )){

            if(imageName.equals("Premier")){
                newsImage.setImageResource(R.drawable.lpl);
                title.setText(titlex);
            }
//
            if(imageName.equals("tour")){
                newsImage.setImageResource(R.drawable.ban);
                title.setText(titlex);
            }
            if(imageName.equals("record")){
                newsImage.setImageResource(R.drawable.rcb);
                title.setText(titlex);
            }
            if(imageName.equals("employees")){
                newsImage.setImageResource(R.drawable.icc);
                title.setText(titlex);
            }
            if(imageName.equals("sprinter")){
                newsImage.setImageResource(R.drawable.yup);
                title.setText(titlex);
            }
        }else if(page.equals("CIA")){
            newsImage.setImageResource(R.drawable.cia);
            title.setText(titlex);
        }else if(page.equals("Biz")){
            if(imageName.equals("nobel")){
                newsImage.setImageResource(R.drawable.nobel);
            }
            if(imageName.equals("toyota")){
                newsImage.setImageResource(R.drawable.toyota);
            }
            if(imageName.equals("brandix")){
                newsImage.setImageResource(R.drawable.brandix);
            }
            title.setText(titlex);
        }


        playButton.setImageResource(R.drawable.play_ic);
        playButton.setVisibility(View.VISIBLE);


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newsViewActivity.this, VideoViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
