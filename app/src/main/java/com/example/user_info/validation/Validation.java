package com.example.user_info.validation;

import com.google.android.material.textfield.TextInputLayout;

public class  Validation {
    public static boolean validateInput(TextInputLayout name, TextInputLayout email,
                                     TextInputLayout phoneNumber, TextInputLayout birthdate,
                                     TextInputLayout height) {
        if (name.getEditText() != null) {
            String personName = name.getEditText().getText().toString();
            String[] fullName = personName.split(" ");
            if (personName.isEmpty() || personName.startsWith(" ")) {
                name.setError("Name cannot be empty");
                return false;
            }
            else if(fullName[0].length() < 2 || fullName[1].length() < 2){
                name.setError("First and last name should be at least 2 characters long");
                return false;
            }
        }

        if (email.getEditText() != null) {
            String personEmail = email.getEditText().getText().toString();
            if (personEmail.isEmpty() || personEmail.startsWith(" ")){
                email.setError("Email can't be empty");
                return false;
            } else if (!ValidationHelper.validateEmail(personEmail)) {
                email.setError("Please provide a valid email, f.e. example@gmail.com");
                return false;
            }
        }

        if (phoneNumber.getEditText() != null){
            String personPhoneNumber = phoneNumber.getEditText().getText().toString();
            if (personPhoneNumber.isEmpty()){
                phoneNumber.setError("Phone number field cannot be left empty");
                return false;
            } else if (!ValidationHelper.validatePhoneNumber(personPhoneNumber)) {
                phoneNumber.setError("Please provide a valid phone number starting with 0");
                return false;
            }
        }

        if(birthdate.getEditText() != null){
            String birthday = birthdate.getEditText().getText().toString();
            if (birthday.isEmpty()) {
                birthdate.setError("Birthdate cannot be left empty");
                return false;
            } else if (!ValidationHelper.validateBirthday(birthday)) {
                birthdate.setError("Please provide a valid birthdate");
                return false;
            }
        }

        if (height.getEditText() != null){
            String personHeight = height.getEditText().getText().toString();
            if (personHeight.isEmpty()){
                height.setError("Height cannot be left empty");
                return false;
            } else if (!ValidationHelper.validateHeight(personHeight)) {
                height.setError("Please input valid measurements");
                return false;
            }
        }
        return true;
    }
}
