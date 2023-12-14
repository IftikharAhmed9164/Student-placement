package com.example.student_placement.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.example.student_placement.R;

public class AddNotification extends AppCompatActivity {

    String[] item = {"Material", "Design", "Components", "Android", "5.0 Lollipop"};
    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notification);

        autoCompleteTextView=findViewById(R.id.Select_Notification_Category);
        adapterItems = new ArrayAdapter<String>(this,R.layout.activity_add_notification,item);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item  = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(AddNotification.this,"Item: "+item,Toast.LENGTH_SHORT).show();
            }
        });
    }
}