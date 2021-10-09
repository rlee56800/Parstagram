package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BVjZlw50Qb8tJXRvFHbkHpIla5WoLp8UdM0Lqz8W")
                .clientKey("9vzOkOUL4EGQ3bhjLu6wGbBAc7IVlu44AVoGNv47")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
