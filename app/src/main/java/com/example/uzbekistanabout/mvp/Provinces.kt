package com.example.uzbekistanabout.mvp

import com.example.uzbekistanabout.R

object Provinces {
    fun getProvinces(): List<province> {
        return listOf(
            province("Toshkent", R.drawable.toshkent_activity1),
            province("Samarqand", R.drawable.samarqand_activity1),
            province("Buxoro", R.drawable.buxoro_activity1),
            province("Andijon", R.drawable.andijon_activity1),
            province("Surxondaryo", R.drawable.samarqand_activity1),
            province("Qashqadaryo", R.drawable.qashqadaryo_activity1),
            province("Surxondaryo", R.drawable.surxondaryo_activity1),
            province("Jizzax", R.drawable.jizzax_activity1),
            province("Xorazm", R.drawable.xorazm_activity1),
            province("Qoraqalpog'iston", R.drawable.qoraqalpogiston_activity1),
            province("Farg'ona", R.drawable.fargona_activity1),
            province("Namangan", R.drawable.namangan_activity1),
            )


    }
}