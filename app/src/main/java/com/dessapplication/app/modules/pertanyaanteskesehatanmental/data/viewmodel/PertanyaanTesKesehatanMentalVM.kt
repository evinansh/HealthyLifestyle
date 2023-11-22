package com.dessapplication.app.modules.pertanyaanteskesehatanmental.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.pertanyaanteskesehatanmental.`data`.model.PertanyaanTesKesehatanMentalModel
import org.koin.core.KoinComponent

class PertanyaanTesKesehatanMentalVM : ViewModel(), KoinComponent {
  val pertanyaanTesKesehatanMentalModel: MutableLiveData<PertanyaanTesKesehatanMentalModel> =
      MutableLiveData(PertanyaanTesKesehatanMentalModel())

  var navArguments: Bundle? = null
}
