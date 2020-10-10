package com.example.hirunews.ui.categories.othernews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hirunews.R;

public class PoliticalNewsFragment extends Fragment {

    LinearLayout political_news_1, political_news_2, political_news_3, political_news_4, political_news_5, political_news_6, political_news_7;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        View root = inflater.inflate(R.layout.fragment_political_news, container, false);

        political_news_1 = root.findViewById(R.id.political_news_1);
        political_news_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        political_news_2 = root.findViewById(R.id.political_news_2);
        political_news_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        political_news_3 = root.findViewById(R.id.political_news_3);
        political_news_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        political_news_4 = root.findViewById(R.id.political_news_4);
        political_news_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        political_news_5 = root.findViewById(R.id.political_news_5);
        political_news_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        political_news_6 = root.findViewById(R.id.political_news_6);
        political_news_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        political_news_7 = root.findViewById(R.id.political_news_7);
        political_news_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return root;
    }
}
