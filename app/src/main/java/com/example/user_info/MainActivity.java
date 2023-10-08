package com.example.user_info;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import com.example.user_info.fragment.DatePickerFragment;
import com.example.user_info.user.User;
import com.example.user_info.user.UserHelper;
import com.example.user_info.validation.Validation;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout name;
    TextInputLayout email;
    TextInputLayout phone;
    TextInputLayout birthday;
    TextInputLayout height;
    Button button;
    Button button1;

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
        button1 = findViewById(R.id.dateBtn);
        DialogFragment fragment = new DatePickerFragment();
        button1.setOnClickListener(view -> fragment
                .show(getSupportFragmentManager(), "Select birthday"));

       button.setOnClickListener(view -> {
          if (Validation
                   .validateInput(name, email, phone, birthday, height)) {
              Intent intent = new Intent(this, UserInfoActivity.class);
              User user = UserHelper.buildUser(name, email, phone, birthday, height);
              intent.putExtra("user", user);
              startActivity(intent);
          }
       });
    }
}