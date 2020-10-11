package com.example.hirunews.ui.categories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.hirunews.R;
import com.example.hirunews.ui.categories.othernews.BusinessNewsFragment;
import com.example.hirunews.ui.categories.othernews.CiaNewsFragment;
import com.example.hirunews.ui.categories.othernews.EntertainmentNewsFragment;
import com.example.hirunews.ui.categories.othernews.PoliticalNewsFragment;

public class VideoNewsFragment extends Fragment {

    ImageView ciaNews, businessNews, politicalNews, entertainmentNews;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        View root = inflater.inflate(R.layout.fragment_video_news, container, false);
        Animation animation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.top_animation_2);
        Animation animation2 = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.animation_fall_down);
        Animation animation3 = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.move_left_animation);


        textView =root.findViewById(R.id.text);
        ciaNews = root.findViewById(R.id.ciaNews);
        ciaNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "CIA News", Toast.LENGTH_SHORT).show();
                Fragment fragment = new CiaNewsFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(((ViewGroup)getView().getParent()).getId(), fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        businessNews = root.findViewById(R.id.businessNews);
        businessNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Business News", Toast.LENGTH_SHORT).show();
                Fragment fragment = new BusinessNewsFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(((ViewGroup)getView().getParent()).getId(), fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        politicalNews = root.findViewById(R.id.politicalNews);
        politicalNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Political News", Toast.LENGTH_SHORT).show();
                Fragment fragment = new PoliticalNewsFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(((ViewGroup)getView().getParent()).getId(), fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        entertainmentNews = root.findViewById(R.id.entertainmentNews);
        entertainmentNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Entertainment News", Toast.LENGTH_SHORT).show();
                Fragment fragment = new EntertainmentNewsFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(((ViewGroup)getView().getParent()).getId(), fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        ciaNews.setAnimation(animation2);
        businessNews.setAnimation(animation2);
        textView.setAnimation(animation3);
        return root;
    }
}
