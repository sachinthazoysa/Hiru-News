package com.example.hirunews.ui.submitnews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hirunews.R;

public class SubmitNewsFragment extends Fragment {

    private SubmitNewsViewModel submitNewsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        submitNewsViewModel =
                ViewModelProviders.of(this).get(SubmitNewsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_submit_news, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        submitNewsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
