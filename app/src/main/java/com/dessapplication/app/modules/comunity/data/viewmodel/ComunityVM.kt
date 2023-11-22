package com.dessapplication.app.modules.comunity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.comunity.`data`.model.ComunityModel
import org.koin.core.KoinComponent

class ComunityVM : ViewModel(), KoinComponent {
  val comunityModel: MutableLiveData<ComunityModel> = MutableLiveData(ComunityModel())

  var navArguments: Bundle? = null
}
