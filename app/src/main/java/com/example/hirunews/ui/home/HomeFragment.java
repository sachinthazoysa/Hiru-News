package com.example.hirunews.ui.home;

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
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hirunews.R;
import com.example.hirunews.ui.categories.BreakingNewsFragment;
import com.example.hirunews.ui.categories.HotNewsFragment;
import com.example.hirunews.ui.categories.SportsFragment;
import com.example.hirunews.ui.newsview.newsViewActivity;

public class HomeFragment extends Fragment {

    ImageView imageView,imageView2,imageView3,imageView4,cur1,cur2,cur3,cur4,cur5;
    private HomeViewModel homeViewModel;
    LinearLayout today_news_1, today_news_2, today_news_3, today_news_4;
    Intent intent1;
    TextView title;
    TextView hotNews;

    LinearLayout  breakingImg, sportsImg;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Animation animation2 = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.move_animation);
        Animation animation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.top_animation_2);
        Animation repeatanimation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.repeat_move_animation);

        intent1 = new Intent(getActivity(), newsViewActivity.class);

        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        breakingImg = root.findViewById(R.id.breakingimage);
        breakingImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Clicked Breaking News", Toast.LENGTH_SHORT).show();
                Fragment fragment = new BreakingNewsFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(((ViewGroup)getView().getParent()).getId(), fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        sportsImg = root.findViewById(R.id.sportsimage);
        sportsImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Clicked Sports News", Toast.LENGTH_SHORT).show();
                Fragment fragment = new SportsFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(((ViewGroup)getView().getParent()).getId(), fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        hotNews = root.findViewById(R.id.hotnews);
        imageView = root.findViewById(R.id.newsImage);
        imageView2 = root.findViewById(R.id.newsImage2);
        imageView3 = root.findViewById(R.id.newsImage3);
        imageView4 = root.findViewById(R.id.newsImage4);
        cur1 = root.findViewById(R.id.cur1);
        cur2 = root.findViewById(R.id.cur2);
        cur3 = root.findViewById(R.id.cur3);
        cur4 = root.findViewById(R.id.cur4);
        cur5 = root.findViewById(R.id.cur5);

        cur1.startAnimation(repeatanimation);
        cur2.startAnimation(repeatanimation);
        cur3.startAnimation(repeatanimation);
        cur4.startAnimation(repeatanimation);
        cur5.startAnimation(repeatanimation);

        today_news_1 = root.findViewById( R.id.today_news_1 );
        today_news_2 = root.findViewById( R.id.today_news_2 );
        today_news_3 = root.findViewById( R.id.today_news_3 );
//        today_news_4 = root.findViewById( R.id.today_news_4 );


        today_news_1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Today News 1", Toast.LENGTH_SHORT).show();
                intent1.putExtra("page", "localNews" );
                intent1.putExtra("imageName", "quarantine" );
                intent1.putExtra("title","‘If you fail to move to quarantine, your property will be confiscated’ – DIG Ajith Rohana");
                startActivity(intent1);
            }
        } );

        today_news_2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Today News 2", Toast.LENGTH_SHORT).show();
                intent1.putExtra("page", "localNews" );
                intent1.putExtra("imageName", "train" );
                intent1.putExtra("title","Train operations to areas under quarantine curfew, suspended");
                startActivity(intent1);
            }
        } );


        today_news_3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Today News 3", Toast.LENGTH_SHORT).show();
                intent1.putExtra("page", "localNews" );
                intent1.putExtra("imageName", "posting" );
                intent1.putExtra("title","18 year old arrested for posting false information on curfew");
                startActivity(intent1);
            }
        } );


//        today_news_4.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(), "Today News 4", Toast.LENGTH_SHORT).show();
//                intent1.putExtra("page", "breakingNews" );
//                intent1.putExtra("imageName", "police" );
//                intent1.putExtra("title","UPDATE: Another Quarantine order issued for all Minuwangoda Brandix workers");
//                startActivity(intent1);
//            }
//        } );

        imageView.setAnimation(animation2);
        imageView.animate();


        imageView2.setAnimation(animation2);
        imageView2.animate();

        imageView3.setAnimation(animation2);
        imageView3.animate();

        imageView4.setAnimation(animation2);
        imageView4.animate();

        breakingImg.setAnimation(animation);
        breakingImg.animate();

        sportsImg.setAnimation(animation);
        sportsImg.animate();

        animation2.start();
        animation.start();

        hotNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new HotNewsFragment();
            }
        });


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), newsViewActivity.class);
                intent.putExtra("imageName", "brandix" );
                intent.putExtra("title","COVID-19: Minuwangoda cluster tops 1,000 mark with 190 more cases");
                intent.putExtra("page","hotNews");
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), newsViewActivity.class);
                intent.putExtra("imageName", "stds" );
                intent.putExtra("title","Grade 05 Scholarship and A/L exams NOT postponed");
                intent.putExtra("page","hotNews");
                startActivity(intent);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), newsViewActivity.class);
                intent.putExtra("imageName", "police" );
                intent.putExtra("title","Quarantine curfew in Seeduwa police area");
                intent.putExtra("page","hotNews");
                startActivity(intent);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), newsViewActivity.class);
                intent.putExtra("imageName", "sha" );
                intent.putExtra("title","Army Chief explains reason behind police curfews");
                intent.putExtra("page","hotNews");
                startActivity(intent);
            }
        });

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }



//    ImageView imageView = findViewById(R.id.newsImage);
//        imageView.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new NewsViewFragment()).commit();
//        }
//    });
}
