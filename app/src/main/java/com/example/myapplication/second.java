package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.Serializable;

public class second extends AppCompatActivity {
    private TextView nameTv;
    private  TextView phoneTv;
    private  TextView welcomeTv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        welcomeTv = findViewById(R.id.wmsg);
        nameTv = findViewById(R.id.showname);
        phoneTv = findViewById(R.id.showphone);

//        String name=getIntent().getStringExtra("name");
//        nameTv.setText(name);
        ContactPerson person = (ContactPerson) getIntent().getSerializableExtra("person");
        String name = person.getPersonName();
        String phone = person.getPhoneNumber();
        welcomeTv.setText("Welcome Mr./mrs. "+name);
        nameTv.setText(name);
        phoneTv.setText(phone);




    }
}