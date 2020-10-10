package com.example.hirunews.ui.categories.othernews;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hirunews.R;
import com.example.hirunews.ui.newsview.newsViewActivity;

public class CiaNewsFragment extends Fragment {

    LinearLayout cia_news_1, cia_news_10, cia_news_9, cia_news_8, cia_news_5, cia_news_6, cia_news_7;
    Intent intent;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        intent = new Intent(getActivity(), newsViewActivity.class);

        View root = inflater.inflate(R.layout.fragment_cia_news, container, false);

        cia_news_5 = root.findViewById(R.id.cia_news_5);
        cia_news_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("page", "CIA" );
                intent.putExtra("imageName", "cia" );
                intent.putExtra("title","HIRU CIA | 2020/10/10");
                startActivity(intent);
            }
        });

        cia_news_6 = root.findViewById(R.id.cia_news_6);
        cia_news_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("page", "CIA" );
                intent.putExtra("imageName", "cia" );

                intent.putExtra("title","HIRU CIA | 2020/10/9");
                startActivity(intent);
            }
        });

        cia_news_7 = root.findViewById(R.id.cia_news_7);
        cia_news_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("page", "CIA" );
                intent.putExtra("imageName", "cia" );

                intent.putExtra("title","HIRU CIA | 2020/10/8");
                startActivity(intent);
            }
        });

        cia_news_8 = root.findViewById(R.id.cia_news_8);
        cia_news_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("page", "CIA" );
                intent.putExtra("imageName", "cia" );

                intent.putExtra("title","HIRU CIA | 2020/10/7");
                startActivity(intent);
            }
        });



        cia_news_9 = root.findViewById(R.id.cia_news_9);
        cia_news_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("page", "CIA" );
                intent.putExtra("imageName", "cia" );

                intent.putExtra("title","HIRU CIA | 2020/10/6");
                startActivity(intent);
            }
        });



        cia_news_10 = root.findViewById(R.id.cia_news_10);
        cia_news_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("page", "CIA" );
                intent.putExtra("imageName", "cia" );

                intent.putExtra("title","HIRU CIA | 2020/10/5");
                startActivity(intent);
            }
        });

        return root;
    }

}
