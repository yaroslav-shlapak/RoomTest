package com.test.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

//import com.test.domain.userjava.User;
//import com.test.domain.userkotlin.User;
//import com.test.data.userjava.User;
import com.test.data.userkotlin.User;

@Database(entities = {
        User.class
}, version = 1)

public abstract class ContentDatabase extends RoomDatabase {
    private static ContentDatabase instance;

    public static synchronized ContentDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room
                    .databaseBuilder(context.getApplicationContext(),
                            ContentDatabase.class,
                            "MetricInsightsContentDatabase")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }

    public abstract UserDao userDao();

}
