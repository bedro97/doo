package com.example.e_finance;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("NYNxaFlXron3LHV9OzDgTW9IHIgtGSsAHQoiVWBs")
                // if defined
                .clientKey("Pxek9WklPiXaCNdpkr77VXneMUaHHRUbnVlCbIg2")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
