package com.example.hirunews.ui.categories;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hirunews.R;
import com.example.hirunews.ui.newsview.newsViewActivity;

public class HotNewsFragment extends Fragment {
    Animation BottomAnim;
        LinearLayout hot_news_1, hot_news_2, hot_news_3, hot_news_4, hot_news_5;
        Intent intent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        intent = new Intent(getActivity(), newsViewActivity.class);


        View root = inflater.inflate(R.layout.fragment_hot_news, container, false);

        hot_news_1 = root.findViewById(R.id.hot_news_1);
        hot_news_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("imageName", "brandix" );
                intent.putExtra("title","COVID-19: Minuwangoda cluster tops 1,000 mark with 190 more cases");
                startActivity(intent);
            }
        });

        hot_news_2 = root.findViewById(R.id.hot_news_2);
        hot_news_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hot News 2", Toast.LENGTH_SHORT).show();
                intent.putExtra("imageName", "stds" );
                intent.putExtra("title","Grade 05 Scholarship and A/L exams NOT postponed");
                startActivity(intent);
            }
        });

        hot_news_3 = root.findViewById(R.id.hot_news_3);
        hot_news_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hot News 3", Toast.LENGTH_SHORT).show();
                intent.putExtra("imageName", "police" );
                intent.putExtra("title","Quarantine curfew in Seeduwa police area");
                startActivity(intent);

            }
        });

        hot_news_4 = root.findViewById(R.id.hot_news_4);
        hot_news_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hot News 4", Toast.LENGTH_SHORT).show();
                intent.putExtra("imageName", "sha" );
                intent.putExtra("title","Army Chief explains reason behind police curfews");
                startActivity(intent);
            }
        });



        return root;
    }
}
