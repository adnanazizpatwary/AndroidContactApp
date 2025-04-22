package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mlistview;
    private ArrayList<ContactPerson> persons;
    private ContactPerson contactPeople;
    private personAdapter personadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        mlistview = (ListView) findViewById(R.id.mylistview);
        contactPeople = new ContactPerson();
        persons = contactPeople.getAllperson();
        personadapter = new personAdapter(this,persons);
        mlistview.setAdapter(personadapter);
        mlistview.setOnItemClickListener
                (new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(
                    AdapterView<?> parent, View view,
                    int position, long id) {
                ContactPerson person = persons.get(position);
//               String name=
//                       persons.get(position).getPersonName();
//                Intent intent;
//                intent = new Intent(MainActivity.this,second.class);
//                intent.putExtra("name",name);
//                startActivity(intent);
                Intent intent = new Intent(MainActivity.this, second.class);
                intent.putExtra("person",person);
                startActivity(intent);


            }
        });


    }
}