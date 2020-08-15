package com.hyper.hy_library.repository

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.format.DateTimeFormatter

interface Repository {
    @RequiresApi(Build.VERSION_CODES.O)
    fun getDate(){
        var now = LocalDate.now()
        var Strnow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
    }
}