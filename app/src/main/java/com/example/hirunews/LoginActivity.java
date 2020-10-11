package com.example.hirunews;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.FragmentManager;

import android.app.Notification;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hirunews.dialog.CodeAddDialog;
import com.example.hirunews.dialog.SubmitNewsDialog;

import static com.example.hirunews.ui.App.CHANNEL_1_ID;

public class LoginActivity extends AppCompatActivity {

    private NotificationManagerCompat notificationManager;
    EditText name, number;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = findViewById(R.id.user_name);
        number = findViewById(R.id.user_number);
        loginBtn = findViewById(R.id.login_button);
        notificationManager = NotificationManagerCompat.from(this);
    }

    public void login(View view) {
        if (name.getText().toString().equals("") && number.getText().toString().equals("")){
            Toast.makeText(LoginActivity.this, "Please insert valid details", Toast.LENGTH_SHORT).show();
        }
        else {
//            Intent intent = new Intent(LoginActivity.this, HomePage.class);
//            startActivity(intent);
//
//            String title = name.getText().toString();
//            String message = number.getText().toString();

            String title = "Code";
            String message = "4523";

            Notification notification = new NotificationCompat.Builder(this, CHANNEL_1_ID)
                    .setSmallIcon(R.drawable.ic_home)
                    .setContentTitle(title)
                    .setContentText(message)
                    .setPriority(NotificationCompat.PRIORITY_HIGH)
                    .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                    .build();
            notificationManager.notify(1, notification);

            openDialog();


        }
    }

    public void openDialog(){

//        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final View view = LayoutInflater.from(LoginActivity.this).inflate(R.layout.code_add_dialog, null);
        final EditText code = view.findViewById(R.id.code_edit);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setView(view)
                .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (code.getText().toString().equals("4523")){
                            Intent intent = new Intent(LoginActivity.this, HomePage.class);
                            startActivity(intent);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(LoginActivity.this, "Welcome "+name.getText().toString(), Toast.LENGTH_SHORT).show();
                                }
                            }, 1000);
                        }
                        else {
                            Toast.makeText(LoginActivity.this, "Please try again", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(LoginActivity.this, "Closed", Toast.LENGTH_SHORT).show();
                    }
                });


        AlertDialog alertDialog = builder.create();
        alertDialog.show();
//        CodeAddDialog codeAddDialog = new CodeAddDialog();
//        codeAddDialog.show(LoginActivity.this, "example");
    }
}
