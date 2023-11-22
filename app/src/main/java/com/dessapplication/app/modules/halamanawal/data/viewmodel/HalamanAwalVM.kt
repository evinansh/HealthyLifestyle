package com.dessapplication.app.modules.halamanawal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.halamanawal.`data`.model.HalamanAwalModel
import org.koin.core.KoinComponent

class HalamanAwalVM : ViewModel(), KoinComponent {
  val halamanAwalModel: MutableLiveData<HalamanAwalModel> = MutableLiveData(HalamanAwalModel())

  var navArguments: Bundle? = null
}
