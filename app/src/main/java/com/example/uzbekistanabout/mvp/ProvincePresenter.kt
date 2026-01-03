package com.example.uzbekistanabout.mvp

class ProvincePresenter(
    val model: Contract.model,
    val view: Contract.view
): Contract.presenter {
    override fun setProvinces() {
      view.setProvincesToViews(model.getProvinces())
    }
}