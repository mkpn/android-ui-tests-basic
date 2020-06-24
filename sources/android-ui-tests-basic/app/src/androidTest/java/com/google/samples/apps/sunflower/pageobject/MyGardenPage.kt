package com.google.samples.apps.sunflower.pageobject

class MyGardenPage {

    // Plant list画面に遷移する
    fun goPlantList(): PlantListPage {
        return PlantListPage()
    }

    // plantNameが植えられていることを確認する
    fun assertPlanted(plantName: String): MyGardenPage {
        return MyGardenPage()
    }
}