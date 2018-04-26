package com.test.roomtest;

import android.content.Context;

import com.test.data.ContentDatabase;
import com.test.data.UserDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RoomModule {

    @Singleton
    @Provides
    ContentDatabase providesAppDatabase(Context applicationContext) {
        return ContentDatabase.getInstance(applicationContext);
    }

    @Singleton
    @Provides
    UserDao provideUserDao(ContentDatabase contentDatabase) {
        return contentDatabase.userDao();
    }

}
