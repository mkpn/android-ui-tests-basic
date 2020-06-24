package com.google.samples.apps.sunflower.pageobject

class PlantListPage {
    // 指定したplantNameのPlant Detail画面に遷移する
    fun showPlantDetail(plantName: String): PlantDetailPage {
        return PlantDetailPage()
    }

    // My Garden画面に遷移する
    fun goBackMyGarden(): MyGardenPage {
        return MyGardenPage()
    }
}