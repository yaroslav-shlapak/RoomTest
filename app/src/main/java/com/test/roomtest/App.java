package com.test.roomtest;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AppComponent appComponent = DaggerAppComponent
                .builder()
                .application(this)
                .appModule(new AppModule(this))
                .build();

        appComponent.inject(this);
    }
}
