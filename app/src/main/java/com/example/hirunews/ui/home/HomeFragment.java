package com.example.hirunews.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hirunews.R;
import com.example.hirunews.ui.newsview.newsViewActivity;

public class HomeFragment extends Fragment {

    ImageView imageView;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        imageView = root.findViewById(R.id.newsImage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), newsViewActivity.class);
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
