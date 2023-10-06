package com.example.user_info.validation;

import android.content.Context;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Validation {
    public static void validateInput(TextInputLayout name, TextInputLayout email,
                                     TextInputLayout phoneNumber, TextInputLayout birthdate,
                                     TextInputLayout height, Context context) {
        if (name.getEditText() != null) {
            String personName = name.getEditText().getText().toString();
            String[] fullName = personName.split(" ");
            if (personName.isEmpty() || personName.startsWith(" ")) {
                name.setError("Name cannot be empty");
            }
            else if(fullName[0].length() < 2 || fullName[1].length() < 2){
                name.setError("First and last name should be at least 2 characters long");
            }
        }
        if (email.getEditText() != null) {
            String personEmail = email.getEditText().getText().toString();
            if (personEmail.isEmpty() || personEmail.startsWith(" ")){
                email.setError("Email can't be empty");
            } else if (!ValidationHelper.validateEmail(personEmail)) {
                email.setError("Please provide a valid email, f.e. example@gmail.com");
            }
        }
    }
}
