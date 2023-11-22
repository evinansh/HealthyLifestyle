package com.dessapplication.app.modules.teskesehatan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.teskesehatan.`data`.model.TesKesehatanModel
import org.koin.core.KoinComponent

class TesKesehatanVM : ViewModel(), KoinComponent {
  val tesKesehatanModel: MutableLiveData<TesKesehatanModel> = MutableLiveData(TesKesehatanModel())

  var navArguments: Bundle? = null
}
