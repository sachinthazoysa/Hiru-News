package com.example.hirunews.ui.categories;

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

import com.example.hirunews.R;
import com.example.hirunews.dialog.SubmitNewsDialog;
import com.example.hirunews.ui.newsview.newsViewActivity;

public class MyNewsFragment extends Fragment {
    LinearLayout my_news_1, my_news_2, my_news_3;
//    TextView submit_news_btn;
    LinearLayout submit_news_btn;
    Intent intent;
    TextView title;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        intent = new Intent(getActivity(), newsViewActivity.class);
        Animation animation2 = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.move_left_animation);
        Animation animation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.top_animation);

        View root = inflater.inflate(R.layout.fragment_my_news, container, false);
        title =root.findViewById(R.id.my_news_title);
        title.startAnimation(animation);

        submit_news_btn = root.findViewById(R.id.submit_news_btn);
        submit_news_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Submit new Button Clicked", Toast.LENGTH_SHORT).show();
                openDialog();

            }
        });

        my_news_1 = root.findViewById( R.id.my_news_1);
        my_news_1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("page", "myNews" );
                intent.putExtra("imageName", "accident" );
                intent.putExtra("title","3 accidents near the Wariyapola Town in past 24 Hours");
                startActivity(intent);
            }
        } );

        my_news_2 = root.findViewById( R.id.my_news_2);
        my_news_2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("page", "myNews" );
                intent.putExtra("imageName", "bookfair" );
                intent.putExtra("title","Starting date of the CODE_4 Book Fair");
                startActivity(intent);
            }
        } );

        my_news_3 = root.findViewById( R.id.my_news_3);
        my_news_3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("page", "myNews" );
                intent.putExtra("imageName", "opening" );
                intent.putExtra("title","New opening ceremony of the Code_4 software Company");
                startActivity(intent);
            }
        } );

        return root;
    }

    public void openDialog(){
        SubmitNewsDialog submitNewsDialog = new SubmitNewsDialog();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        submitNewsDialog.show(fragmentManager, "example");
    }
}
