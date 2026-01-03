package com.example.uzbekistanabout

import android.app.Activity
import android.content.res.Configuration
import java.util.Locale


object MultiLanguageActivity {


    fun setLocale(activity: Activity, languageCode: String?) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val resources = activity.resources
        val config: Configuration = resources.configuration
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)







    }
}