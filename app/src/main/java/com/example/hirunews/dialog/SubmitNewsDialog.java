package com.example.hirunews.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.hirunews.R;
import com.example.hirunews.ui.categories.MyNewsFragment;

import static android.app.Activity.RESULT_OK;

public class SubmitNewsDialog extends AppCompatDialogFragment {

    Button submitBtn;
    ImageView addImageBtn;
    ImageView captured_image_1, captured_image_2, captured_image_3;

    private static  final int galleryPick = 1;
    private Uri imageUri;

    int image1 = 0, image2 = 0, image3 = 0;

    MyNewsFragment myNewsFragment = new MyNewsFragment();


    public SubmitNewsDialog() {

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
//        return super.onCreateDialog(savedInstanceState);

//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        LayoutInflater inflater = getActivity().getLayoutInflater();
//        View view = inflater.inflate(R.layout.submit_news_form, null);

        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        final View view = inflater.inflate(R.layout.submit_news_form, null);



//        submitBtn = view.findViewById(R.id.submitBtn);
//        submitBtn.setOnClickListener();
//        submitBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(), "Button Clicked", Toast.LENGTH_SHORT).show();
//                builder.dismiss();
//
//            }
//        });

        captured_image_1 = view.findViewById(R.id.captured_image_1);
        captured_image_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Opened", Toast.LENGTH_SHORT).show();
                image1 = 1;
                image2 = 0;
                image3 = 0;
                openGallery();
            }
        });

        captured_image_2 = view.findViewById(R.id.captured_image_2);
        captured_image_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Opened", Toast.LENGTH_SHORT).show();
                image2 = 1;
                image3 = 0;
                image1 = 0;
                openGallery();
            }
        });

        captured_image_3 = view.findViewById(R.id.captured_image_3);
        captured_image_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Opened", Toast.LENGTH_SHORT).show();
                image3 = 1;
                image1 = 0;
                image2 = 0;
                openGallery();
            }
        });

        builder.setView(view)
                .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Done", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Closed", Toast.LENGTH_SHORT).show();
                    }
                });

        return builder.create();
    }

    //Open gallery to choose an image
    private void openGallery() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent, galleryPick);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==galleryPick && resultCode==RESULT_OK && data!=null) {
            imageUri = data.getData();
            if (image1 == 1){
                captured_image_1.setImageURI(imageUri);
            }
            else if (image2 == 1){
                captured_image_2.setImageURI(imageUri);
            }
            else if (image3 == 1){
                captured_image_3.setImageURI(imageUri);
            }
            else {
                Log.e("Error", "Something went wrong");
            }
        }
    }

}
