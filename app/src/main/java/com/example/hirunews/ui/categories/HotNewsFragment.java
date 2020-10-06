package com.example.hirunews.ui.categories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hirunews.R;

public class HotNewsFragment extends Fragment {

    LinearLayout hot_news_1, hot_news_2, hot_news_3, hot_news_4, hot_news_5;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        View root = inflater.inflate(R.layout.fragment_hot_news, container, false);

        hot_news_1 = root.findViewById(R.id.hot_news_1);
        hot_news_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hot News 1", Toast.LENGTH_SHORT).show();
            }
        });

        hot_news_2 = root.findViewById(R.id.hot_news_2);
        hot_news_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hot News 2", Toast.LENGTH_SHORT).show();
            }
        });

        hot_news_3 = root.findViewById(R.id.hot_news_3);
        hot_news_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hot News 3", Toast.LENGTH_SHORT).show();
            }
        });

        hot_news_4 = root.findViewById(R.id.hot_news_4);
        hot_news_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hot News 4", Toast.LENGTH_SHORT).show();
            }
        });

        hot_news_5 = root.findViewById(R.id.hot_news_5);
        hot_news_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hot News 5", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}
