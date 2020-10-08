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

import org.w3c.dom.Text;

public class SportsFragment extends Fragment {

    LinearLayout sport_news_1, sport_news_2, sport_news_3, sport_news_4, sport_news_5;
    TextView title;
    Intent intent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        intent = new Intent(getActivity(), newsViewActivity.class);
        Animation animation2 = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.move_left_animation);
        Animation animation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.top_animation);

        View root = inflater.inflate(R.layout.fragment_sports, container, false);
        title =root.findViewById(R.id.hot_news_title);
        title.startAnimation(animation);

        sport_news_1 = root.findViewById(R.id.sport_news_1);
        sport_news_1.setAnimation(animation2);
        sport_news_1.animate();
        animation2.start();
        sport_news_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sports News 1", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "sportNews" );
                intent.putExtra("imageName", "Premier" );
                intent.putExtra("title","Lanka Premier League’s start pushed back");
                startActivity(intent);
            }
        });
        sport_news_2 = root.findViewById(R.id.sport_news_2);
        sport_news_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sports News 2", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "sportNews" );
                intent.putExtra("imageName", "tour" );
                intent.putExtra("title","Bangladesh tour of Sri Lanka postponed again");
                startActivity(intent);
            }
        });

        sport_news_3 = root.findViewById(R.id.sport_news_3);
        sport_news_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sports News 3", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "sportNews" );
                intent.putExtra("imageName", "record" );
                intent.putExtra("title","Royals complete record IPL run chase with Tewatia’s six spree");
                startActivity(intent);

            }
        });

        sport_news_4 = root.findViewById(R.id.sport_news_4);
        sport_news_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sports News 4", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "sportNews" );
                intent.putExtra("imageName", "employees" );
                intent.putExtra("title","COVID-19 hits ICC HQ in Dubai, employees to work from home");
                startActivity(intent);
            }
        });

        sport_news_5 = root.findViewById(R.id.sport_news_5);
        sport_news_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sports News 5", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "sportNews" );
                intent.putExtra("imageName", "sprinter" );
                intent.putExtra("title","Sprinter Yupun Abeykoon sets new record in Germany");
                startActivity(intent);
            }
        });

        return root;
    }
}
