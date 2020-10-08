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

public class BreakingNewsFragment extends Fragment {

    LinearLayout breaking_news_1, breaking_news_2, breaking_news_3, breaking_news_4;
    Intent intent;
    TextView title;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        intent = new Intent(getActivity(), newsViewActivity.class);
        Animation animation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.top_animation);
        Animation animation2 = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.move_left_animation);

        View root = inflater.inflate(R.layout.fragment_breaking_news, container, false);


        title =root.findViewById(R.id.hot_news_title);
        title.startAnimation(animation);

        breaking_news_1 = root.findViewById(R.id.breaking_news_1);
        breaking_news_1.setAnimation(animation2);
        breaking_news_1.animate();
        animation2.start();
        breaking_news_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Breaking News 1", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "breakingNews" );
                intent.putExtra("imageName", "accident" );
                intent.putExtra("title","5 accidents around Sri Lanka in past 24 Hours");
                startActivity(intent);
            }
        });

        breaking_news_2 = root.findViewById(R.id.breaking_news_2);
        breaking_news_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Breaking News 2", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "breakingNews" );
                intent.putExtra("imageName", "opposition" );
                intent.putExtra("title","Opposition seeks two-day debate on COVID-19");
                startActivity(intent);
            }
        });

        breaking_news_3 = root.findViewById(R.id.breaking_news_3);
        breaking_news_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Breaking News 3", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "breakingNews" );
                intent.putExtra("imageName", "brandix" );
                intent.putExtra("title","Brandix says no party from India or any other country had access to Minuwangoda facility");
                startActivity(intent);
            }
        });

        breaking_news_4 = root.findViewById(R.id.breaking_news_4);
        breaking_news_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Breaking News 4", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "breakingNews" );
                intent.putExtra("imageName", "police" );
                intent.putExtra("title","UPDATE: Another Quarantine order issued for all Minuwangoda Brandix workers");
                startActivity(intent);
            }
        });



        return root;
    }
}
