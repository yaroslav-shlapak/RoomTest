package com.test.roomtest;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    Context providesApplicationContext() {
        return mApplication.getApplicationContext();
    }

}
