package com.google.samples.apps.sunflower.pageobject

class PlantDetailPage {
    // 表示されている植物を植える
    fun addToMyGarden(): PlantDetailPage {
        return PlantDetailPage()
    }

    // Plant list画面に遷移する
    fun goBackPlantList(): PlantListPage {
        return PlantListPage()
    }
}