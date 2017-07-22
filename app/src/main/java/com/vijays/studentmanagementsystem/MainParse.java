package com.vijays.studentmanagementsystem;

/**
 * Created by RAJUL on 7/17/2017.
 */

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseUser;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by RAJUL on 6/20/2017.
 */

public class MainParse extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("Xj5BfzKDMujSlrZ0r1XzzeEnOuBp5YpfQnRCnVuJ")
                .clientKey("92H2uWPGuF2LPp6Mu15cj2EWfmZAbsAbQaEkiL8p")
                .server("https://parseapi.back4app.com/")
                .build()
        );
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/OpenSansLight.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }
}
