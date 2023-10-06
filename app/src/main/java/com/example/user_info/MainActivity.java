package com.example.user_info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.user_info.validation.Validation;
import com.example.user_info.validation.ValidationHelper;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout name;
    TextInputLayout email;
    TextInputLayout phone;
    TextInputLayout birthday;
    TextInputLayout height;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.text_input_layout);
        email = findViewById(R.id.textInputLayout);
        phone = findViewById(R.id.textInputLayout2);
        birthday = findViewById(R.id.textInputLayout3);
        height = findViewById(R.id.textInputLayout4);
        button = findViewById(R.id.button);
        button.setOnClickListener(view ->  Validation
                .validateInput(name, email, phone, birthday, height, getApplicationContext()));

    }
}