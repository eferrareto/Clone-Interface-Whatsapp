package com.example.whatsappclone.model

import android.widget.ImageView
import androidx.annotation.DrawableRes

data class DataClassRecycler(
    @DrawableRes val img : Int,
    val name : String,
    val txt : String
)
