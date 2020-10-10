package com.example.hirunews.ui.categories;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hirunews.MainActivity;
import com.example.hirunews.R;
import com.example.hirunews.ui.categories.data.DataPassing;
import com.example.hirunews.ui.newsview.newsViewActivity;
import com.google.firebase.auth.internal.FederatedSignInActivity;

public class HotNewsFragment extends Fragment {
    Animation BottomAnim;
        LinearLayout hot_news_1, hot_news_2, hot_news_3, hot_news_4, hot_news_5;
        Intent intent;
        TextView title;
        ImageView savedBtn, unSavedBtn;
        int checker = 0;
        DataPassing dataPassing = new DataPassing();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        intent = new Intent(getActivity(), newsViewActivity.class);
        Animation animation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.top_animation);
        Animation moveLeftAnim = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.move_left_animation);

        View root = inflater.inflate(R.layout.fragment_hot_news, container, false);

        title=root.findViewById(R.id.hot_news_title);
        title.startAnimation(animation);
        savedBtn = root.findViewById(R.id.gbtn);
        unSavedBtn=root.findViewById(R.id.sbtn);

//        savedBtn.setVisibility(View.INVISIBLE);


        if(dataPassing.getSaveStatus() == 0){
            savedBtn.setVisibility(View.INVISIBLE);
            unSavedBtn.setVisibility(View.VISIBLE);
        }else if (dataPassing.getSaveStatus() == 1){
            savedBtn.setVisibility(View.VISIBLE);
            unSavedBtn.setVisibility(View.INVISIBLE);
        }

        hot_news_1 = root.findViewById(R.id.hot_news_1);
        hot_news_1.setAnimation(moveLeftAnim);
        hot_news_1.animate();
        moveLeftAnim.start();
        hot_news_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("imageName", "brandix" );
                intent.putExtra("title","COVID-19: Minuwangoda cluster tops 1,000 mark with 190 more cases");
                intent.putExtra("page","hotNews");
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
                intent.putExtra("page","hotNews");
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
                intent.putExtra("page","hotNews");
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
                intent.putExtra("page","hotNews");
                startActivity(intent);
            }
        });

        unSavedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(dataPassing.getSaveStatus() == 0){
                    savedBtn.setVisibility(View.INVISIBLE);
                    unSavedBtn.setVisibility(View.VISIBLE);
                    dataPassing.setSaveStatus(1);

                }else if (dataPassing.getSaveStatus() == 1){
                    savedBtn.setVisibility(View.VISIBLE);
                    unSavedBtn.setVisibility(View.INVISIBLE);
                    dataPassing.setSaveStatus(0);
                }

                int s= 1;
                dataPassing.setSaveStatus(s);
            }
        });


        return root;
    }

}
