package com.test.domain.userkotlin

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity
data class User(@PrimaryKey
           @SerializedName("user_id")
           @Expose
           val userId: Int,
           @SerializedName("display_name")
           @Expose
           val userName: String,
           @SerializedName("amount")
           @Expose
           val amount: String,
           @SerializedName("has_access")
           @Expose
           val hasAccess: String)
