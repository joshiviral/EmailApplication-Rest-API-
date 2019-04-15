package com.example.emailapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class EmailHandler extends AppCompatActivity {

    EditText etx_Name;
    EditText etx_Subject;
    EditText etx_Message;
    Button btn_send;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_layout);

        etx_Name = findViewById(R.id.etx_name);
        etx_Subject = findViewById(R.id.etx_subject);
        etx_Message = findViewById(R.id.etx_message);
        btn_send = findViewById(R.id.btn_send);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
    }

    public void sendMail() {
        Intent it = new Intent(Intent.ACTION_SEND);
        it.putExtra(Intent.EXTRA_EMAIL, new String[]{etx_Name.getText().toString()});
        it.putExtra(Intent.EXTRA_SUBJECT,etx_Message.getText().toString());
        it.putExtra(Intent.EXTRA_TEXT,etx_Message.getText());
        it.setType("message/rfc822");
        startActivity(Intent.createChooser(it,"Choose Mail App"));
    }
}