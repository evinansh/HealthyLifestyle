package com.dessapplication.app.modules.notifikasicomunity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.notifikasicomunity.`data`.model.NotifikasiComunityModel
import org.koin.core.KoinComponent

class NotifikasiComunityVM : ViewModel(), KoinComponent {
  val notifikasiComunityModel: MutableLiveData<NotifikasiComunityModel> =
      MutableLiveData(NotifikasiComunityModel())

  var navArguments: Bundle? = null
}
