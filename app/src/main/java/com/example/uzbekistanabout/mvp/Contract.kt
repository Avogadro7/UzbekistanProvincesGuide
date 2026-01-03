package com.example.uzbekistanabout.mvp

interface Contract {

    interface model {
        fun getProvinces(): List<province>
    }

    interface view {
        fun setProvincesToViews(Provinces: List<province>)
    }

    interface presenter {
        fun setProvinces()
    }
}