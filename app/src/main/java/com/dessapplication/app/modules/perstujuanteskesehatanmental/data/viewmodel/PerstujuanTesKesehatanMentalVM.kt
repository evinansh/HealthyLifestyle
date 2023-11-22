package com.dessapplication.app.modules.perstujuanteskesehatanmental.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.perstujuanteskesehatanmental.`data`.model.PerstujuanTesKesehatanMentalModel
import org.koin.core.KoinComponent

class PerstujuanTesKesehatanMentalVM : ViewModel(), KoinComponent {
  val perstujuanTesKesehatanMentalModel: MutableLiveData<PerstujuanTesKesehatanMentalModel> =
      MutableLiveData(PerstujuanTesKesehatanMentalModel())

  var navArguments: Bundle? = null
}
