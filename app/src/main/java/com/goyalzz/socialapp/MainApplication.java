package com.goyalzz.socialapp;

import android.app.Application;
import android.support.multidex.MultiDexApplication;

import com.facebook.FacebookSdk;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;

/**
 * Created by Vicky on 31-10-2015.
 */
public class MainApplication extends MultiDexApplication {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "89oyKlZg7VpEEpPbAVtmoqj6K";
    private static final String TWITTER_SECRET = "ESBDEv8zJRfHOoa7h2J3UKZfiQoRU38qYsb8mhW9clwWzaOy81";


    @Override
    public void onCreate() {
        super.onCreate();
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        FacebookSdk.sdkInitialize(getApplicationContext());
    }
}
