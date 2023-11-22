package com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmentalone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmentalone.`data`.model.PertanyaanTerakhirTesKesehatanMentalOneModel
import org.koin.core.KoinComponent

class PertanyaanTerakhirTesKesehatanMentalOneVM : ViewModel(), KoinComponent {
  val pertanyaanTerakhirTesKesehatanMentalOneModel:
      MutableLiveData<PertanyaanTerakhirTesKesehatanMentalOneModel> =
      MutableLiveData(PertanyaanTerakhirTesKesehatanMentalOneModel())

  var navArguments: Bundle? = null
}
