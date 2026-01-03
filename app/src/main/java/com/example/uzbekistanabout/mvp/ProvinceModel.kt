package com.example.uzbekistanabout.mvp

class ProvinceModel: Contract.model {
    override fun getProvinces(): List<province> =
        Provinces.getProvinces()

}