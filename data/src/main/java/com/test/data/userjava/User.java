package com.test.data.userjava;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
public class User {
    @PrimaryKey
    @SerializedName("user_id")
    @Expose
    private final int userId;
    @SerializedName("display_name")
    @Expose
    private final String userName;
    @SerializedName("amount")
    @Expose
    private final String amount;
    @SerializedName("has_access")
    @Expose
    private final String hasAccess;

    public User(final int userId,
                @NonNull
                final String userName,
                final String amount,
                final String hasAccess) {
        this.userId = userId;
        this.userName = userName;
        this.amount = amount;
        this.hasAccess = hasAccess;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getAmount() {
        return amount;
    }

    public String getHasAccess() {
        return hasAccess;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", amount='" + amount + '\'' +
                ", hasAccess='" + hasAccess + '\'' +
                '}';
    }
}
