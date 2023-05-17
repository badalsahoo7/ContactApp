package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;


public class MainActivity extends AppCompatActivity {

    // defines objects for edit text and button
EditText editTextPhone;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // getting instance of edit text and button
        editTextPhone=(EditText) findViewById(R.id.editTextPhone);
        button=(Button) findViewById(R.id.button);
        // attach set on click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // getting phone number from edit text and changing it to String
                String phone_number =  editTextPhone.getText().toString();
                Intent phone_intent = new Intent(Intent.ACTION_CALL);
                phone_intent.setData(Uri.parse("tel:" + phone_number));
                startActivity(phone_intent);
            }
        });

    }
}