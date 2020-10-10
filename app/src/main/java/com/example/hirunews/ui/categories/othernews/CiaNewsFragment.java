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

public class CiaNewsFragment extends Fragment {

    LinearLayout cia_news_1, cia_news_2, cia_news_3, cia_news_4, cia_news_5, cia_news_6, cia_news_7;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        View root = inflater.inflate(R.layout.fragment_cia_news, container, false);

        cia_news_1 = root.findViewById(R.id.cia_news_1);
        cia_news_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        cia_news_2 = root.findViewById(R.id.cia_news_2);
        cia_news_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        cia_news_3 = root.findViewById(R.id.cia_news_3);
        cia_news_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        cia_news_4 = root.findViewById(R.id.cia_news_4);
        cia_news_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        cia_news_5 = root.findViewById(R.id.cia_news_5);
        cia_news_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        cia_news_6 = root.findViewById(R.id.cia_news_6);
        cia_news_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        cia_news_7 = root.findViewById(R.id.cia_news_7);
        cia_news_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return root;
    }
}
