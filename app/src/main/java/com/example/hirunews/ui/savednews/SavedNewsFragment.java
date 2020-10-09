package com.example.hirunews.ui.savednews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hirunews.R;

public class SavedNewsFragment extends Fragment {

    TextView title;

    private SavedNewsViewModel savedNewsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        Animation animation2 = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.move_left_animation);
        Animation animation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.top_animation);

        savedNewsViewModel =
                ViewModelProviders.of(this).get(SavedNewsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_saved_news, container, false);

        title =root.findViewById(R.id.saved_news_title);
        title.startAnimation(animation);

//        final TextView textView = root.findViewById(R.id.text_slideshow);
//        savedNewsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}
