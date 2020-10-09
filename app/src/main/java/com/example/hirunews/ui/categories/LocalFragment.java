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

public class LocalFragment extends Fragment {

    LinearLayout local_news_1, local_news_2, local_news_3, local_news_4, local_news_5;
    TextView title;
    Intent intent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        intent = new Intent(getActivity(), newsViewActivity.class);
        Animation animation2 = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.move_left_animation);
        Animation animation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.top_animation);

        View root = inflater.inflate(R.layout.fragment_local, container, false);
        title =root.findViewById(R.id.local_news_title);
        title.startAnimation(animation);

        local_news_1 = root.findViewById(R.id.local_news_1);
        local_news_1.setAnimation(animation2);
        local_news_1.animate();
        animation2.start();


        local_news_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Local News 1", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "localNews" );
                intent.putExtra("imageName", "quarantine" );
                intent.putExtra("title","‘If you fail to move to quarantine, your property will be confiscated’ – DIG Ajith Rohana");
                startActivity(intent);
            }
        });

        local_news_2 = root.findViewById(R.id.local_news_2);
        local_news_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Local News 2", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "localNews" );
                intent.putExtra("imageName", "train" );
                intent.putExtra("title","Train operations to areas under quarantine curfew, suspended");
                startActivity(intent);
            }
        });

        local_news_3 = root.findViewById(R.id.local_news_3);
        local_news_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Local News 3", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "localNews" );
                intent.putExtra("imageName", "posting" );
                intent.putExtra("title","18 year old arrested for posting false information on curfew");
                startActivity(intent);
            }
        });

        local_news_4 = root.findViewById(R.id.local_news_4);
        local_news_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Local News 4", Toast.LENGTH_SHORT).show();
                intent.putExtra("page", "localNews" );
                intent.putExtra("imageName", "race" );
                intent.putExtra("title","Artillery and Women Corps win overall championships at Army Road Race – 2020");
                startActivity(intent);
            }
        });

//        local_news_5 = root.findViewById(R.id.local_news_5);
//        local_news_5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(), "Local News 5", Toast.LENGTH_SHORT).show();
//                intent.putExtra("page", "localNews" );
//                intent.putExtra("imageName", "purchase" );
//                intent.putExtra("title","Permit holders can purchase new vehicles in SL using concessions in permit (Circular Attached)");
//                startActivity(intent);
//            }
//        });
        return root;
    }
}
