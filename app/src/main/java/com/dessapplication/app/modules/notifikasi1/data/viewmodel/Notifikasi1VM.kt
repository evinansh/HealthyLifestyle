package com.dessapplication.app.modules.notifikasi1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.notifikasi1.`data`.model.Notifikasi1Model
import org.koin.core.KoinComponent

class Notifikasi1VM : ViewModel(), KoinComponent {
  val notifikasi1Model: MutableLiveData<Notifikasi1Model> = MutableLiveData(Notifikasi1Model())

  var navArguments: Bundle? = null
}
