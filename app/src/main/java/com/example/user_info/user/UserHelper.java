package com.example.user_info.user;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class UserHelper {

    public static User buildUser(TextInputLayout name, TextInputLayout email,
                                 TextInputLayout phoneNumber, TextInputLayout birthday,
                                 TextInputLayout height){
        User user = new User();
        user.setName(Objects.requireNonNull(name.getEditText()).getText().toString());
        user.setBirthday(Objects.requireNonNull(birthday.getEditText()).getText().toString());
        user.setEmail(Objects.requireNonNull(email.getEditText()).getText().toString());
        user.setPhoneNumber(Objects.requireNonNull(phoneNumber.getEditText()).getText().toString());
        user.setHeight(Objects.requireNonNull(height.getEditText()).getText().toString());
        return user;
    }
}
