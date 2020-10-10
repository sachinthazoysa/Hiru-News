package com.example.hirunews.ui.savednews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hirunews.R;
import com.example.hirunews.ui.categories.data.DataPassing;

public class SavedNewsFragment extends Fragment {

    DataPassing dataPassing = new DataPassing();
    LinearLayout news;
//    ImageView unSaveBtn;
    ImageView savedBtn, unSavedBtn;

    TextView title;

    private SavedNewsViewModel savedNewsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        Animation animation2 = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.move_left_animation);
        Animation animation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.top_animation);

        savedNewsViewModel =
                ViewModelProviders.of(this).get(SavedNewsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_saved_news, container, false);
        unSavedBtn = root.findViewById(R.id.unsave_btn);
        savedBtn=root.findViewById(R.id.save_btn);
        news = root.findViewById(R.id.saved_news_1);
        title =root.findViewById(R.id.saved_news_title);
        title.startAnimation(animation);

//        final TextView textView = root.findViewById(R.id.text_slideshow);
//        savedNewsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        int s = dataPassing.getSaveStatus();

        if(s == 0){
            news.setVisibility(View.INVISIBLE);
        }else{
            news.setVisibility(View.VISIBLE);
        }


        if(dataPassing.getSaveStatus() == 0){
            savedBtn.setVisibility(View.INVISIBLE);
            unSavedBtn.setVisibility(View.VISIBLE);
        }else if (dataPassing.getSaveStatus() == 1){
            savedBtn.setVisibility(View.VISIBLE);
            unSavedBtn.setVisibility(View.INVISIBLE);
        }

        savedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    savedBtn.setVisibility(View.INVISIBLE);
                    unSavedBtn.setVisibility(View.VISIBLE);
                    dataPassing.setSaveStatus(0);
                    news.setVisibility(View.INVISIBLE);
            }
        });



        return root;

    }
}
