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

public class ForeignFragment extends Fragment {

    LinearLayout foreign_news_1, foreign_news_2, foreign_news_3, foreign_news_4;
    Intent intent;
    TextView title;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        intent = new Intent(getActivity(), newsViewActivity.class);
        Animation animation2 = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.move_left_animation);
        Animation animation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.top_animation);

        View root = inflater.inflate(R.layout.fragment_foreign, container, false);
        title=root.findViewById(R.id.hot_news_title);
        title.startAnimation(animation);

        foreign_news_1 = root.findViewById(R.id.foreign_news_1);

        foreign_news_1.setAnimation(animation2);
        foreign_news_1.animate();
        animation2.start();

        foreign_news_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Foreign News 1", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "foreignNews" );
                intent.putExtra("imageName", "trumpt" );
                intent.putExtra("title","Covid: Trump free of symptoms for 24 hours, says doctor");
                startActivity(intent);
            }
        });

        foreign_news_2 = root.findViewById(R.id.foreign_news_2);
        foreign_news_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Foreign News 2", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "foreignNews" );
                intent.putExtra("imageName", "Greece" );
                intent.putExtra("title","Greece Golden Dawn: Neo-Nazi leaders guilty of running crime gang");
                startActivity(intent);
            }
        });

        foreign_news_3 = root.findViewById(R.id.foreign_news_3);
        foreign_news_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Foreign News 3", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "foreignNews" );
                intent.putExtra("imageName", "fire" );
                intent.putExtra("title","September was world's 'hottest on record'");
                startActivity(intent);
            }
        });

        foreign_news_4 = root.findViewById(R.id.foreign_news_4);
        foreign_news_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Foreign News 4", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "foreignNews" );
                intent.putExtra("imageName", "modhi" );
                intent.putExtra("title","Kamala, Kashmir and Modi's friend all on ballot in US election");
                startActivity(intent);
            }
        });



        return root;
    }
}
