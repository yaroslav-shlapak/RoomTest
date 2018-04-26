package com.test.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.test.domain.userjava.User;
//import com.test.domain.userkotlin.User;
//import com.test.data.userjava.User;
//import com.test.data.userkotlin.User;

import io.reactivex.Flowable;

@Dao
public interface UserDao {

    @Query("SELECT * FROM User WHERE userId = :userId")
    Flowable<User> get(final int userId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(User user);

    @Query("DELETE FROM User")
    void deleteAll();
}
