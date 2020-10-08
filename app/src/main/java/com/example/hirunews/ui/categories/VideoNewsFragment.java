package com.example.hirunews.ui.categories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hirunews.R;

public class VideoNewsFragment extends Fragment {

    ImageView ciaNews, businessNews, politicalNews, entertainmentNews;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        View root = inflater.inflate(R.layout.fragment_video_news, container, false);

        ciaNews = root.findViewById(R.id.ciaNews);
        ciaNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "CIA News", Toast.LENGTH_SHORT).show();
            }
        });

        businessNews = root.findViewById(R.id.businessNews);
        businessNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Business News", Toast.LENGTH_SHORT).show();
            }
        });

        politicalNews = root.findViewById(R.id.politicalNews);
        politicalNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Political News", Toast.LENGTH_SHORT).show();
            }
        });

        entertainmentNews = root.findViewById(R.id.entertainmentNews);
        entertainmentNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Entertainment News", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}
