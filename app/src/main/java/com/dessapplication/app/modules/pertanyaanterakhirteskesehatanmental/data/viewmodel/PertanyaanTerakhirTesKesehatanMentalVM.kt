package com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmental.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.pertanyaanterakhirteskesehatanmental.`data`.model.PertanyaanTerakhirTesKesehatanMentalModel
import org.koin.core.KoinComponent

class PertanyaanTerakhirTesKesehatanMentalVM : ViewModel(), KoinComponent {
  val pertanyaanTerakhirTesKesehatanMentalModel:
      MutableLiveData<PertanyaanTerakhirTesKesehatanMentalModel> =
      MutableLiveData(PertanyaanTerakhirTesKesehatanMentalModel())

  var navArguments: Bundle? = null
}
