package com.example.user_info.social;

import com.example.user_info.user.User;

public class ShareHelper {
    public static String buildShareInfo(User user) {
        return user.getName() + "'s Information\n" + "Email: " + user.getEmail() +"\n Phone number: "
                 + user.getPhoneNumber()+"\n Birthday: " + user.getBirthday() + "\n Height: " + user.getHeight();
    }
}
