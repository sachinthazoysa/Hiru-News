package com.example.hirunews.ui.categories.othernews;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hirunews.R;
import com.example.hirunews.ui.newsview.newsViewActivity;

public class BusinessNewsFragment extends Fragment {
    Intent intent;

    LinearLayout business_news_1, business_news_2, business_news_3, business_news_4, business_news_5, business_news_6, business_news_7;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        intent = new Intent(getActivity(), newsViewActivity.class);

        View root = inflater.inflate(R.layout.fragment_business_news, container, false);
        Animation animation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.top_animation_2);



        business_news_1 = root.findViewById(R.id.business_news_1);
        business_news_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("page", "Biz" );
                intent.putExtra("imageName", "nobel" );
                intent.putExtra("title","World Food Programme awarded Nobel Peace Prize");
                startActivity(intent);
            }
        });

        business_news_2 = root.findViewById(R.id.business_news_2);
        business_news_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("page", "Biz" );
                intent.putExtra("imageName", "toyota" );
                intent.putExtra("title","Toyota to establish assembly plant in Sri Lanka?");
                startActivity(intent);
            }
        });

        business_news_3 = root.findViewById(R.id.business_news_3);
        business_news_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("page", "Biz" );
                intent.putExtra("imageName", "brandix" );
                intent.putExtra("title","Brandix says no party from India or any other country had access to Minuwangoda facility");
                startActivity(intent);
            }
        });

        business_news_1.setAnimation(animation);
        business_news_1.animate();
        animation.start();

        business_news_2.setAnimation(animation);
        business_news_2.animate();
        animation.start();

        business_news_3.setAnimation(animation);
        business_news_3.animate();
        animation.start();

        return root;
    }
}
