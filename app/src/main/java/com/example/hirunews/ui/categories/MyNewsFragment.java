package com.example.hirunews.ui.categories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.hirunews.R;
import com.example.hirunews.dialog.SubmitNewsDialog;

public class MyNewsFragment extends Fragment {

    TextView submit_news_btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        View root = inflater.inflate(R.layout.fragment_my_news, container, false);

        submit_news_btn = root.findViewById(R.id.submit_news_btn);
        submit_news_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Submit new Button Clicked", Toast.LENGTH_SHORT).show();
                openDialog();

            }
        });
        return root;
    }

    public void openDialog(){
        SubmitNewsDialog submitNewsDialog = new SubmitNewsDialog();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        submitNewsDialog.show(fragmentManager, "example");
    }
}
