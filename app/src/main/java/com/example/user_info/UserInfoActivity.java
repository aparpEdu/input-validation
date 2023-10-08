package com.example.user_info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.user_info.user.User;

public class UserInfoActivity extends AppCompatActivity {

    TextView name, email, birthday, phone, height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        name = findViewById(R.id.textView);
        email = findViewById(R.id.textView2);
        birthday = findViewById(R.id.textView3);
        phone = findViewById(R.id.textView4);
        height = findViewById(R.id.textView5);

        Intent intent = getIntent();
        User user = (User) intent.getSerializableExtra("user");
        assert user != null;
        name.setText(user.getName());
        email.setText(user.getEmail());
        birthday.setText(user.getBirthday());
        phone.setText(user.getPhoneNumber());
        height.setText(user.getHeight());
    }
}