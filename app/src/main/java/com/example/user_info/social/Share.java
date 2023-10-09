package com.example.user_info.social;

import android.content.Intent;

import com.example.user_info.user.User;

public class Share {
    public static Intent shareUserInfo(User user){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, user.getName());
        intent.putExtra(Intent.EXTRA_TEXT, ShareHelper.buildShareInfo(user));
        return intent;
    }
}
